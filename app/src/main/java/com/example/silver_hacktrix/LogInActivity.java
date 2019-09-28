package com.example.silver_hacktrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {

    Button entrar;
    Button regi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        entrar = findViewById(R.id.button3);
        regi = findViewById(R.id.button4);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ong = new Intent(LogInActivity.this, CrearPublicacion.class);
                startActivity(ong);
            }
        });

        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ong = new Intent(LogInActivity.this, Registro.class);
                startActivity(ong);
            }
        });
    }

}
