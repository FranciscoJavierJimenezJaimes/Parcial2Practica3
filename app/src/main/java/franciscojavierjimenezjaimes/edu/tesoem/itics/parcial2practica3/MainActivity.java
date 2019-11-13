package franciscojavierjimenezjaimes.edu.tesoem.itics.parcial2practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   List<String> listaEstados;
   String[] strsEstados;
   Spinner objSpinner;
   ArrayAdapter<String> lisEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objSpinner = findViewById(R.id.cargalista);
        strsEstados = new  String[] {"CDMX","Estado de México","Veracruz","Sonora","Colima"};
        listaEstados = new ArrayList<String>();

        Collections.addAll(listaEstados, strsEstados);

        lisEstados = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listaEstados);
        objSpinner.setAdapter(lisEstados);


    }
}
