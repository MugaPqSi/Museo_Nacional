package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ModListExpos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_list_expos);
    }

    public void eliminar(View view){
        Intent intent=new Intent(this,EliminarExpo.class);
        startActivity(intent);
    }
}