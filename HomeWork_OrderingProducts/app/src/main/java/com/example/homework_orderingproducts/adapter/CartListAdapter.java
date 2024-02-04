package com.example.homework_orderingproducts.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework_orderingproducts.domain.FoodDomain;
import com.example.homework_orderingproducts.helper.ManagementCart;
import com.example.homework_orderingproducts.service.ChangeNumberItemListener;

import java.util.ArrayList;

public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.ViewHolder> {
    private ArrayList<FoodDomain> foodDomains;
    private ManagementCart managementCart;
    private ChangeNumberItemListener changeNumberItemListener;

    public CartListAdapter(ArrayList<FoodDomain> foodDomains, ManagementCart managementCart, ChangeNumberItemListener changeNumberItemListener) {
        this.foodDomains = foodDomains;
        this.managementCart = managementCart;
        this.changeNumberItemListener = changeNumberItemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foodDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, feeEachItem;
        ImageView pic, plusItem, minusItem;
        TextView totalEachItem, num;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
