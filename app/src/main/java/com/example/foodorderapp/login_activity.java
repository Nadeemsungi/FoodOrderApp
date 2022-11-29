package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {
    Button login;
    TextView txt_login , Arzi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button) findViewById(R.id.btn4forlogin);
        txt_login=(TextView) findViewById(R.id.txtlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(login_activity.this,FoodOrderList.class);
                startActivity(x);
                Toast.makeText(login_activity.this, "Move to FoodOrderList activity", Toast.LENGTH_SHORT).show();
            }
        });
        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(login_activity.this,signup.class);
                startActivity(n);
                Toast.makeText(login_activity.this, "Move to SignUp activity", Toast.LENGTH_SHORT).show();
            }
        });
        getSupportActionBar().hide();
    }
}