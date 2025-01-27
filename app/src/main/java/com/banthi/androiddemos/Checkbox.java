package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


public class Checkbox extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private TextView text;
    private CheckBox bmwCheckbox;
    private CheckBox benzCheckbox;
    private CheckBox hundaiCheckbox;
    private Button nextBtn;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        text = findViewById(R.id.car_selection_text);
        bmwCheckbox = findViewById(R.id.bmw);
        benzCheckbox = findViewById(R.id.benz);
        hundaiCheckbox = findViewById(R.id.hundai);
        nextBtn = findViewById(R.id.nextBtn);

        bmwCheckbox.setOnCheckedChangeListener(this);
        benzCheckbox.setOnCheckedChangeListener(this);
        hundaiCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    Toast.makeText(Checkbox.this, "Hundai marked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Checkbox.this, "Hundai unmarked", Toast.LENGTH_SHORT).show();
            }
        });
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.getId() == R.id.bmw) {
            if (isChecked)
                Toast.makeText(this, "BMW marked", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "BMW unmarked", Toast.LENGTH_SHORT).show();
        }

        if (buttonView.getId() == R.id.benz) {
            if (isChecked)
                Toast.makeText(this, "Mercedes Benz marked", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Mercedes Benz unmarked", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nextBtn) {
            Intent intent = new Intent(Checkbox.this, RadioBtn.class);
            startActivity(intent);
        }
    }
}