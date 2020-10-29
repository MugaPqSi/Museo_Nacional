package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import cl.ejercicios.museonacional.modelo.Exposicion;
import cl.ejercicios.museonacional.modelo.ListaExpos;

public class IngresarExpo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_expo);
    }

    public void ingresarExhibicion(View view){
        ListaExpos listaExpos=ListaExpos.getInstancia();
        String nombre=((TextView) findViewById(R.id.ingresarNombreTxt)).getText().toString();
        String descripcion=((TextView) findViewById(R.id.ingresarDescTxt)).getText().toString();
        Spinner seleccion=(Spinner) findViewById(R.id.tipoSpinner);
        String tipo=String.valueOf(seleccion.getSelectedItem());
        try {
            if (!nombre.equals("") && !descripcion.equals("")) {
                Exposicion exposicion=new Exposicion(nombre,descripcion,R.drawable.fosil,tipo);
                listaExpos.agregarExpo(exposicion);
                finish();
            }else if (nombre.equals("")){
                Toast.makeText(this,"Ingrese un nombre",Toast.LENGTH_SHORT);
            }else {
                Toast.makeText(this,"Ingrese una Descripción",Toast.LENGTH_SHORT);
            }
        }catch (NumberFormatException ex){
            Toast.makeText(this,"Error: " + ex,Toast.LENGTH_SHORT);
        }
    }
}