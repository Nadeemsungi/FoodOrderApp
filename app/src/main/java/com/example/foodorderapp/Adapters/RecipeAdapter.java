package com.example.foodorderapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.FoodOrderList;
import com.example.foodorderapp.Models.RecipeModel;
import com.example.foodorderapp.R;
import com.example.foodorderapp.databinding.ActivityOrderDetailBinding;
import com.example.foodorderapp.orderDetailActivity;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {

    ArrayList<RecipeModel>list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
         final RecipeModel model=list.get(position);
        holder.foodImage.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(context, orderDetailActivity.class);
                s.putExtra("image",model.getImage());
                s.putExtra("name",model.getName());
                s.putExtra("price",model.getPrice());
                s.putExtra("description",model.getDescription());
                context.startActivity(s);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView foodImage;
        TextView name,price,description;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage=itemView.findViewById(R.id.imageView);
            name=itemView.findViewById(R.id.Name);
            price=itemView.findViewById(R.id.price);
            description=itemView.findViewById(R.id.description);
        }
    }

}
