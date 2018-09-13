package com.example.arisht.cubewallpaper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);



        Typeface tf1 = Typeface.createFromAsset(getAssets(), "Babylon.ttf");
        TextView sp1 = (TextView) findViewById(R.id.text);
        TextView sp2 = (TextView) findViewById(R.id.text2);
       sp1.setTypeface(tf1);
        sp2.setTypeface(tf1);

        //animation

        ImageView iv = (ImageView) findViewById(R.id.logo);
        Animation a1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        sp1.startAnimation(a1);

        sp2.startAnimation(a1);
        Animation a2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        iv.startAnimation(a2);

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4500);
                    Intent i = new Intent(Splash.this, Main.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

}
