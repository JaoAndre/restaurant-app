package com.example.projetorestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.R;

public class InnerAdapter extends RecyclerView.Adapter<InnerAdapter.InnerAdapterHolder> {
    @NonNull
    @Override
    public InnerAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orders_order, parent, false);
        return new InnerAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerAdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class InnerAdapterHolder extends RecyclerView.ViewHolder {
        public InnerAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}