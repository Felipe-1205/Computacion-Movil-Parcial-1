package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.parcial.databinding.ActivityListaBinding;
import com.example.parcial.databinding.ActivityMainBinding;

public class lista extends AppCompatActivity {


    private ActivityListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        binding = ActivityListaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }
}