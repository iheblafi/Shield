package com.example.shield.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shield.R;
import com.example.shield.database.DatabaseHelper;
import com.example.shield.databinding.ActivityAddChildBinding;
import com.example.shield.databinding.ActivityAddprofilBinding;

public class AddChild extends AppCompatActivity {

    ActivityAddChildBinding binding;
    DatabaseHelper databaseHelper;

    private Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddChildBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName= binding.firstname.getText().toString();
                String lastName = binding.lastname.getText().toString();
                String gender = binding.gender.getText().toString();
                String dateBirth = binding.birthdate.getText().toString();
                if(firstName.equals("")||lastName.equals("")||gender.equals("")||dateBirth.equals(""))
                    Toast.makeText(AddChild.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                else{
                    Boolean insertC = databaseHelper.insertDataChild(firstName, lastName, gender, dateBirth);
                    if(insertC == true){
                        Toast.makeText(AddChild.this, "added Successfully!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),CongratsW.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(AddChild.this, "adding Failed!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



        skip = findViewById(R.id.skipButton);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddChild.this, CongratsW.class);
                startActivity(intent);
                finish();
            }

        });
    }
}