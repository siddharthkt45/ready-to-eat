package com.e.untammeddragons;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<String> itemList;
    List<Integer> priceList;
    List<Integer> imageList;

    public MyAdapter(List<String> itemList, List<Integer> priceList, List<Integer> imageList) {
        this.itemList = itemList;
        this.priceList = priceList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemName_txt.setText(itemList.get(position));
        holder.price_txt.setText(String.valueOf(priceList.get(position)));
        holder.imgView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        TextView itemName_txt, price_txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imageView);
            itemName_txt = itemView.findViewById(R.id.itemName);
            price_txt = itemView.findViewById(R.id.price);
        }
    }

}
