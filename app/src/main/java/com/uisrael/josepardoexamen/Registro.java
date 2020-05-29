package com.uisrael.josepardoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Registro extends AppCompatActivity {

    TextView tvUsuarioRecibe,tvTotal;
    Bundle usuarioRecibe;

    EditText nombre,montoInicial,pagoMensual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        tvUsuarioRecibe = findViewById(R.id.tvUsuarioRecibe);
        usuarioRecibe=getIntent().getExtras();
        String usuarioRecibido = usuarioRecibe.getString("usuarioEnviado");
        tvUsuarioRecibe.setText(usuarioRecibido);

        nombre=findViewById(R.id.etNombre);
        montoInicial=findViewById(R.id.etMontoInicial);
        pagoMensual=findViewById(R.id.etPagoMensual);
        tvTotal=findViewById(R.id.tvTotal);
    }
    public void Calcular(View v){

        DecimalFormat df = new DecimalFormat("#.##");
        Double montoI, cuota , pagoM, diferencia,  total, costo;
        costo = 1800.00;
        montoI=Double.parseDouble(montoInicial.getText().toString());
        diferencia = costo - montoI;
        cuota=(diferencia/3.00);

        pagoM=cuota*1.05;
        pagoM=Double.valueOf(df.format(pagoM));

        pagoMensual.setText(""+pagoM);

        total=montoI+(pagoM*3.00);
        total=Double.valueOf(df.format(total));

        tvTotal.setText(""+total);
    }

    public void Guardar(View v){
        Intent intentGuardar = new Intent(Registro.this,Resumen.class);
        intentGuardar.putExtra("usuarioEnviado",tvUsuarioRecibe.getText().toString());
        intentGuardar.putExtra("nombreEnviado",nombre.getText().toString());
        intentGuardar.putExtra("totalEnviado",tvTotal.getText().toString());

        Toast.makeText(getApplicationContext(),"Elemento guardado con éxito", Toast.LENGTH_SHORT).show();
        startActivity(intentGuardar);
    }
}