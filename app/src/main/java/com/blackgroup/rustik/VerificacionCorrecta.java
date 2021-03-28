package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerificacionCorrecta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion_correcta);
        ingresoMenuAdmin();

    }

    private void ingresoMenuAdmin() {
        Button ingresoMenuAdminJ = (Button) findViewById(R.id.ClientesBtn);
        ingresoMenuAdminJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerificacionCorrecta.this, MenuAdmin.class));
            }
        });
    }
}