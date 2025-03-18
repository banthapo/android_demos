package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class XMLFiles extends AppCompatActivity {
    private TextView title ;
    private TextView greeting ;
    private Button finishBtn;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlfiles);

        String greet = getString(R.string.greeting);
        Toast.makeText(this, greet + " Lonje", Toast.LENGTH_SHORT).show();

        finishBtn = findViewById(R.id.finishBtn);
        finishBtn.setText("Finish");
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                isDestroyed();
            }
        });
    }
}