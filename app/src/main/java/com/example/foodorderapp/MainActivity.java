package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_reg, buttonlogin ;
    TextView skip;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reg=(Button) findViewById(R.id.btnreg);
        buttonlogin=(Button) findViewById(R.id.btnlogin);
//        skip=(TextView) findViewById(R.id.Skip);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,signup.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Move to register", Toast.LENGTH_SHORT).show();
            }
        });
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z=new Intent(MainActivity.this,login_activity.class);
                startActivity(z);
                Toast.makeText(MainActivity.this, "Move to Login activity", Toast.LENGTH_SHORT).show();
            }
        });

        getSupportActionBar().hide();
    }
}