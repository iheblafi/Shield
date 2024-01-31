package com.example.shield.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String databaseName = "SignLog.db";


    public DatabaseHelper(@Nullable Context context) {
        super(context, "SignLog.db", null, 3);
    }
    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create Table users(email TEXT primary key, password TEXT, username TEXT)");
        MyDatabase.execSQL("create Table profiles(id INTEGER primary key AUTOINCREMENT, socialNP TEXT, socialNUS TEXT, socialNUR TEXT)");
        MyDatabase.execSQL("create Table childs(id INTEGER primary key AUTOINCREMENT, firstName TEXT, lastName TEXT, gender TEXT, dateBirth TEXT)");

    }


    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");
        MyDB.execSQL("drop Table if exists profiles");
        MyDB.execSQL("drop Table if exists childs");
        onCreate(MyDB);
    }
    public Boolean insertData(String username,String email, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("email", email);
        contentValues.put("password", password);
        long result = MyDatabase.insert("users", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean insertDataProfil(String socialNP, String socialNUS, String socialNUR ){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("socialNP", socialNP);
        contentValues.put("socialNUS", socialNUS);
        contentValues.put("socialNUR", socialNUR);
        long result = MyDatabase.insert("profiles", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean insertDataChild(String firstName, String lastName, String gender, String dateBirth ){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("firstName", firstName);
        contentValues.put("lastName", lastName);
        contentValues.put("gender", gender);
        contentValues.put("dateBirth", dateBirth);
        long result = MyDatabase.insert("childs", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Boolean checkEmail(String email){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where email = ?", new String[]{email});
        if(cursor.getCount() > 0) {
            return true;
        }else {
            return false;
        }
    }
    public Boolean checkEmailPassword(String email, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where email = ? and password = ?", new String[]{email, password});
        if (cursor.getCount() > 0) {
            return true;
        }else {
            return false;
        }
    }
}

