package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideDetour extends AppCompatActivity {
    private ImageView avatar, simpleImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_detour);

        avatar = findViewById(R.id.avatar);
        simpleImage = findViewById(R.id.simpleImage);

        avatar.setImageResource(R.mipmap.ic_accounts_round);

        Glide
                .with(this)
                .load("https://media.istockphoto.com/id/1442556244/photo/portrait-of-young-beautiful-woman-with-perfect-smooth-skin-isolated-over-white-background.jpg?s=612x612&w=0&k=20&c=4S7HufG4HDXznwuxFdliWndEAcWGKGvgqC45Ig0Zqog=")
                .error(R.drawable.ic_logout_background)
                .into(simpleImage);

    }
}