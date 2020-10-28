package cl.proyecto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VehiculosActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listavehiculos=getListView();
        ArrayAdapter<Vehiculo> listaAdapter= new ArrayAdapter<Vehiculo>(this,
                android.R.layout.simple_list_item_1, Vehiculo.vehiculos);
        listavehiculos.setAdapter(listaAdapter);
    }
    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id){
        Intent intento=new Intent(VehiculosActivity.this, DescripcionActivity.class);
        intento.putExtra("vehiculoNro",(int) id);
        startActivity(intento);
    }
}