package cl.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        Usuario user = new Usuario();
        TextView nombre = findViewById(R.id.nombre);
        TextView apellido = findViewById(R.id.apellido);
        TextView correo = findViewById(R.id.correo);
        TextView telefono = findViewById(R.id.telefono);
        TextView fec_n = findViewById(R.id.fec_n);
        user.setNombre("Gabriel");
        user.setApellido("Araya");
        user.setF_nac("10/09/1997");
        user.setCorreo("garaya@gmail.com");
        user.setNum_contacto("+56945852165");
        nombre.setText("Nombre: " + user.getNombre());
        apellido.setText("Apellido: " + user.getApellido());
        correo.setText("Correo: " + user.getCorreo());
        telefono.setText("Telefono: " + user.getNum_contacto());
        fec_n.setText("Fecha de nacimiento: " + user.getF_nac());
    }
}