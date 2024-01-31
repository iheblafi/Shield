package com.example.shield.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shield.R;
import com.example.shield.bienvenueANDadddevice.AddDevice;
import com.example.shield.bienvenueANDadddevice.Bienvenue;
import com.example.shield.database.DatabaseHelper;
import com.example.shield.databinding.ActivityAddprofilBinding;

public class Addprofil extends AppCompatActivity {

    private Button skip;

    ActivityAddprofilBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddprofilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String socialNP= binding.socialNP.getText().toString();
                String socialNUS = binding.socialNUS.getText().toString();
                String socialNUR = binding.socialNUR.getText().toString();
                if(socialNP.equals("")||socialNUS.equals("")||socialNUR.equals(""))
                    Toast.makeText(Addprofil.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                else{
                    Boolean insertP = databaseHelper.insertDataProfil(socialNP, socialNUR, socialNUS);
                    if(insertP == true){
                                Toast.makeText(Addprofil.this, "added Successfully!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),ConfirmProfil.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(Addprofil.this, "adding Failed!", Toast.LENGTH_SHORT).show();
                            }



                }
            }
        });

        skip = findViewById(R.id.skipButton);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Addprofil.this, ConfirmProfil.class);
                startActivity(intent);
                finish();
            }

        });
    }
}