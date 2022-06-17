package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    ImageView cam, mat, gen, tip, his, type, exitt, ht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ht = (ImageView) findViewById(R.id.health);
        cam = (ImageView) findViewById(R.id.camera);
        mat = (ImageView) findViewById(R.id.match);
        gen = (ImageView) findViewById(R.id.gender);
        tip = (ImageView) findViewById(R.id.tips);
        his = (ImageView) findViewById(R.id.history);
        type = (ImageView) findViewById(R.id.types);
        exitt = (ImageView) findViewById(R.id.exitmain);

        exitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.Tips.class);
                startActivity(i);
            }
        });

        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.health.class);
                startActivity(i);
            }
        });

        his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.History.class);
                startActivity(i);
            }
        });

        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.Types.class);
                startActivity(i);
            }
        });

        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.ClassifierActivity.class);
                startActivity(i);
            }
        });

        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.MainActivity.class);
                startActivity(i);
            }
        });

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, org.tensorflow.lite.examples.classification.Gender.class);
                startActivity(i);
            }
        });
    }
}