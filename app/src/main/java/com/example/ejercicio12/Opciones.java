package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio12.databinding.ActivityOpcionesBinding;
import com.example.ejercicio12.databinding.ActivityMainBinding;

public class Opciones extends AppCompatActivity {
    private ActivityOpcionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOpcionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent desIntent = new Intent(Opciones.this, Final.class);
        Intent mainIntent = getIntent();
        String nombreUser = mainIntent.getStringExtra("userNom");
        binding.txtBienvenida.setText("Bienvenid@ " + nombreUser);
        binding.ratingBarSushi.setRating(4);
        binding.ratingBarPastas.setRating(4);
        binding.ratingBarPostres.setRating(3);

        binding.btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.btmPedirSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desIntent.putExtra("imgId",R.drawable.sushi);
                desIntent.putExtra("imgMapa",R.drawable.direccionsushi);
                desIntent.putExtra("userNom",nombreUser);
                desIntent.putExtra("nombreNegocio",binding.txtSushi.getText().toString().trim());
                desIntent.putExtra("valoracion",binding.ratingBarSushi.getRating());
                desIntent.putExtra("direccion","Av santa maria 340, Cunco");
                desIntent.putExtra("horarios","Lunes, Miercoles y Viernes de 13 a 01:30");
                desIntent.putExtra("entrega","20 minutos");
                startActivity(desIntent);
            }
        });

        binding.btmPedirPastas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desIntent.putExtra("imgId",R.drawable.pastas);
                desIntent.putExtra("imgMapa",R.drawable.direccionpastas);
                desIntent.putExtra("userNom",nombreUser);
                desIntent.putExtra("nombreNegocio",binding.txtPastas.getText().toString().trim());
                desIntent.putExtra("valoracion",binding.ratingBarPastas.getRating());
                desIntent.putExtra("direccion","Av manuel rodiguez 140, Entre lagos, Puyehue");
                desIntent.putExtra("horarios","Martes, jueves y Sabado de 12:00 a 02:30");
                desIntent.putExtra("entrega","10 minutos");
                startActivity(desIntent);
            }
        });

        binding.btmPedirpostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desIntent.putExtra("imgId",R.drawable.postres);
                desIntent.putExtra("imgMapa",R.drawable.direccionpostres);
                desIntent.putExtra("userNom",nombreUser);
                desIntent.putExtra("nombreNegocio",binding.txtpostres.getText().toString().trim());
                desIntent.putExtra("valoracion",binding.ratingBarPostres.getRating());
                desIntent.putExtra("direccion","Av. collin 740, Chillan");
                desIntent.putExtra("horarios","Miercoles a Domingo de 12:00 a 02:00");
                desIntent.putExtra("entrega","10 minutos");
                startActivity(desIntent);
            }
        });
    }
}