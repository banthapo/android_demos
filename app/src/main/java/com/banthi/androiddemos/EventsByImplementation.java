package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class EventsByImplementation extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView display;
    private EditText text;
    private Button grabBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_by_implementation);

        display = findViewById(R.id.textDisplay);
        grabBtn = findViewById(R.id.grabTxtBtn);
        text = findViewById(R.id.text);

        grabBtn.setOnClickListener(this);
        display.setOnClickListener(this);
        text.setOnClickListener(this);

        grabBtn.setOnLongClickListener(this);
//        grabBtn.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Toast.makeText(EventsByImplementation.this, "Long press:: text from main class", Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });
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