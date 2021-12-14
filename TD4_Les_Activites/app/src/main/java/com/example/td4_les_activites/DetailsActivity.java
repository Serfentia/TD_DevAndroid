package com.example.td4_les_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());

        NewsListApplication app = (NewsListApplication) getApplicationContext();
        String login = app.getLogin();

        Button ok = findViewById(R.id.okButton);

        TextView uznam = (TextView) findViewById(R.id.nameDisplay);
        uznam.setText(login);

        ok.setOnClickListener(v -> {
            Intent intent = new Intent(this, NewsActivity.class);
            startActivity(intent);
        });
    }
}