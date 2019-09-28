package com.example.silver_hacktrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class CrearPublicacion extends AppCompatActivity {
    ImageButton agregarImg;
EditText Titulo;
    EditText lugar;
    EditText descripcion;
    Spinner categoria;

    Button boton;

    Button ubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_crear_publicacion);
        agregarImg=findViewById(R.id.agregarImagen);
        Titulo=findViewById(R.id.titulo);
        lugar=findViewById(R.id.Lugar);
        descripcion=findViewById(R.id.Descripcion);
        categoria=findViewById(R.id.Categoria);


        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ong = new Intent(CrearPublicacion.this, PrincipalActivity.class);
                startActivity(ong);
              }
          });

        ubicacion=findViewById(R.id.BotonU);

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CrearPublicacion.this,Ubicacion.class);
                startActivity(intent);
            }
        });
    }
}
