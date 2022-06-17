package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MidAct6 extends AppCompatActivity {

    TextView tv1, tv2;
    LinearLayout llll1, llll2, llll3, llll4, llll5, llll6, llll7, llll8, llll9;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_act6);
        tv1 =   findViewById(R.id.tev11);
        tv2 =   findViewById(R.id.tev12);
        btn1 =   findViewById(R.id.bbtn11);
        llll1 = findViewById(R.id.llll1);
        llll2 = findViewById(R.id.llll2);
        llll3 = findViewById(R.id.llll3);
        llll4 = findViewById(R.id.llll4);
        llll5 = findViewById(R.id.llll5);
        llll6 = findViewById(R.id.llll6);
        llll7 = findViewById(R.id.llll7);
        llll8 = findViewById(R.id.llll8);
        llll9 = findViewById(R.id.llll9);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message6");
        tv2.setText(str);

        if (tv2.getText().toString().equalsIgnoreCase("0 CROWNTAIL")) {
            llll1.setVisibility(View.VISIBLE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Crowntail Male");

        }
        if (tv2.getText().toString().equalsIgnoreCase("1 DELTATAIL")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.VISIBLE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Deltatail Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("2 DOUBLETAIL")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.VISIBLE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Doubletail Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("3 HALFMOON")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.VISIBLE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Halfmoon Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("4 PLAKAT")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.VISIBLE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Plakat Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("5 HALFSUN")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.VISIBLE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Halfsun Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("7 ROSETAIL")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.VISIBLE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Rosetail Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("8 SPADETAIL")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.VISIBLE);
            llll9.setVisibility(View.GONE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Spadetail Male");
        }
        if (tv2.getText().toString().equalsIgnoreCase("9 VEILTAIL")) {
            llll1.setVisibility(View.GONE);
            llll2.setVisibility(View.GONE);
            llll3.setVisibility(View.GONE);
            llll4.setVisibility(View.GONE);
            llll5.setVisibility(View.GONE);
            llll6.setVisibility(View.GONE);
            llll7.setVisibility(View.GONE);
            llll8.setVisibility(View.GONE);
            llll9.setVisibility(View.VISIBLE);
            tv2.setVisibility(View.GONE);

            tv1.setText("Veiltail Male");
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MidAct6.this, result.class);
                startActivity(i);

            }
        });
    }
}