package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.telephony.TelephonyCallback;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAlpha, btnScale, btnTranslate, btnRotate;
        TextView txtAnim;


        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);
        txtAnim = findViewById(R.id.txtAnim);

        //Translate button animation
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                txtAnim.startAnimation(move);
            }
        });

        //Alpha button animation
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });

        //Scale button animation
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });

        //rotate button animation
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                txtAnim.startAnimation(rotate);
            }
        });
 }
}