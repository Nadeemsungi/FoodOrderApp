package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.RecipeAdapter;
import com.example.foodorderapp.Models.RecipeModel;
import com.example.foodorderapp.databinding.ActivityFoodOrderListBinding;

import java.util.ArrayList;

public class FoodOrderList extends AppCompatActivity {

        ActivityFoodOrderListBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFoodOrderListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<RecipeModel>list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food1,"Burger","5","Chicken burger with Extra cheese"));
        list.add(new RecipeModel(R.drawable.food2,"Pizza","7","The offer to download the coupons ends thursday may 28"));
        list.add(new RecipeModel(R.drawable.food3,"Pasta","8","Burger o clock is available to satiate your hunger"));
        list.add(new RecipeModel(R.drawable.food4,"Shawarma","9","Meaty potobello mushrooms makes for you"));
        list.add(new RecipeModel(R.drawable.food5,"Zinger","12","Chicken burger with Fries"));
        list.add(new RecipeModel(R.drawable.food6,"Rotti","31","Chicken burger with Fries"));
        list.add(new RecipeModel(R.drawable.food7,"cheese","14","Chicken burger with Fries"));
        list.add(new RecipeModel(R.drawable.food8,"Chicken","25","Chicken burger with Fries"));

        RecipeAdapter adapter= new RecipeAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}