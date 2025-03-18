package com.banthi.androiddemos;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.banthi.androiddemos.contactRecyclerView.ContactRecyclerView;
import com.google.android.material.snackbar.Snackbar;

public class SnackBar extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        parent = findViewById(R.id.parent);

        Button normalBtn = findViewById(R.id.normalSnackbar);
        Button actionBtn = findViewById(R.id.actionSnackbar);
        Button nextBtn = findViewById(R.id.finishBtn);
        normalBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        actionBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.finishBtn) {
            Intent intent = new Intent(this, ContactRecyclerView.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.normalSnackbar) {
            Snackbar.make(parent, "Hello user...", Snackbar.LENGTH_SHORT).setTextColor(Color.CYAN).show();
        }

        if (v.getId() == R.id.actionSnackbar) {
            Snackbar.make(parent, "Hello user...", Snackbar.LENGTH_INDEFINITE).setAction(
                            "Goodbye", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(SnackBar.this, "Goodbye User", Toast.LENGTH_SHORT).show();
                                }
                            }
                    )
                    .setActionTextColor(getColor(R.color.light_green))
                    .setTextColor(getResources().getColor(R.color.yellow, null))
                    .show();
        }
    }
}