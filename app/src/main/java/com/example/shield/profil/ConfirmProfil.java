package com.example.shield.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shield.R;
import com.example.shield.signin.SignIn;
import com.example.shield.signin.SigninHome;

public class ConfirmProfil extends AppCompatActivity {

    private Button continueButton, modifyButton, addNewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_profil);

        continueButton = findViewById(R.id.continueButton);
        modifyButton = findViewById(R.id.modifyButton);
        addNewButton = findViewById(R.id.addNewProfil);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmProfil.this, AddChild.class);
                startActivity(intent);
                finish();
            }

        });

        modifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmProfil.this, ConfirmProfil.class);
                startActivity(intent);
                finish();
            }

        });
        addNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmProfil.this, Addprofil.class);
                startActivity(intent);
                finish();
            }

        });

    }
}