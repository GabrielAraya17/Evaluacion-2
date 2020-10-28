package cl.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class LobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        Usuario user = new Usuario();
        TextView usuario = findViewById(R.id.nombre);
        user.setNombre("Gabriel");
        user.setApellido("Araya");
        user.setF_nac("10/09/1997");
        user.setCorreo("garaya@gmail.com");
        user.setNum_contacto("+56945852165");
        usuario.setText(user.getNombre()+" "+user.getApellido());

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position>=0 && position<=11){
                    Intent intento = new Intent(LobbyActivity.this, VehiculosActivity.class);
                    startActivity(intento);
                }
            }
        };

        ListView listView=(ListView) findViewById(R.id.listacoletos);
        listView.setOnItemClickListener(itemClickListener);
    }
    public void onclickgotoinfo(View view){
        Intent intento = new Intent(view.getContext(), UsuarioActivity.class);
        startActivityForResult(intento,0);
    }
}