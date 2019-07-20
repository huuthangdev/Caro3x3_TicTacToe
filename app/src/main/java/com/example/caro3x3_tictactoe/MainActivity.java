package com.example.caro3x3_tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button start, start2, end;
    ImageView diaxoay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.buttonstart);
        start2 = findViewById(R.id.buttonstart2);
        end = findViewById(R.id.buttonend);
        RotateNow();
        start.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Computer.class);
            startActivity(intent);
        });
        start2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PVP.class);
            startActivity(intent);
        });
        end.setOnClickListener(view -> finish());
    }

    public void RotateNow() {
        diaxoay = findViewById(R.id.img_diaxoay);
        RotateAnimation rotate = new RotateAnimation(0, 359, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000);
        rotate.setRepeatCount(Animation.INFINITE);
        rotate.setInterpolator(new LinearInterpolator());
        diaxoay.startAnimation(rotate);
    }
}