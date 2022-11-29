package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorderapp.DataBaseClass.DBHelper;
import com.example.foodorderapp.databinding.ActivityOrderDetailBinding;

public class orderDetailActivity extends AppCompatActivity {
        ActivityOrderDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
       final int image=getIntent().getIntExtra("image",0);
       final int price=Integer.parseInt(getIntent().getStringExtra("price"));
       final String name=getIntent().getStringExtra("name");
       final String description=getIntent().getStringExtra("description");

        binding.detailImage.setImageResource(image);
        binding.priceLbl.setText(String.format("%d",price));
        binding.detailFoodName.setText(name);
        binding.detailDescription.setText(description);

        getSupportActionBar().hide();

        DBHelper helper=new DBHelper(this);
        binding.insertOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               boolean isInserted= helper.insertOrder(
                        binding.detailEditTextName.getText().toString(),
                        binding.detailPhoneNo.getText().toString(),
                        price,
                        image,
                        name,
                        description,
                        Integer.parseInt(binding.detailQuantity.getText().toString())
                        );
               if(isInserted)
                   Toast.makeText(orderDetailActivity.this, "Data Success", Toast.LENGTH_SHORT).show();
               else
                   Toast.makeText(orderDetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}