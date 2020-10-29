package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cl.ejercicios.museonacional.modelo.ListaExpos;

public class Eliminar extends AppCompatActivity {

    ListaExpos lista=ListaExpos.getInstancia();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);
    }

    public void eliminar(View view){
        int expoNro=(Integer)getIntent().getExtras().get("expoNro");
        lista.eliminarExpos(expoNro);
        Toast.makeText(this,"Exhibición eliminida",Toast.LENGTH_SHORT);
        Intent intent=new Intent(Eliminar.this, EliminarExpo.class);
        startActivity(intent);

    }
}