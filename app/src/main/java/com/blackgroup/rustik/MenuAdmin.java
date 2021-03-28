package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
        ingresoInventario();
        ingresoClientes();
        ingresoVentas();
        volverMenuPrincipal();
    }

    private void ingresoInventario() {
        Button ingresoInventarioJ = (Button) findViewById(R.id.InventarioBtn);
        ingresoInventarioJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this, Inventario.class));
            }
        });
    }

    private void ingresoClientes() {
        Button ingresoClientesJ = (Button) findViewById(R.id.ClientesBtn);
        ingresoClientesJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this, ClientesAdmin.class));
            }
        });
    }

    private void ingresoVentas() {
        Button ingresoVentasJ = (Button) findViewById(R.id.VentasBtn);
        ingresoVentasJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this, VentasAdmin.class));
            }
        });
    }
    private void volverMenuPrincipal() {
        Button volverMenuPrincipalJ = (Button) findViewById(R.id.SalirMenuBtn);
        volverMenuPrincipalJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this, MainActivity.class));
            }
        });
    }
}
