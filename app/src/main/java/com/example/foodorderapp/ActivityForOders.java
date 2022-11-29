package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.foodorderapp.Adapters.OrderAdapter;
import com.example.foodorderapp.DataBaseClass.DBHelper;
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

        DBHelper helper=new DBHelper(this);
        ArrayList<OrderModel>list=helper.getOrders();

        OrderAdapter orderadapter =new OrderAdapter(list,this);
        binding.orderRecyclerView.setAdapter(orderadapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(linearLayoutManager);


    }
}