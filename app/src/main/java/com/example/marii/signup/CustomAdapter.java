package com.example.marii.signup;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<SingleRow> arrayList;
    Context context;

    CustomAdapter(@NonNull Context context) {
        arrayList = new ArrayList<>();
        Resources resources = context.getResources();

        this.context = context;
    }
    @Override
    public int getCount(){
        return arrayList.size();
    }

    @Override
    public Object getItem(int i){
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @NonNull
    public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.custom_listview, viewGroup, false);

        ImageView icon = (ImageView) row.findViewById(R.id.spinner_image);
        TextView name = (TextView) row.findViewById(R.id.menu_item);
        TextView price = (TextView) row.findViewById(R.id.menu_item_price);
        TextView quantity = (TextView)row.findViewById(R.id.menu_quantity);

        SingleRow temp_obj = arrayList.get(i);
        name.setText(temp_obj.name);
        price.setText(temp_obj.price);
        quantity.setText(temp_obj.quantity);
        icon.setImageResource(temp_obj.image);

        return row;
    }
}
