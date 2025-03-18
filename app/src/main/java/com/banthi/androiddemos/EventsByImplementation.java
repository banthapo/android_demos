package com.banthi.androiddemos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EventsByImplementation extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_by_implementation);

        display = findViewById(R.id.textDisplay);
        Button grabBtn = findViewById(R.id.grabTxtBtn);
        Button nextBtn = findViewById(R.id.finishBtn);
//        Button grabBtn = findViewById(R.id.grabTxtBtn);
        EditText editText = findViewById(R.id.text);

        grabBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        display.setOnClickListener(this);
        editText.setOnClickListener(this);

        grabBtn.setOnLongClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.grabTxtBtn) {
            handleGrabbedTxt();
        }
        if (v.getId() == R.id.textDisplay) {
            handleTxtClick();
        }
        if (v.getId() == R.id.text) {
            handleInputClick();
        }
        if (v.getId() == R.id.finishBtn) {
            Intent i = new Intent(this, Checkbox.class);
            startActivity(i);
        }
    }

    private void handleInputClick() {
        System.out.println("input clicked!!!");
    }

    private void handleTxtClick() {
        display.setText("Cleared...");
        Toast.makeText(this, "text clicked", Toast.LENGTH_LONG).show();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Intent intent = new Intent(EventsByImplementation.this, Checkbox.class);
                startActivity(intent);
            }
        });
        t.start();
    }

    private void handleGrabbedTxt() {
        EditText text = findViewById(R.id.text);

        String txt = String.valueOf(text.getText());
        display.setText(txt);

    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.grabTxtBtn)
            Toast.makeText(EventsByImplementation.this, "Long press:: text from the method", Toast.LENGTH_LONG).show();

        return true;
    }


}