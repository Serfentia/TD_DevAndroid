package com.example.td5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.laViewHolder>{

    private final List<Contact> mContact;

    public ContactAdapter(List<Contact> contact) {
        this.mContact = contact;
    }

    public static class laViewHolder extends RecyclerView.ViewHolder{
        public TextView prenomTV;
        public TextView nomTV;

        public laViewHolder(View itemView) {
            super(itemView);
            prenomTV = (TextView) itemView.findViewById(R.id.contact_prenom);
            nomTV = (TextView) itemView.findViewById(R.id.contact_nom);
        }
    }

    @NonNull
    @Override
    public laViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context= parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        return new laViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull laViewHolder holder, int position) {
        Contact contact= mContact.get(position);

        TextView prenomTV=holder.prenomTV;
        prenomTV.setText(contact.getmPrenom());

        TextView nomTV=holder.nomTV;
        nomTV.setText(contact.getmNom());
    }

    @Override
    public int getItemCount() {
        return mContact.size();
    }


}