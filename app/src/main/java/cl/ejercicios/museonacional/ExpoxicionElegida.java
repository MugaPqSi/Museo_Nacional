package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cl.ejercicios.museonacional.modelo.Exposicion;
import cl.ejercicios.museonacional.modelo.ListaExpos;

public class ExpoxicionElegida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expoxicion_elegida);

        int expoNro=(Integer)getIntent().getExtras().get("expoNro");
        Exposicion exposicion= ListaExpos.getInstancia().getExposicion(expoNro);

        ImageView foto=(ImageView) findViewById(R.id.foto);
        foto.setImageResource(exposicion.getIdFoto());

        TextView nombre=(TextView) findViewById(R.id.nombre);
        nombre.setText(exposicion.getNombre());

        TextView descripcion=(TextView) findViewById(R.id.descripcion);
        descripcion.setText(exposicion.getDescripcion());

        TextView tipo=(TextView) findViewById(R.id.tipo);
        tipo.setText("Tipo: " + exposicion.getTipo());
    }
}