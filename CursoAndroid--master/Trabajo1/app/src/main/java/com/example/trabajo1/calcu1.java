package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class calcu1 extends AppCompatActivity {

    public EditText oper1,oper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu1);

        oper1= (EditText) findViewById(R.id.editText1);
        oper2= (EditText) findViewById(R.id.editText2);
    }

    //suma..................................................................................................
    public void sumar(View v){

        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int Suma=n1+n2;
        mostrar(Suma);

    }
    //resta.................................................................................................
    public void restar(View v){

        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int Resta=n1-n2;
        mostrar(Resta);

    }
    //multiplicacion.......................................................................................
    public void multiplicacion (View v){

        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int Multi=n1*n2;
        mostrar(Multi);

    }
    //division...........................................................................................
    public void dividir(View v){

        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());

        int Dividir=n1/n2;
        mostrar(Dividir);

    }
    //funcion mostrando el resultado en toast............................................................
    private void mostrar(int res){
        Toast.makeText(this, "resiltado de operacion: "+ res, Toast.LENGTH_SHORT).show();

    }
}


