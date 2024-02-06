package com.example.homework_orderingproducts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.homework_orderingproducts.adapter.CategoryAdapter;
import com.example.homework_orderingproducts.adapter.FoodAdapter;
import com.example.homework_orderingproducts.domain.CategoryDomain;
import com.example.homework_orderingproducts.domain.FoodDomain;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter, adapter2;
private RecyclerView recyclerViewCategoryList, recyclerViewFoodList;
private ConstraintLayout orderBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        recyclerViewCategory();
        recyclerViewFood();
        bottonNavigation();
    }

    private void bottonNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        orderBtn = findViewById(R.id.orderBtn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this, CartListActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }
        });

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this, RestaurantsActivity.class));
            }
        });
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza", "cat_1"));
        category.add(new CategoryDomain("Burger", "cat_2"));
        category.add(new CategoryDomain("Hotdog", "cat_3"));
        category.add(new CategoryDomain("Drink", "cat_4"));
        category.add(new CategoryDomain("Donut", "cat_5"));

        adapter = new CategoryAdapter(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewFood() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView2);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Pepperoni pizza", "pop_1", "slices pepperoni, mozzerolo chease, gresh oregano", 499.99));
        foodList.add(new FoodDomain("Chease burger", "pop_2", "bun, cheese, tomato, lettuce, pickle", 249.99));
        foodList.add(new FoodDomain("Vegetable pizza", "pop_3", "olives, onion, tomato, mozzerolo chease", 260.99));
        foodList.add(new FoodDomain("Coca Cola", "cola", "Coca Cola", 86.99));
        foodList.add(new FoodDomain("Fanta", "fanta", "Fanta", 84.99));
        foodList.add(new FoodDomain("Sprite", "sprite", "Sprite", 84.99));
        foodList.add(new FoodDomain("Hotdog", "hotdog", "bun with hot sausage or sausage seasoned with ketchup, mayonnaise, mustard and vegetables", 239.24));
        foodList.add(new FoodDomain("Donut", "donut", "donut with strawberry filling, pink glaze and colored sprinkles", 50.35));

        adapter2 = new FoodAdapter(foodList);
        recyclerViewCategoryList.setAdapter(adapter2);

    }
}