package com.example.silver_hacktrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PoolActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imagen1, imagen2, imagen3, imagen4;
    TextView text1, text2, text3, text4;
    Button botonmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pool);

        spinner = (Spinner) findViewById(R.id.servicios);
        imagen1 = (ImageView) findViewById(R.id.imagenS1);
        imagen2 = (ImageView) findViewById(R.id.imagenS2);
        imagen3 = (ImageView) findViewById(R.id.imagenS3);
        imagen4 = (ImageView) findViewById(R.id.imagenS4);
        text1 = (TextView) findViewById(R.id.textS1);
        text2 = (TextView) findViewById(R.id.textS2);
        text3 = (TextView) findViewById(R.id.textS3);
        text4 = (TextView) findViewById(R.id.textS4);
        botonmas = findViewById(R.id.more);

        botonmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ong = new Intent(PoolActivity.this, VerPublicacion.class);
                startActivity(ong);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int ids = (int) spinner.getSelectedItemId();
                if (ids == 0){
                    imagen1.setImageResource(R.drawable.contenido);
                    imagen2.setImageResource(R.drawable.contenido);
                    imagen3.setImageResource(R.drawable.contenido);
                    imagen4.setImageResource(R.drawable.contenido);
                    text1.setText("Aplicación de la vacuno de la fiebre amarilla en el Hospital Reina Sofía.");
                    text2.setText("Atención especial para imigrantes en la Clínica Colombia.");
                    text3.setText("A partir del 2 de Octubre, descuentos para la vacuna de la fiebre amarilla.");
                    text4.setText("Fundación Ayudame brinda servicios de salud especiales para refugiados.");
                }
                else if (ids == 1){
                    imagen1.setImageResource(R.drawable.legal);
                    imagen2.setImageResource(R.drawable.legal);
                    imagen3.setImageResource(R.drawable.legal);
                    imagen4.setImageResource(R.drawable.legal);
                    text1.setText("Problemas con la Policía Nacional debido a la falsificación de documentos.");
                    text2.setText("Se brindan descuentos para documentación de imigrantes en Colombia.");
                    text3.setText("Muchos refugiados tienen problemas con respecto a la documentación.");
                    text4.setText("Se permiten a los refugiados realizar demandas en la Policía Nacional.");
                }
                else if (ids == 2){
                    imagen1.setImageResource(R.drawable.hogar);
                    imagen2.setImageResource(R.drawable.hogar);
                    imagen3.setImageResource(R.drawable.hogar);
                    imagen4.setImageResource(R.drawable.hogar);
                    text1.setText("Habitaciones para imigrantes en Cali - Valle del Cauca.");
                    text2.setText("Descuentos en diferentes hoteles de Medellín para imigrantes.");
                    text3.setText("Muchos imigrantes viven en carpas cerca de la frontera con Venezuela.");
                    text4.setText("Sobrecupo de refugiados en la fundación Por la Paz.");
                }
                else if (ids == 3){
                    imagen1.setImageResource(R.drawable.educacion);
                    imagen2.setImageResource(R.drawable.educacion);
                    imagen3.setImageResource(R.drawable.educacion);
                    imagen4.setImageResource(R.drawable.educacion);
                    text1.setText("Colegios del Gobierno reciben estudiantes del extrenajero.");
                    text2.setText("Academias especiales para estudiar Inglés en Cartagena.");
                    text3.setText("Descuentos en la Universidad del Atlático para imigrantes.");
                    text4.setText("Niños imigrantes tienen derechos a recibir su debida educación.");
                }
                else if (ids == 4){
                    imagen1.setImageResource(R.drawable.alimentacion);
                    imagen2.setImageResource(R.drawable.alimentacion);
                    imagen3.setImageResource(R.drawable.alimentacion);
                    imagen4.setImageResource(R.drawable.alimentacion);
                    text1.setText("El Gobierno brinda alimentación para refugiados en la Caracas con calle 22.");
                    text2.setText("Diferentes colegios y hogares para refugiados brinda alimentación gratiuta.");
                    text3.setText("Campañas de recolecta de alimentos para refugiados en la frontera.");
                    text4.setText("Descuentos en diferentes restaurantes de Bogotá para imigrantes.");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
