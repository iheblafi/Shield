package com.example.shield.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shield.R;
import com.example.shield.bienvenueANDadddevice.AddDevice;
import com.example.shield.bienvenueANDadddevice.Bienvenue;

public class CongratsW extends AppCompatActivity {

    private Button addNew, continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_w);

        addNew = findViewById(R.id.addChild);
        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CongratsW.this, AddChild.class);
                startActivity(intent);
                finish();
            }

        });
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CongratsW.this, CongratsWEnd.class);
                startActivity(intent);
                finish();
            }

        });
    }
}