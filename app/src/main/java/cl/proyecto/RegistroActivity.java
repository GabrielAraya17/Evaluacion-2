package cl.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void onclickgotolobby(View view){
        Intent intento = new Intent(view.getContext(), LobbyActivity.class);
        startActivityForResult(intento,0);
    }
}