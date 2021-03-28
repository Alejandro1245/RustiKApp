package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Botones menú principal
        configureCliente();
        adminIngreso();
    }
    private void configureCliente(){
        Button configureClienteJ = (Button) findViewById(R.id.InventarioBtn);
        configureClienteJ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, IniciarSesion.class));
            }
        });

    }
    private void adminIngreso(){
        Button adminIngresoJ = (Button) findViewById(R.id.ClientesBtn);
        adminIngresoJ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, IngresAdmin.class));
            }
        });

    }
}