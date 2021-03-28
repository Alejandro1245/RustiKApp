package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalificarExperiencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar_experiencia);
        enviarCalificacion();

    }
    private void enviarCalificacion() {
        Button enviarCalificacionJ = (Button) findViewById(R.id.EnviarCalifiBtn);
        enviarCalificacionJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(CalificarExperiencia.this, Cupon.class));
            }
        });
    }
}