package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CordLayout extends AppCompatActivity implements View.OnClickListener {
    private Button prevBtn, nextBtn;
    private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cord_layout);

        prevBtn = findViewById(R.id.prevBtn);
        nextBtn = findViewById(R.id.finishBtn);
        
        prevBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.prevBtn){
            intent = new Intent(this, LinLayout.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.finishBtn){
            intent = new Intent(this, Images.class);
            startActivity(intent);
//            Toast.makeText(this, "Next Clicked...", Toast.LENGTH_SHORT).show();
        }
    }
}