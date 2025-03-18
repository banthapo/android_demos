package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MaterialDesign1 extends AppCompatActivity implements View.OnClickListener {
    private Button cancel, nextBtn, prevBtn;
    private FloatingActionButton phoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design1);

        cancel = findViewById(R.id.cancelBtn);
        nextBtn = findViewById(R.id.finishBtn);
        prevBtn = findViewById(R.id.prevBtn);
        phoneBtn = findViewById(R.id.phoneBtn);

        cancel.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        prevBtn.setOnClickListener(this);
        phoneBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.phoneBtn) {
            Toast.makeText(this, "Phone Clicked", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.prevBtn) {
            Intent intent = new Intent(this, GlideDetour.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.cancelBtn) {
            Toast.makeText(this, "Cancel Clicked", Toast.LENGTH_LONG).show();
        }   if (v.getId() == R.id.finishBtn) {
            Intent intent = new Intent(this, SnackBar.class);
            startActivity(intent);
        }

    }
}