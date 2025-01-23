package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class EventsByImplementation extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_by_implementation);

        Button grabBtn = findViewById(R.id.grabTxtBtn);
        grabBtn.setOnClickListener(this);
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
    }

    private void handleGrabbedTxt() {
        EditText text = findViewById(R.id.text);
        TextView display = findViewById(R.id.textDisplay);

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