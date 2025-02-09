package com.banthi.androiddemos.contactRecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.banthi.androiddemos.R;

import java.util.ArrayList;

public class ContactRecyclerView extends AppCompatActivity {
    private Button showListBtn;
    private RecyclerView peopleList;
    private ArrayList<Contact> contacts;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        showListBtn = findViewById(R.id.rvListBtn);
        peopleList = findViewById(R.id.rvList);

        contacts = new ArrayList<>();
        contacts.add(new Contact("Banthapo Chabwera", "088676676", "b@u.com","https://www.shutterstock.com/image-photo/image-handsome-smiling-young-african-260nw-722913181.jpg"));
        contacts.add(new Contact("Banthapo Nyanja", "0990909009", "n@u.com", "https://www.shutterstock.com/image-photo/image-handsome-smiling-young-african-260nw-722913181.jpg"));
        contacts.add(new Contact("Banthapo Kalira", "0887665553", "k@u.com", "https://www.google.com/url?https://img.freepik.com/free-photo/portrait-white-man-isolated_53876-40306.jpg?semt=ais_hybrid"));
        contacts.add(new Contact("Banthapo Gawa", "0996755333", "g@u.com", "https://www.shutterstock.com/image-photo/image-handsome-smiling-young-african-260nw-722913181.jpg"));
        contacts.add(new Contact("Banthapo Flower", "098989877565", "f@u.com", "https://www.shutterstock.com/image-photo/image-handsome-smiling-young-african-260nw-722913181.jpg"));

        ContactAdapter adapter = new ContactAdapter(this);
        adapter.setContacts(contacts);

        peopleList.setAdapter(adapter);
//        peopleList.setLayoutManager(new LinearLayoutManager(this));
//        peopleList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        peopleList.setLayoutManager(new GridLayoutManager(this , 2));
    }
}