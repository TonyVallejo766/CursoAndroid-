package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Start;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Start = (Button) findViewById(R.id.Start);
        final EditText nombre = (EditText) findViewById(R.id.editText);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Hola desde restart",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),pantalla.class);
                final String textTraslado = nombre.getText().toString();
                intent.putExtra("Valor",textTraslado);
                startActivity(intent);
            }
        });

        Toast.makeText(this,"Hola desde onCreate", Toast.LENGTH_SHORT).show();
    }
        @Override
     protected void onStart() {
         super.onStart();
            Toast.makeText(this,"Hola desde onStart", Toast.LENGTH_SHORT).show();
        }
        @Override
    protected void onStop() {
         super.onStop();
            Toast.makeText(this,"Hola desde onStop", Toast.LENGTH_SHORT).show();
        }
        @Override
     protected void onDestroy() {
         super.onDestroy();
            Toast.makeText(this,"Hola desde onDestroy", Toast.LENGTH_SHORT).show();
        }
        @Override
      protected void onPause() {
         super.onPause();
            Toast.makeText(this,"Hola desde onPause", Toast.LENGTH_SHORT).show();
        }
        @Override
    protected void onResume() {
         super.onResume();
            Toast.makeText(this,"Hola desde onResume", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Toast.makeText(this, "Hola desde onRestart", Toast.LENGTH_SHORT).show();
        }
}

