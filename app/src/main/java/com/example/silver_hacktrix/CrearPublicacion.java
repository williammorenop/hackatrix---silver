package com.example.silver_hacktrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class CrearPublicacion extends AppCompatActivity {
    ImageButton agregarImg;
EditText Titulo;
    EditText lugar;
    EditText descripcion;
    Spinner categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_crear_publicacion);
        agregarImg=findViewById(R.id.agregarImagen);
        Titulo=findViewById(R.id.titulo);
        lugar=findViewById(R.id.Lugar);
        descripcion=findViewById(R.id.Descripcion);
        categoria=findViewById(R.id.Categoria);
    }
}
