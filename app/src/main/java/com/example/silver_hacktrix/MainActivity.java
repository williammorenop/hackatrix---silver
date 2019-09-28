package com.example.silver_hacktrix;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    Button boton;

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    String path = "/Ong/";
    DatabaseReference myRef = database.getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.editText);
        boton= findViewById(R.id.button);

        final Ong ongtemp = new Ong("nombre",  "nit", "descripcion", "telefono", "contacto");

        Log.i("jojo", "onCreate: ");
        boton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                path = path + ongtemp.getNombre();
                DatabaseReference myRef = database.getReference(path + "/Nombre");
                myRef.setValue(ongtemp.getNombre());
                myRef = database.getReference(path + "/Contacto");
                myRef.setValue(ongtemp.getContacto());
                myRef = database.getReference(path + "/Description");
                myRef.setValue(ongtemp.getDescripcion());
                path = "/Ong/";
                Log.i("jojo", "onClick2: "+ texto.getText().toString());

                /////////////////
                myRef = database.getReference(path + "/nombre/Description");
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        String value = dataSnapshot.getValue(String.class);
                        Log.i("jojo", "Value is: " + value.toString());
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.i("jojo", "Failed to read value.", error.toException());
                    }
                });

                
            }
        });



    }
}
