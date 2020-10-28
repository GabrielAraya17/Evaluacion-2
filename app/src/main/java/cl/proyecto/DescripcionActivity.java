package cl.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescripcionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        int vehiculoNro=(Integer)getIntent().getExtras().get("vehiculoNro");
        Vehiculo vehiculo=Vehiculo.vehiculos[vehiculoNro];

        TextView patente=(TextView)findViewById(R.id.patente);
        patente.setText("Patente: "+vehiculo.getPat());

        TextView marca=(TextView)findViewById(R.id.marca);
        marca.setText("Marca: "+vehiculo.getMarca());

        TextView modelo=(TextView)findViewById(R.id.modelo);
        modelo.setText("Modelo: "+vehiculo.getModelo());

    }
}