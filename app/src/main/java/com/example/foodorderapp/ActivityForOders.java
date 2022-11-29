package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.foodorderapp.Adapters.OrderAdapter;
import com.example.foodorderapp.Models.OrderModel;
import com.example.foodorderapp.databinding.ActivityForOdersBinding;

import java.util.ArrayList;

public class ActivityForOders extends AppCompatActivity {
        ActivityForOdersBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityForOdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<OrderModel>list=new ArrayList<>();
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));
        list.add(new OrderModel(R.drawable.food5,"Cheese Burger","4","4514445"));

        OrderAdapter orderadapter =new OrderAdapter(list,this);
        binding.orderRecyclerView.setAdapter(orderadapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(linearLayoutManager);


    }
}