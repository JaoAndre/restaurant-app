package com.example.projetorestaurante;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginScreen extends AppCompatActivity {
    private EditText loginEditUser, loginEditPassword;
    private Button loginConnectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loginEditUser = findViewById(R.id.loginEditUser);
        loginEditPassword = findViewById(R.id.loginEditPassword);
        loginConnectButton = findViewById(R.id.loginConnectButton);

        loginConnectButton.setOnClickListener(view -> checkLogin());
    }

    public void checkLogin() {
        String username = loginEditUser.getText().toString();
        String password = loginEditPassword.getText().toString();

        if (username.equals("admin") && password.equals("12345")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            finish();
        } else {
            Toast.makeText(this, "Login incorreto.", Toast.LENGTH_LONG).show();
        }
    }
}