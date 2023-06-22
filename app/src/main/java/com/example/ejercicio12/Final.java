package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio12.databinding.ActivityFinalBinding;

public class Final extends AppCompatActivity {
    private ActivityFinalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent foodIntent = getIntent();

        binding.imgDes.setImageResource(foodIntent.getIntExtra("imgId",0));
        binding.imgMapa.setImageResource(foodIntent.getIntExtra("imgMapa",0));
        binding.txtBienvenida.setText("Bienvenid@" + foodIntent.getStringExtra("userNom"));
        binding.txtDes.setText(foodIntent.getStringExtra("nombreNegocio"));
        binding.ratingBar.setRating(foodIntent.getFloatExtra("valoracion",0));
        binding.txtDireccion.setText(foodIntent.getStringExtra("direccion"));
        binding.txtHorario.setText(foodIntent.getStringExtra("horarios"));
        binding.txtEntrega.setText(foodIntent.getStringExtra("entrega"));


        binding.btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}