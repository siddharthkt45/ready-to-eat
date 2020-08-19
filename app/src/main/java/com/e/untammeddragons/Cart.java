package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Cart extends AppCompatActivity {

    RecyclerView recyclerView;
    String itemName[];
    int price[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        itemName = getResources().getStringArray(R.array.food_items);
        price = getResources().getIntArray(R.array.item_price);

        recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(this, itemName, price);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}