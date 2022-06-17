package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    Animation topAnimation, bottomAnimation;
    private ProgressBar pb;
    ImageView logo;
    TextView appname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo = (ImageView) findViewById(R.id.logo);
        appname = (TextView) findViewById(R.id.appname);

        logo.setAnimation(topAnimation);
        appname.setAnimation(bottomAnimation);

        pb = (ProgressBar) findViewById(R.id.progress);

        Thread t=new Thread() {
            public void run() {

                try {

                    for (int progress = 0; progress <= 100; progress+=10)
                    {
                        Thread.sleep(1000);
                        pb.setProgress(progress);
                    }


                    Intent i=new Intent(SplashScreen.this, org.tensorflow.lite.examples.classification.Dashboard.class);
                    startActivity(i);


                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };


        t.start();

    }
}
