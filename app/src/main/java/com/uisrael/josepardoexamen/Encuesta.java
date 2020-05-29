package com.uisrael.josepardoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {

    EditText etEspecifique;

    CheckBox cbF, cbB, cbV;

    RadioButton rbS, rbN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        etEspecifique=findViewById(R.id.etEspecifique);

        cbF=findViewById(R.id.cbFutbol);
        cbB=findViewById(R.id.cbBasquet);
        cbV=findViewById(R.id.cbVolley);

        rbS=findViewById(R.id.rbtnSi);
        rbN=findViewById(R.id.rbtnNo);
    }

    public void Enviar(View v){
        Intent intentEnviar = new Intent(Encuesta.this,Resumen.class);
        intentEnviar.putExtra("Especifique", etEspecifique.getText().toString());
        if(cbF.isChecked())
            intentEnviar.putExtra("Futbol", cbF.getText().toString());
        if(cbB.isChecked())
            intentEnviar.putExtra("Basquet", cbB.getText().toString());
        if(cbV.isChecked())
            intentEnviar.putExtra("Volley", cbV.getText().toString());
        if(rbS.isChecked()==true)
            intentEnviar.putExtra("Si",rbS.getText().toString());
        if(rbN.isChecked()==true)
            intentEnviar.putExtra("No",rbN.getText().toString());
        startActivity(intentEnviar);
    }
}