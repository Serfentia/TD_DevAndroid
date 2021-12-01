package com.example.td4_les_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());

        NewsListApplication app = (NewsListApplication) getApplicationContext();
        String login = app.getLogin();

        Button logi = (Button) findViewById(R.id.logButton);
        EditText name = (EditText) findViewById(R.id.username);

        logi.setOnClickListener(v -> {
            /*Intent intent = new Intent(this, NewsActivity.class);
            startActivity(intent);*/
            Intent intent = new Intent(this, NewsActivity.class);
            intent.putExtra("login", name.getText());
            startActivity(intent);
        });
    }
}