package com.sortapp.cascavel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterText(View view){

        TextView texto = findViewById(R.id.sortNumber);
        int randomNumber = new Random().nextInt(10);
        texto.setText("O número selecionado: " + randomNumber);
    }
}
