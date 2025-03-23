package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.parcial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeros = binding.entradanumero.getText().toString();
                int numero = Integer.parseInt(numeros);
                if (numero > 20 || numero < 0) {
                    Toast.makeText(MainActivity.this, "numero fuera de rrango", Toast.LENGTH_SHORT).show();
                    Log.i("Error","fuera de rango");
                } else {
                    Intent intent = new Intent(v.getContext(), lista.class);
                    intent.putExtra("entero",numero);
                    startActivity(intent);
                }
            }
        });
    }
}