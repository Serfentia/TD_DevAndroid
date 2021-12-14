package com.example.td6_appels_rseaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserDemandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_demand);
        setTitle(getLocalClassName());

        NewsListApplication app = (NewsListApplication) getApplicationContext();
        String rep = app.getRepos();

        Button ok = (Button) findViewById(R.id.okButton);
        EditText repos = (EditText) findViewById(R.id.recherche);

        ok.setOnClickListener(v -> {
            /*Intent intent = new Intent(this, NewsActivity.class);
            startActivity(intent);*/
            Intent intent = new Intent(this, ListReposActivity.class);
            intent.putExtra("ok", repos.getText());
            startActivity(intent);

        GithubService githubService = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);

        githubService.listRepos("Serfentia").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response)
            {
                afficherRepos(response.body());
            }
            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
            }
        });
    }
    public void afficherRepos(List<Repo> repos) {
        Toast.makeText(this,"nombre de dépots : "+repos.size(),
                Toast.LENGTH_SHORT).show();
    }
    }
}