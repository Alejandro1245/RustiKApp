package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Inventario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);
        graficasInventario();
    }
    private void graficasInventario(){
        ImageButton graficasInventarioJ = (ImageButton) findViewById(R.id.GraficaVentasBtn);
        graficasInventarioJ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(Inventario.this, GraficasInventario.class));
            }
        });

    }
}