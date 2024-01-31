package com.example.shield.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shield.R;

public class CongratsWEnd extends AppCompatActivity {

    private Button goToDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_wend);

        goToDashboard = findViewById(R.id.goTodashboard);
        goToDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CongratsWEnd.this, CongratsWEnd.class);
                startActivity(intent);
                finish();
            }

        });
    }
}