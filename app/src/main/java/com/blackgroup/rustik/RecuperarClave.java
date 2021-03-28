package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecuperarClave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_clave);
        recuperarPswd();
    }
    private void recuperarPswd(){
        Button recuperarPswdJ = (Button) findViewById(R.id.RecuperarPwBtn);
        recuperarPswdJ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(RecuperarClave.this, IniciarSesion.class));
            }
        });

    }
}