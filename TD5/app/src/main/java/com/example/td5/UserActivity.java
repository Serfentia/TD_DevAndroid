package com.example.td5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Jean-Pierre","Pernaud"));
        contacts.add(new Contact("Jeanne","D'Arc"));
        contacts.add(new Contact("Pierre","Menez"));
        contacts.add(new Contact("Arthur","Rimbaut"));
        contacts.add(new Contact("Richard","Coeur de Lion"));
        contacts.add(new Contact("Zinedine","Zidane"));
        contacts.add(new Contact("Yannick","Noah"));
        contacts.add(new Contact("Serfentia","Himamushi"));

        ContactAdapter adapter = new ContactAdapter(contacts);

        rvContacts.setAdapter(adapter);

        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}