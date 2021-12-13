package com.example.td5_les_listes;

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
        setContentView(R.layout.activity_contact);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Jean","Pierre"));
        contacts.add(new Contact("Jeanne","D'arc"));
        contacts.add(new Contact("Pierre","Menez"));
        contacts.add(new Contact("Arthur","Rimbaut"));
        contacts.add(new Contact("Richard","Coeur de Lion"));
        contacts.add(new Contact("Zinedine","Zidane"));
        contacts.add(new Contact("Yannick","Noah"));

        ContactsAdapter adapter = new ContactsAdapter(contacts);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}