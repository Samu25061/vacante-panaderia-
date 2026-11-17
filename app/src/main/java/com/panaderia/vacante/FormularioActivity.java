

package com.panaderia.vacante;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText nombre = findViewById(R.id.txtNombre);
        EditText telefono = findViewById(R.id.txtTelefono);
        EditText correo = findViewById(R.id.txtCorreo);

        Button enviar = findViewById(R.id.btnEnviar);

        enviar.setOnClickListener(v -> {

            String n = nombre.getText().toString();
            String t = telefono.getText().toString();
            String c = correo.getText().toString();

            if (n.isEmpty() || t.isEmpty() || c.isEmpty()) {
                Toast.makeText(this, "Complete todos los campos",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(this, ConfirmacionActivity.class);
            intent.putExtra("nombre", n);
            intent.putExtra("telefono", t);
            intent.putExtra("correo", c);

            startActivity(intent);
        });
    }
}
