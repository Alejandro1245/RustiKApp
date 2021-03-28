package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NuevaExperiencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_experiencia);
        nuevaExperienciaQr();
    }
    private void nuevaExperienciaQr() {
        ImageButton nuevaExperienciaQrJ = (ImageButton) findViewById(R.id.CodigoQRBtn);
        nuevaExperienciaQrJ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(NuevaExperiencia.this, CalificarExperiencia.class));
            }
        });

    }
}