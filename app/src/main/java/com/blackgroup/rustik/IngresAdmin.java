package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IngresAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_admin);
        reconocimientoD();
        reconocimientoF();
    }
    private void reconocimientoD(){
        Button reconocimientoDJ = (Button) findViewById(R.id.ClientesBtn);
        reconocimientoDJ.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                startActivity(new Intent(IngresAdmin.this, VerificacionCorrecta.class));
                }
            });

        }
    private void reconocimientoF(){
        Button reconocimientoFJ = (Button) findViewById(R.id.VentasBtn);
        reconocimientoFJ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(IngresAdmin.this, VerificacionIncorrecta.class));
            }
        });

    }
}