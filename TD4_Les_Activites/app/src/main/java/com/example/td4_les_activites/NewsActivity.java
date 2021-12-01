package com.example.td4_les_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());

        NewsListApplication app = (NewsListApplication) getApplicationContext();
        String login = app.getLogin();

        Intent intenta = getIntent();
        //String login;
        TextView uznam = (TextView) findViewById(R.id.nameDisplay);
        if (intenta.hasExtra("login")) {
            login = intenta.getStringExtra("login");
            uznam.setText(login);
        }

        Button logo = (Button) findViewById(R.id.logoutButton);
        logo.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        Button Det = (Button) findViewById(R.id.Details);
        Det.setOnClickListener(v -> {
            Intent intent = new Intent(this, DetailsActivity.class);
            startActivity(intent);
        });

        Button lib = (Button) findViewById(R.id.Lib);
        lib.setOnClickListener(v -> {
            String url = "https://news.google.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });



    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}