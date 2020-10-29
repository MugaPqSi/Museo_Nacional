package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsetAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uset_admin);
    }

    public void verExhibiciones(View view){
        Intent intent=new Intent(this,ExhibicionActivity.class);
        startActivity(intent);
    }

    public void agregarExhibiciones(View view){
        Intent intent=new Intent(this,IngresarExpo.class);
        startActivity(intent);
    }

    public void modificarExhibiciones(View view){
        Intent intent=new Intent(this,ModListExpos.class);
        startActivity(intent);
    }
}