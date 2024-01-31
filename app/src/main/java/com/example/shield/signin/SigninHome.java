package com.example.shield.signin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.shield.R;

public class SigninHome extends AppCompatActivity {

    private CardView cardView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_home);


        textView = findViewById(R.id.noaccount);
        cardView = findViewById(R.id.cardviewemail);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninHome.this, SignIn.class);
                startActivity(intent);
                finish();
                }

        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninHome.this, SignUp.class);
                startActivity(intent);
                finish();
            }

        });
    }
    }
