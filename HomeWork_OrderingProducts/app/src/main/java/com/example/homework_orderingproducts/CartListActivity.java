package com.example.homework_orderingproducts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.homework_orderingproducts.helper.ManagementCart;

public class CartListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;
    private ManagementCart managementCart;
    TextView totalFeeTxt, taxTxt, deliveryTxt, totalTxt, emptyTxt;
    private double tax;
    private ScrollView scrollView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);

        managementCart = new ManagementCart(this);
        
        initView();
    }

    private void initView() {
        recyclerViewList = findViewById(R.id.recyclerView);
        totalFeeTxt = findViewById(R.id.text_totalFee);
        taxTxt = findViewById(R.id.text_tax);
        deliveryTxt = findViewById(R.id.text_delivery);
        totalTxt = findViewById(R.id.text_total);
        emptyTxt = findViewById(R.id.text_empty);
        scrollView = findViewById(R.id.scrollView3);
    }

    private void initList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewList.setLayoutManager(linearLayoutManager);

        recyclerViewList.setAdapter(adapter);

    }
}