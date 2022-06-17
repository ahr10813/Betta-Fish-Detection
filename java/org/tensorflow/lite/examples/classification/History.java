package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class History extends AppCompatActivity {

    ImageView com, nme, pt, ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        com = (ImageView) findViewById(R.id.come);
        nme = (ImageView) findViewById(R.id.namee);
        pt = (ImageView) findViewById(R.id.pat);
        ps = (ImageView) findViewById(R.id.pop);

        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(History.this, org.tensorflow.lite.examples.classification.history_one.class);
                startActivity(i);
            }
        });

        nme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(History.this, org.tensorflow.lite.examples.classification.history_two.class);
                startActivity(i);
            }
        });

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(History.this, org.tensorflow.lite.examples.classification.history_three.class);
                startActivity(i);
            }
        });

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(History.this, org.tensorflow.lite.examples.classification.history_four.class);
                startActivity(i);
            }
        });
    }
}