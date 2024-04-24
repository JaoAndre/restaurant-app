package com.example.projetorestaurante.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.R;

public class MainTableItemAdapter extends RecyclerView.Adapter<MainTableItemAdapter.MainTableItemAdapterHolder> {
    @NonNull
    @Override
    public MainTableItemAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_table, parent, false);
        return new MainTableItemAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainTableItemAdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class MainTableItemAdapterHolder extends RecyclerView.ViewHolder {
        public MainTableItemAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}