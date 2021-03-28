package com.blackgroup.rustik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        ingresarBtn();
        nuevoRegistro();
        recuperarClave();

    
    }
    private void ingresarBtn(){
        Button ingresarBtnJ=(Button) findViewById(R.id.RecuperarPwBtn) ;
        ingresarBtnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IniciarSesion.this, MenuClientes.class));
            }
        });
    }
    private void nuevoRegistro(){
        Button nuevoRegistroJ = (Button) findViewById(R.id.RegistrarseBtn);
        nuevoRegistroJ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(IniciarSesion.this, RegistrarseUsuario.class));
            }
        });

    }
    private void recuperarClave(){
        Button recuperarClaveJ = (Button) findViewById(R.id.RecuperarClave);
        recuperarClaveJ.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(IniciarSesion.this, RecuperarClave.class));
            }
        });

    }

}