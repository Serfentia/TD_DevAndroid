package com.example.td5_les_listes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final List<Contact> mContacts;
    private final Context mContext;


    public ContactsAdapter(List<Contact> contacts, Context mContext) {
        this.mContacts = contacts;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getPrenom());

        TextView lastNameTextView = holder.lastNameTextView;
        lastNameTextView.setText(contact.getNom());

        ImageView ppImageView = holder.ppimageView;

        Glide.with(mContext)
                .load(contact.getImageUrl())
                .into(ppImageView);

    }
    
    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public ImageView ppimageView;

        public ViewHolder(View itemView){
            super(itemView);

            firstNameTextView = (TextView) itemView.findViewById(R.id.prenom);
            lastNameTextView = (TextView) itemView.findViewById(R.id.nom);
            ppimageView = (ImageView) itemView.findViewById((R.id.pp));

        }
    }

}
