package com.example.projetorestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.R;

public class TablesItemAdapter extends RecyclerView.Adapter<TablesItemAdapter.TablesItemAdapterHolder> {

    @NonNull
    @Override
    public TablesItemAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tables, parent, false);
        return new TablesItemAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TablesItemAdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class TablesItemAdapterHolder extends RecyclerView.ViewHolder {
        public TablesItemAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}