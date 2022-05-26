package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    EditText primeiroValor, segundoValor;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeiroValor = findViewById(R.id.txtPrimeiroValor);
        segundoValor = findViewById(R.id.txtSegundoValor);
        resultado = findViewById(R.id.txtResultado);
    }

    public void sorteio(View V)
    {
        int min, max, numeroSorteado;

        min = Integer.parseInt(primeiroValor.getText().toString());
        max = Integer.parseInt(segundoValor.getText().toString());

        numeroSorteado = new Random().nextInt(max-min)+min;

        resultado.setText(Integer.toString(numeroSorteado));
    }
}