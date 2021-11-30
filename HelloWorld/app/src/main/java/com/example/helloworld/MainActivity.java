package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonV;
    Button buttonA;
    RadioButton radioMidi;
    RadioButton radioSoir;
    EditText plat;
    EditText entree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.repas);
        onButtonValClicked();
        onButtonAnnClicked();
        onRadioButtonClicked();
    }

    public void onRadioButtonClicked(){
        radioMidi = findViewById(R.id.Radio_Midi);
        radioSoir = findViewById(R.id.Radio_Soir);

        radioMidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioSoir.setActivated(false);
                v.setBackgroundColor(Color.parseColor("yellow"));
            }
        });
    }

    public void onButtonValClicked(){
        buttonV = findViewById(R.id.ButtonValider);
        plat = findViewById(R.id.Text_Plat);
        entree = findViewById(R.id.Text_Entrée);

        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plat.getText().clear();
                entree.getText().clear();
                Toast.makeText(MainActivity.this, "Commande validée",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onButtonAnnClicked() {
        buttonA = findViewById(R.id.ButtonAnnuler);
        radioMidi = findViewById(R.id.Radio_Midi);
        radioSoir = findViewById(R.id.Radio_Soir);
        plat = findViewById(R.id.Text_Plat);
        entree = findViewById(R.id.Text_Entrée);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plat.getText().clear();
                entree.getText().clear();
                Toast.makeText(MainActivity.this, "Annulation réussie", Toast.LENGTH_SHORT).show();
            }

        });
    }

}