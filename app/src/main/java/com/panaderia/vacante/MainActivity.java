
package com.panaderia.vacante;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button comenzar = findViewById(R.id.btnComenzar);
        Button salir = findViewById(R.id.btnSalir);

        comenzar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
            startActivity(intent);
        });

        salir.setOnClickListener(v -> finishAffinity());
    }
}

