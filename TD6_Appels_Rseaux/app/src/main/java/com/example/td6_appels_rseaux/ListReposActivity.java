package com.example.td6_appels_rseaux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ListReposActivity extends AppCompatActivity {

    List<Repo> rep = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_repos);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvRepos);

        rep.add();

    }
}