package com.example.projetorestaurante;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestaurante.adapter.TablesItemAdapter;

public class TablesScreen extends AppCompatActivity {

    private ImageButton tablesHomeButton, tablesOrdersButton;
    private RecyclerView tablesRecyclerView;
    private TablesItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tables_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tablesHomeButton = findViewById(R.id.tablesHomeButton);
        tablesOrdersButton = findViewById(R.id.tablesOrdersButton);
        tablesRecyclerView = findViewById(R.id.tablesRecyclerView);

        adapter = new TablesItemAdapter();
        tablesRecyclerView.setAdapter(adapter);

        tablesHomeButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            finish();
        });

        tablesOrdersButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, OrdersScreen.class);
            startActivity(intent);

            finish();
        });
    }
}