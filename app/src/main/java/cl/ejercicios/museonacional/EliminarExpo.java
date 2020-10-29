package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import cl.ejercicios.museonacional.modelo.Exposicion;
import cl.ejercicios.museonacional.modelo.ListaExpos;

public class EliminarExpo extends ListActivity{

    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cargarExpos();
    }

    public void cargarExpos(){
        lista=getListView();
        List<Exposicion> expos= ListaExpos.getInstancia().getListaExpos();
        ArrayAdapter<Exposicion> listaAdapter=
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        expos);
        lista.setAdapter(listaAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View item, int posicion, long id) {
        Intent intent=new Intent(EliminarExpo.this, Eliminar.class);
        intent.putExtra("expoNro",(int) id);
        startActivity(intent);


    }
}