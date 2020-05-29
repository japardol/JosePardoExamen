package com.uisrael.josepardoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText usuario;
    EditText contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario=findViewById(R.id.etUsuario);
        contrasena=findViewById(R.id.etContrasena);
    }

    public void Ingresar(View v){

        Intent intentIngresar = new Intent(Login.this,Registro.class);
        intentIngresar.putExtra("usuarioEnviado",usuario.getText().toString());
        intentIngresar.putExtra("contrasenaEviado",contrasena.getText().toString());


        if(usuario.getText().toString().equals("estudiante2020") && contrasena.getText().toString().equals("uisrael2020")) {
            startActivity(intentIngresar);
        } else {
        Toast.makeText(getApplicationContext(),"Clave incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}