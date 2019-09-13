package com.example.marii.signup;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Dialog myDialog;
    Context context;
    List<Food> data;

    public RecyclerViewAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(v);

        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.dialog_food);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        myViewHolder.item_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, "Test click" + String.valueOf(myViewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();

                final TextView selectedFoodName = (TextView)myDialog.findViewById(R.id.selected_food_name);
                final TextView selectedFoodPrice = (TextView)myDialog.findViewById(R.id.selected_food_price);
                final ImageView selectedFoodImage = (ImageView)myDialog.findViewById(R.id.selected_food_image);
                final EditText selectedFoodQuantity = (EditText)myDialog.findViewById(R.id.selected_food_quantity);

                selectedFoodName.setText(data.get(myViewHolder.getAdapterPosition()).getName());
                selectedFoodPrice.setText(data.get(myViewHolder.getAdapterPosition()).getPrice());
                selectedFoodImage.setImageResource(data.get(myViewHolder.getAdapterPosition()).getPhoto());

                //int foodQuantity = Integer.parseInt(selectedFoodQuantity.getText().toString());

                Button add = (Button)myDialog.findViewById(R.id.add_to_cart);
                add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
                        //Bundle bundle = new Bundle();
                    }
                });


                myDialog.show();
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        holder.foodName.setText(data.get(i).getName());
        holder.foodRecipe.setText(data.get(i).getRecipe());
        holder.foodPrice.setText(data.get(i).getPrice());
        holder.foodImage.setImageResource(data.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_food;
        private TextView foodName;
        private TextView foodRecipe;
        private TextView foodPrice;
        private ImageView foodImage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_food = (LinearLayout)itemView.findViewById(R.id.food_item);
            foodName = (TextView)itemView.findViewById(R.id.breakfast_name);
            foodRecipe = (TextView)itemView.findViewById(R.id.breakfast_recipe);
            foodPrice = (TextView)itemView.findViewById(R.id.breakfast_price);
            foodImage = (ImageView) itemView.findViewById(R.id.breakfast_image);
        }
    }
}
