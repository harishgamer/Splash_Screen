package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static  int SPLASH_SCREEN= 2500;

    //Variables for Animation
    Animation top,bottom;

    ImageView image;
    TextView skct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //Animation
        top = AnimationUtils.loadAnimation(this,R.anim.hari1);
        bottom = AnimationUtils.loadAnimation(this,R.anim.hari2);

        //hooks
        image = findViewById(R.id.imageView);
        skct = findViewById(R.id.textView2);

        image.setAnimation(top);
        skct.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
