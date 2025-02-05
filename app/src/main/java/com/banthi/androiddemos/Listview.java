package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Listview extends AppCompatActivity {
    private ArrayList<String> vids;
    private ListView vidsView;
    private Spinner ratingSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        vidsView = findViewById(R.id.listView);
        vids = new ArrayList<>();
        vids.add("Harry");
        vids.add("King Kong");
        vids.add("Sound of Music");
        vids.add("The Mask");
        vids.add("Tikufelanji");
        vids.add("Tikufelanji");
        vids.add("Tikufelanji");
        vids.add("Tikufelanji");

        ArrayAdapter vidsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, vids);

        vidsView.setAdapter(vidsAdapter);
        vidsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Listview.this, vids.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });


        ratingSpinner = findViewById(R.id.rate);
        ArrayList<String> rateText = new ArrayList<>();
        rateText.add("Marvelous");
        rateText.add("Very Good");
        rateText.add("Good");
        rateText.add("Bad");
        rateText.add("Worse");

        ArrayAdapter rateAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, rateText);

        ratingSpinner.setAdapter(rateAdapter);

        ratingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(Listview.this, rateText.get(position) + " Selected", Toast.LENGTH_SHORT).show();
                Toast.makeText(Listview.this, ratingSpinner.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}



















