package com.example.silver_hacktrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
EditText nombre;
EditText nit;
EditText descripcion;
EditText telefono;
EditText url;
Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
}
