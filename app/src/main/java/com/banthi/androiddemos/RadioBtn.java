package com.banthi.androiddemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioBtn extends AppCompatActivity {
    private RadioGroup rgGender;
    private ProgressBar progressCircular;
    private ProgressBar progressLinear;
    private Button nextBtn;
    private Thread t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rgGender = findViewById(R.id.rgGender);
        progressCircular = findViewById(R.id.progressCircular);
        progressLinear = findViewById(R.id.progressLinear);
        nextBtn = findViewById(R.id.nextBtn);

        /* Doing something without an event */
        int radioBtnId = rgGender.getCheckedRadioButtonId();
        handleRadioBtn(radioBtnId);


        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                handleRadioBtn(checkedId);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RadioBtn.this, "Next Button Clicked!!!", Toast.LENGTH_SHORT).show();
                progressCircular.setVisibility(View.VISIBLE);
                progressLinear.setProgress(0);

                t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            progressLinear.incrementProgressBy(10);
                            SystemClock.sleep(600);
                        }
                        try {
                            progressCircular.setVisibility(View.GONE);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                t.start();

            }
        });
    }

    private void handleRadioBtn(int id) {
        progressCircular.setVisibility(View.GONE);
        if (id == R.id.rbMale) {
            Toast.makeText(this, "Male selected", Toast.LENGTH_SHORT).show();
            progressLinear.setProgress(10);
        }

        if (id == R.id.rbFemale) {
            Toast.makeText(this, "Female selected", Toast.LENGTH_SHORT).show();
            progressLinear.setProgress((int) 40.6);

        }
        if (id == R.id.rbOthers) {
            Toast.makeText(this, "Others selected", Toast.LENGTH_SHORT).show();
            progressLinear.setProgress(80);

        }
    }
}














