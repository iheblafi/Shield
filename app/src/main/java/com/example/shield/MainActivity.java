package com.example.shield;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shield.bienvenueANDadddevice.Bienvenue;
import com.example.shield.profil.AddChild;
import com.example.shield.signin.SignUp;
import com.example.shield.signin.SigninHome;

public class MainActivity extends AppCompatActivity {

    private CardView cardViewP;
    private CardView cardViewC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewP = findViewById(R.id.cardViewP);
        cardViewC = findViewById(R.id.cardViewC);

        cardViewP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bienvenue.class);
                startActivity(intent);
                finish();
            }

        });

        cardViewC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddChild.class);
                startActivity(intent);
                finish();
            }

        });

    }
}