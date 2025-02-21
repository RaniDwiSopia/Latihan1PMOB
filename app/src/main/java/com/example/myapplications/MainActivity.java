package com.example.myapplications;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button btnLogin = findViewById(R.id.btnLogin);
        EditText UsernameText = findViewById(R.id.UsernameText);
        EditText PasswordText = findViewById(R.id.PasswordText);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = UsernameText.getText().toString();
                String Password = PasswordText.getText().toString();

                if (Username.isEmpty() || Password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Username dan Password tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                } else {
                    if (Username.equals("Rani") && Password.equals("7825")) {
                        Toast.makeText(MainActivity.this, "Login Succes", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
    }
}
