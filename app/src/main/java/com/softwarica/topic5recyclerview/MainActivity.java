package com.softwarica.topic5recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        //Create a List of Contacts to display in RecycleView
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Tiger","German Shepherd Dog",R.drawable.german));
        contactsList.add(new Contacts("Jessy","Japanese Spitz Dog",R.drawable.spitz));
        contactsList.add(new Contacts("Casset","SheepDog",R.drawable.sheepdog));

        ContactsAdapter contactsAdapter =new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
