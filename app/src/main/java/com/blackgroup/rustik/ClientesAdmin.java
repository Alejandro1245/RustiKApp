package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ClientesAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_admin);
        graficasClientes();
    }
    private void graficasClientes() {
        ImageButton graficasClientesJ = (ImageButton) findViewById(R.id.GraficaVentasBtn);
        graficasClientesJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClientesAdmin.this, ClienteGraficos.class));
            }
        });
    }
}