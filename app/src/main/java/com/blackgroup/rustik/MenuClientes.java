package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuClientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_clientes);

        registrarVisita();
        volverMenuPrincipal2();

    }

    private void registrarVisita() {
        Button registrarVisitaJ = (Button) findViewById(R.id.VentasBtn);
        registrarVisitaJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuClientes.this, NuevaExperiencia.class));
            }
        });
    }
    private void volverMenuPrincipal2() {
        Button volverMenuPrincipal2J = (Button) findViewById(R.id.salirMenuCBtn);
        volverMenuPrincipal2J.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuClientes.this, MainActivity.class));
            }
        });
    }

}