package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class XMLFiles extends AppCompatActivity {
    private TextView title ;
    private TextView greeting ;
    private Button nextBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlfiles);

        String greet = getString(R.string.greeting);
        Toast.makeText(this, greet + " Lonje", Toast.LENGTH_SHORT).show();

        nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XMLFiles.this, MaterialDesign1.class);
                startActivity(intent);
            }
        });
    }
}