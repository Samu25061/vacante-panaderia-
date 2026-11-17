
package com.panaderia.vacante;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        TextView datos = findViewById(R.id.txtDatos);
        Button salir = findViewById(R.id.btnSalir);

        String nombre = getIntent().getStringExtra("nombre");
        String telefono = getIntent().getStringExtra("telefono");
        String correo = getIntent().getStringExtra("correo");

        datos.setText("Nombre: " + nombre
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo);

        salir.setOnClickListener(v -> finishAffinity());
    }
}

