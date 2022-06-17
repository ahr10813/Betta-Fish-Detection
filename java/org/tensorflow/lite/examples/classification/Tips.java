package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Tips extends AppCompatActivity {

    ImageView veil, spade, doublee, hsun, hmoon, hmoonp, crown, rose, delta, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        veil = (ImageView) findViewById(R.id.veiltail);
        spade = (ImageView) findViewById(R.id.spadetail);
        doublee = (ImageView) findViewById(R.id.doubletail);
        delta = (ImageView) findViewById(R.id.deltatail);
        crown = (ImageView) findViewById(R.id.crowntail);
        rose = (ImageView) findViewById(R.id.rose);
        hsun = (ImageView) findViewById(R.id.halfsun);
        hmoon = (ImageView) findViewById(R.id.halfmoon);
        hmoonp = (ImageView) findViewById(R.id.halfmoonp);
        exit = (ImageView) findViewById(R.id.exit);

        crown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Crowntail.class);
                startActivity(i);
            }
        });

        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Rosetail.class);
                startActivity(i);
            }
        });

        veil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Veiltail.class);
                startActivity(i);
            }
        });

        spade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Spadetail.class);
                startActivity(i);
            }
        });

        doublee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, Doubletail.class);
                startActivity(i);
            }
        });

        delta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Deltatail.class);
                startActivity(i);
            }
        });

        hmoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Halfmoon.class);
                startActivity(i);
            }
        });

        hmoonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Plakat.class);
                startActivity(i);
            }
        });

        hsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, org.tensorflow.lite.examples.classification.Halfsun.class);
                startActivity(i);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tips.this, Dashboard.class);
                startActivity(i);
                finish();
            }
        });
    }
}