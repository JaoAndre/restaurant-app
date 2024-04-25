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

import com.example.projetorestaurante.adapter.OrdersItemAdapter;

public class OrdersScreen extends AppCompatActivity {

    private ImageButton ordersTablesButton, ordersHomeButton;
    private RecyclerView ordersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orders_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ordersTablesButton = findViewById(R.id.ordersTablesButton);
        ordersHomeButton = findViewById(R.id.ordersHomeButton);
        ordersRecyclerView = findViewById(R.id.ordersRecyclerView);

        ordersRecyclerView.setAdapter(new OrdersItemAdapter());

        ordersTablesButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, TablesScreen.class);
            startActivity(intent);

            finish();
        });

        ordersHomeButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            finish();
        });
    }
}