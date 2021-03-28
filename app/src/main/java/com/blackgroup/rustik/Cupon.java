package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cupon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupon);
        volverAlMenu();

    }
    private void volverAlMenu() {
        Button volverAlMenuJ = (Button) findViewById(R.id.ClientesBtn);
        volverAlMenuJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cupon.this, MenuClientes.class));
            }
        });
    }
}