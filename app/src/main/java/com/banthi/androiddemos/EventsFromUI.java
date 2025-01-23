package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EventsFromUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_from_ui);

    }

    public void onBtnClick(View v) {
        System.out.println("Btn clicked!");
        TextView display = findViewById(R.id.helloTxt);
        display.setText("Hello user");

    }
}