package com.example.projetorestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.R;

public class OrdersItemAdapter extends RecyclerView.Adapter<OrdersItemAdapter.OrdersItemAdapterHolder> {
    @NonNull
    @Override
    public OrdersItemAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orders, parent, false);
        return new OrdersItemAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersItemAdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class OrdersItemAdapterHolder extends RecyclerView.ViewHolder {
        public OrdersItemAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}