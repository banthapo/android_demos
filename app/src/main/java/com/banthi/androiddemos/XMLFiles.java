package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class XMLFiles extends AppCompatActivity {
    private TextView title ;
    private TextView greeting ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlfiles);

        String greet = getString(R.string.greeting);
        Toast.makeText(this, greet + " Lonje", Toast.LENGTH_SHORT).show();
    }
}