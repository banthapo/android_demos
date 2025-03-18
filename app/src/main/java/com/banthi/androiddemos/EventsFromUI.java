package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        TextView display = findViewById(R.id.helloTxt);
        display.setText("Hello user");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Intent intent = new Intent(EventsFromUI.this, EventsByImplementation.class);
                startActivity(intent);
            }
        });
        t.start();
    }

    public void onNextBtnClick(View v) {
        Intent i = new Intent(this, EventsByImplementation.class);
        startActivity(i);
    }
}