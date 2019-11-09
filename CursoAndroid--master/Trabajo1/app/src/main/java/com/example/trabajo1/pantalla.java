package com.example.trabajo1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class pantalla extends AppCompatActivity {


    String valorExtraido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
        TextView nombre = (TextView)findViewById(R.id.Datos);
        valorExtraido = getIntent().getExtras().getString("Valor");
        nombre.setText(valorExtraido);

    }

}
