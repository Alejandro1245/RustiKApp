package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrarseUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse_usuario);
        completarRegisto();
    }
    private void completarRegisto() {
        Button completarRegistroJ = (Button) findViewById(R.id.EnviarCalificacionBtn);
        completarRegistroJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrarseUsuario.this, IniciarSesion.class));
            }
        });
    }
}