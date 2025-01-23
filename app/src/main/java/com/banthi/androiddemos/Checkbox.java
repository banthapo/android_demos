package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Checkbox extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private View bmwCheckbox;
    private View benzCheckbox;
    private View hundaiCheckbox;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        text = findViewById(R.id.car_selection_text);
        bmwCheckbox = findViewById(R.id.bmw);
        benzCheckbox = findViewById(R.id.benz);
        hundaiCheckbox = findViewById(R.id.hundai);

        text.setOnClickListener(this);
        bmwCheckbox.setOnClickListener(this);
        benzCheckbox.setOnClickListener(this);
//        hundaiCheckbox.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.car_selection_text) {
            Toast.makeText(this, "Car selection text clicked", Toast.LENGTH_LONG).show();
        }
        if (v.getId() == R.id.bmw) {
            if (v.isDirty())
                Toast.makeText(this, "BMW marked", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "BMW unmarked", Toast.LENGTH_LONG).show();
        }
        if (v.getId() == R.id.benz) {
//            Toast.makeText(this, "Benz clicked", Toast.LENGTH_LONG).show();
        }
        if (v.getId() == R.id.hundai) {
//            Toast.makeText(this, "Hundai clicked", Toast.LENGTH_LONG).show();
        }

    }

}