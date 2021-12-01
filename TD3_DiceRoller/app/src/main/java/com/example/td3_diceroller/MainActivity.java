package com.example.td3_diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.button);

        TextView valeur = (TextView) findViewById(R.id.Val1); //on récupère d'abord le 1er TextView de notre layout
        TextView valeur2 = (TextView) findViewById(R.id.Val2);


       /*EditText faces1 = (EditText) findViewById(R.id.facesD1);
        Button okdé1 = (Button) findViewById(R.id.okdé1);
        int nb_facesD1=Integer.parseInt(faces1.getText().toString());

        EditText faces2 = (EditText) findViewById(R.id.facesD2);
        Button okdé2 = (Button) findViewById(R.id.okdé2);
        int nb_facesD2= Integer.parseInt(faces2.getText().toString());*/

        int faces = 6; //on set pour l'instant les faces à 6 pour les exo 1 et 2

        rollButton.setOnClickListener(v -> {
            Toast toast = Toast.makeText(MainActivity.this, "Dés lancés!",
                    Toast.LENGTH_SHORT);
            toast.show();
            int rand = 0 + (int)(Math.random() * ((faces - 0) + 1));//on crée un nombre random entre 0 et 6 (entier) : c'est notre dé1
            int rand2 = 0 + (int)(Math.random() * ((faces - 0) + 1)); //le dé2
            valeur.setText(String.valueOf(rand)); //et on passe en text (qui joue le rôle de android:text dans le xml), la valeur aléatoire

            valeur2.setText(String.valueOf(rand2));//on passe l'autre valeur aléatoire pour l'autre textview

        });


    }
}