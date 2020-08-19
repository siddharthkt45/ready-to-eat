package com.e.untammeddragons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context ct;
    String itemName[];
    int price[];

    public MyAdapter(Context ct, String itemName[], int price[]) {
        this.ct = ct;
        this.itemName = itemName;
        this.price = price;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ct);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemName_txt.setText(itemName[position]);
        holder.itemPrice_txt.setText("Rs. " + price[position]);
    }

    @Override
    public int getItemCount() {
        return price.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView itemName_txt, itemPrice_txt;
        Button add;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName_txt = itemView.findViewById(R.id.itemName);
            itemPrice_txt = itemView.findViewById(R.id.itemPrice);
            add = itemView.findViewById(R.id.btnAdd);
        }
    }
}
