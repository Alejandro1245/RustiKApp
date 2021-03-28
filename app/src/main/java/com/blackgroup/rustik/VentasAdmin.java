package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VentasAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas_admin);
        graficasVentas();
    }
    private void graficasVentas() {
        ImageButton graficasVentasJ = (ImageButton) findViewById(R.id.GraficaVentasBtn);
        graficasVentasJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VentasAdmin.this, GraficasVentas.class));
            }
        });
    }
}