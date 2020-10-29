package cl.ejercicios.museonacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irExhibiciones(View view){
        Intent intent=new Intent(this,ExhibicionActivity.class);
        startActivity(intent);
    }

    public void modificarExhibiciones(View view){
        Intent intent=new Intent(this,UsetAdmin.class);
        startActivity(intent);
    }

}