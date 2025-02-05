package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

public class Images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
    }

    public void handleNext(View v) {
        SystemClock.sleep(2000);
        Intent i = new Intent(Images.this, Listview.class);
        startActivity(i);
    }
}