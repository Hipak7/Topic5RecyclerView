package com.softwarica.topic5recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{
    Context mcontext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mcontext, List<Contacts> contactsList) {
        this.mcontext = mcontext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        Contacts contacts=contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageId());
        holder.tvName.setText((contacts.getName()));
        holder.tvType.setText(contacts.getTvType());

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvName,tvType;
        public ContactsViewHolder(@NonNull View itemView){
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvName=itemView.findViewById(R.id.tvName);
            tvType=itemView.findViewById(R.id.tvtype);
            //asdasd
        }

    }
}
