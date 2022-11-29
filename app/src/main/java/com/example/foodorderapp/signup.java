package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sign_up=(Button) findViewById(R.id.btn3);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n =new Intent(signup.this,MainActivity.class);
                startActivity(n);
                Toast.makeText(signup.this, "Move to main activity", Toast.LENGTH_SHORT).show();
            }
        });
        getSupportActionBar().hide();
    }
}