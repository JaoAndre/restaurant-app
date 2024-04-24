package com.example.projetorestaurante;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.adapter.MainOrderItemAdapter;
import com.example.projetorestaurante.adapter.MainTableItemAdapter;

public class MainActivity extends AppCompatActivity {

    private ImageButton homeTablesButton, homeOrdersButton;
    private RecyclerView mainOrdersRecyclerView, mainTablesRecyclerView;
    private MainOrderItemAdapter orderAdapter;
    private MainTableItemAdapter tableAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        homeTablesButton = findViewById(R.id.homeTablesButton);
        homeOrdersButton = findViewById(R.id.homeOrdersButton);
        mainOrdersRecyclerView = findViewById(R.id.mainOrdersRecyclerView);
        mainTablesRecyclerView = findViewById(R.id.mainTablesRecyclerView);

        orderAdapter = new MainOrderItemAdapter();
        mainOrdersRecyclerView.setAdapter(orderAdapter);

        tableAdapter = new MainTableItemAdapter();
        mainTablesRecyclerView.setAdapter(tableAdapter);

        homeTablesButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, TablesScreen.class);
            startActivity(intent);

            finish();
        });

        homeOrdersButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, OrdersScreen.class);
            startActivity(intent);

            finish();
        });
    }
}