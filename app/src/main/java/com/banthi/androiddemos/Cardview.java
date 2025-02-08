package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cardview extends AppCompatActivity {
    private Button cButton;
    private CardView card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        cButton = findViewById(R.id.cardButton);
        card = findViewById(R.id.mCardView);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCardView(v);
            }
        });

    }

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