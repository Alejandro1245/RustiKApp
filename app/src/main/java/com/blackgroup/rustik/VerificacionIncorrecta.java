package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerificacionIncorrecta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion_incorrecta);
        retornoIngresAdmin();
    }
    private void retornoIngresAdmin() {
        Button retornoIngresAdminJ = (Button) findViewById(R.id.ClientesBtn);
        retornoIngresAdminJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerificacionIncorrecta.this, IngresAdmin.class));
            }
        });
    }
}