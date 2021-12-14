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

        contacts.add(new Contact("Jean-Pierre","Pernaud", "https://static1.ozap.com/articles/3/45/25/13/@/4459943--ministre-ideal-de-128x128-2.jpg"));
        contacts.add(new Contact("Jeanne","D'arc", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("Pierre","Menez", "https://pbs.twimg.com/profile_images/597478658299842560/Pwy4MKBx_400x400.jpg"));
        contacts.add(new Contact("Arthur","Rimbaut", "https://img.lamontagne.fr/iOOVt6z04DoERMOzQ7QEHo-m2D-T_eOmE2YIQeyRBYs/fit/657/438/sm/0/bG9jYWw6Ly8vMDAvMDAvMDEvODcvNzEvMjAwMDAwMTg3NzEyMA.jpg"));
        contacts.add(new Contact("Richard","Coeur de Lion", "https://static.wikia.nocookie.net/ageofempires/images/e/e8/Lionheart_aoe2DE.png/revision/latest?cb=20200403030433"));
        contacts.add(new Contact("Zinedine","Zidane", "https://cachedimages.podchaser.com/256x256/aHR0cHM6Ly9jcmVhdG9yLWltYWdlcy5wb2RjaGFzZXIuY29tL2MxYmYyZWM4OGE4OTQxNTUzZDUxNDA5ODgzYjYyNDYwLmpwZWc%3D/aHR0cHM6Ly93d3cucG9kY2hhc2VyLmNvbS9pbWFnZXMvbWlzc2luZy1pbWFnZS5wbmc%3D"));
        contacts.add(new Contact("Yannick","Noah", "https://static1.ozap.com/articles/8/41/80/38/@/4237496-yannick-noah-128x128-1.jpg"));


        ContactsAdapter adapter = new ContactsAdapter(contacts, getApplicationContext());
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}