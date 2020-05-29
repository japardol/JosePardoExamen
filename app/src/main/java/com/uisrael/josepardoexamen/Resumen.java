package com.uisrael.josepardoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView tvNombreRecibe, tvUsuarioRecibe, tvTotalRecibe, tvEspecifique, tvFutbol, tvBasquet, tvVolley, tvSi, tvNo;
    Bundle nombreRecibe, usuarioRecibe, totalRecibe, especifiqueRecibe, futbolR, basquetR, volleyR, siR, noR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        tvUsuarioRecibe = findViewById(R.id.tvUsuarioRecibe);
        usuarioRecibe=getIntent().getExtras();
        String usuarioRecibido = usuarioRecibe.getString("usuarioEnviado");
        tvUsuarioRecibe.setText(usuarioRecibido);

        tvNombreRecibe = findViewById(R.id.tvNombreRecibe);
        nombreRecibe=getIntent().getExtras();
        String nombreRecibido = nombreRecibe.getString("nombreEnviado");
        tvNombreRecibe.setText(nombreRecibido);

        tvTotalRecibe = findViewById(R.id.tvTotalRecibe);
        totalRecibe=getIntent().getExtras();
        String totalRecibido = totalRecibe.getString("totalEnviado");
        tvTotalRecibe.setText(totalRecibido);

        tvEspecifique=findViewById(R.id.tvEspecifique);
        especifiqueRecibe=getIntent().getExtras();
        String especifiqueRecibido = especifiqueRecibe.getString("Especifique");
        tvEspecifique.setText(especifiqueRecibido);

        tvFutbol=findViewById(R.id.tvFutbol);
        futbolR=getIntent().getExtras();
        String futbolRecibido = futbolR.getString("Futbol");
        tvFutbol.setText(futbolRecibido);

        tvBasquet=findViewById(R.id.tvBasquet);
        basquetR=getIntent().getExtras();
        String basquetRecibido = basquetR.getString("Basquet");
        tvBasquet.setText(basquetRecibido);

        tvVolley=findViewById(R.id.tvVolley);
        volleyR=getIntent().getExtras();
        String volleyRecibido = volleyR.getString("Volley");
        tvVolley.setText(volleyRecibido);

        tvSi=findViewById(R.id.tvSi);
        siR=getIntent().getExtras();
        String siRecibido = siR.getString("Si");
        tvSi.setText(siRecibido);

        tvNo=findViewById(R.id.tvNo);
        noR=getIntent().getExtras();
        String noRecibido = noR.getString("No");
        tvNo.setText(noRecibido);
    }
}