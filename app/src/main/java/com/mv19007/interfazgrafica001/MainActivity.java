package com.mv19007.interfazgrafica001;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText texto1,direccion,resultado;
    Button btnVer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        texto1 = findViewById(R.id.texto1);
        direccion = findViewById(R.id.direccion);
        resultado = findViewById(R.id.resultado);
        btnVer = findViewById(R.id.btnVer);

    }
    public void guardar(View view){
        if(texto1.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(), "vacio", Toast.LENGTH_SHORT).show();
            texto1.setError("Esto esta Vacio");

        }else{
            resultado.setText("" + texto1.getText().toString());

        }

    }
}