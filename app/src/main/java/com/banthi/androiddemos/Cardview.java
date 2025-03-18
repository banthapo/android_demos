package com.banthi.androiddemos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Cardview extends AppCompatActivity {
    private Button cButton;
    private CardView card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        cButton = findViewById(R.id.cardButton);
        Button nextBtn = findViewById(R.id.finishBtn);
        card = findViewById(R.id.mCardView);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCardView(v);
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardview.this, GlideDetour.class);
                startActivity(intent);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void handleCardView(View v) {
        if (card.getVisibility() == View.GONE) {
            cButton.setText("Hide Card");
            card.setVisibility(v.VISIBLE);
        } else if (card.getVisibility() == View.VISIBLE) {
            cButton.setText("Show Card");
            card.setVisibility(v.GONE);
        }
    }
}