package com.example.td6_appels_reseaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search);
        setTitle(getLocalClassName());

        GithubService service = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);

        Button ok = findViewById(R.id.ok);
        EditText search = findViewById(R.id.search);

        ok.setOnClickListener(v -> {
            Intent intent = new Intent(this, ListReposActivity.class);
            intent.putExtra("search", search.getText().toString());
            startActivity(intent);
        });
    }
}