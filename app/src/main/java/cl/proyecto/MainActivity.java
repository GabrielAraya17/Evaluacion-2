package cl.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickgotolobby(View view){
        Intent intento = new Intent(view.getContext(), LobbyActivity.class);
        startActivityForResult(intento,0);
    }
    public void onclickgotoregister(View view){
        Intent intento = new Intent(view.getContext(), RegistroActivity.class);
        startActivityForResult(intento,0);
    }
}