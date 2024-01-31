package com.example.shield.bienvenueANDadddevice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shield.R;
import com.example.shield.profil.Addprofil;

public class AddDevice extends AppCompatActivity {

    private Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_device);

        skip = findViewById(R.id.skipButton);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddDevice.this, Addprofil.class);
                startActivity(intent);
                finish();
            }

        });
    }
}