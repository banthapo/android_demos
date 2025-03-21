package com.banthi.androiddemos;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class Fonts extends AppCompatActivity {
    private TextView title;

    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonts);

        Button changeBtn = findViewById(R.id.change_btn);
        Button nextBtn = findViewById(R.id.finishBtn);
        title = findViewById(R.id.font_title);

        /* does not work on APIs below 26 */
//        Typeface titleFace = getResources().getFont(R.font.android101);

        /* Alternative for the above */
        Typeface titleFace = ResourcesCompat.getFont(this, R.font.android101);
        Typeface titleFace2 = ResourcesCompat.getFont(this, R.font.droid_serif_bold_italic);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fonts.this, XMLFiles.class);
                startActivity(i);
            }
        });


        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num % 2 == 0) {
                    title.setTypeface(titleFace);
                    num++;
                } else {
                    title.setTypeface(titleFace2);
                    num++;
                }
            }
        });
    }
}