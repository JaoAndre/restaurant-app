package com.example.projetorestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.R;

public class MainOrderItemAdapter extends RecyclerView.Adapter<MainOrderItemAdapter.MainOrderItemAdapterHolder> {
    @NonNull
    @Override
    public MainOrderItemAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_order, parent, false);
        return new MainOrderItemAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainOrderItemAdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class MainOrderItemAdapterHolder extends RecyclerView.ViewHolder {
        public MainOrderItemAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}