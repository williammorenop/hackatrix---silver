package com.example.silver_hacktrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class PoolActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imagen1, imagen2, imagen3, imagen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pool);

        spinner = (Spinner) findViewById(R.id.servicios);
        imagen1 = (ImageView) findViewById(R.id.imagenS1);
        imagen2 = (ImageView) findViewById(R.id.imagenS2);
        imagen3 = (ImageView) findViewById(R.id.imagenS3);
        imagen4 = (ImageView) findViewById(R.id.imagenS4);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String nivel = (String) spinner.getSelectedItem();
                Toast.makeText(getBaseContext(), "El item seleccionado es: "+
                                spinner.getSelectedItemId()+" "+nivel,
                        Toast.LENGTH_LONG).show();
                int ids = (int) spinner.getSelectedItemId();
                if (ids == 0){
                    imagen1.setImageResource(R.drawable.contenido);
                    imagen2.setImageResource(R.drawable.contenido);
                    imagen3.setImageResource(R.drawable.contenido);
                    imagen4.setImageResource(R.drawable.contenido);
                }
                else if (ids == 1){
                    imagen1.setImageResource(R.drawable.legal);
                    imagen2.setImageResource(R.drawable.legal);
                    imagen3.setImageResource(R.drawable.legal);
                    imagen4.setImageResource(R.drawable.legal);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
