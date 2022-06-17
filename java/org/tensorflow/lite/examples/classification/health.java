package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class health extends AppCompatActivity {

    TextView s1, s2, s3, s4, s5, s6, s7, s8, s9, sname, sname1, sname2, sname3, sname4, sname5, sname6, sname7, sname8,sd;
    ImageView simage, simage1, simage2, simage3, simage4, simage5, simage6, simage7, simage8;
    TableLayout t1, t2, t3,t4, t5, t6, t7, t8, t9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        s1 = (TextView) findViewById(R.id.symp1);
        s2 = (TextView) findViewById(R.id.symp2);
        s3 = (TextView) findViewById(R.id.symp3);
        s4 = (TextView) findViewById(R.id.symp4);
        s5 = (TextView) findViewById(R.id.symp5);
        s6 = (TextView) findViewById(R.id.symp6);
        s7 = (TextView) findViewById(R.id.symp7);
        s8 = (TextView) findViewById(R.id.symp8);
        s9 = (TextView) findViewById(R.id.symp9);
        sname = (TextView) findViewById(R.id.diseasename);
        sname1 = (TextView) findViewById(R.id.diseasename1);
        sname2 = (TextView) findViewById(R.id.diseasename2);
        sname3 = (TextView) findViewById(R.id.diseasename3);
        sname4 = (TextView) findViewById(R.id.diseasename4);
        sname5 = (TextView) findViewById(R.id.diseasename5);
        sname6 = (TextView) findViewById(R.id.diseasename6);
        sname7 = (TextView) findViewById(R.id.diseasename7);
        sname8 = (TextView) findViewById(R.id.diseasename8);
        simage = (ImageView) findViewById(R.id.diseaseimage);
        simage1 = (ImageView) findViewById(R.id.diseaseimage1);
        simage2 = (ImageView) findViewById(R.id.diseaseimage2);
        simage3 = (ImageView) findViewById(R.id.diseaseimage3);
        simage4 = (ImageView) findViewById(R.id.diseaseimage4);
        simage5 = (ImageView) findViewById(R.id.diseaseimage5);
        simage6 = (ImageView) findViewById(R.id.diseaseimage6);
        simage7 = (ImageView) findViewById(R.id.diseaseimage7);
        simage8 = (ImageView) findViewById(R.id.diseaseimage8);
        sd =  (TextView) findViewById(R.id.disease);

        t1 = (TableLayout) findViewById(R.id.diseasetable);
        t2 = (TableLayout) findViewById(R.id.diseasetable1);
        t3 = (TableLayout) findViewById(R.id.diseasetable2);
        t4 = (TableLayout) findViewById(R.id.diseasetable3);
        t5 = (TableLayout) findViewById(R.id.diseasetable4);
        t6 = (TableLayout) findViewById(R.id.diseasetable5);
        t7 = (TableLayout) findViewById(R.id.diseasetable6);
        t8 = (TableLayout) findViewById(R.id.diseasetable7);
        t9 = (TableLayout) findViewById(R.id.diseasetable8);



        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname.setText("Columnaris (Cotton Wool or Mouth Fungus)");
                sname.setVisibility(View.VISIBLE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                simage.setImageResource(R.drawable.symp1);
                simage.setVisibility(View.VISIBLE);
                sd.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname1.setText("Dropsy (Pineconing))");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.VISIBLE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                simage1.setImageResource(R.drawable.symp2);
                sd.setVisibility(View.VISIBLE);
                simage1.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t2.setVisibility(View.VISIBLE);
                t1.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname2.setText("Hole in Head");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.VISIBLE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                sd.setVisibility(View.VISIBLE);
                simage2.setImageResource(R.drawable.symp3);
                simage2.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t3.setVisibility(View.VISIBLE);
                t1.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname3.setText("Ich/Ick");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.VISIBLE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                sd.setVisibility(View.VISIBLE);
                simage3.setImageResource(R.drawable.symp4);
                simage3.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t4.setVisibility(View.VISIBLE);
                t3.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname4.setText("Fin & Tail Rot");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.VISIBLE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                sd.setVisibility(View.VISIBLE);
                simage4.setImageResource(R.drawable.symp5);
                simage4.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t5.setVisibility(View.VISIBLE);
                t4.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname5.setText("Popeye");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.VISIBLE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                sd.setVisibility(View.VISIBLE);
                simage5.setImageResource(R.drawable.symp6);
                simage5.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t6.setVisibility(View.VISIBLE);
                t5.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname6.setText("Swim Bladder Disease & Disorder");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.VISIBLE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.GONE);
                sd.setVisibility(View.VISIBLE);
                simage6.setImageResource(R.drawable.symp7);
                simage6.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage7.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t7.setVisibility(View.VISIBLE);
                t6.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname7.setText("Tumor");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.VISIBLE);
                sname8.setVisibility(View.GONE);
                sd.setVisibility(View.VISIBLE);
                simage7.setImageResource(R.drawable.symp8);
                simage7.setVisibility(View.VISIBLE);
                simage8.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t8.setVisibility(View.VISIBLE);
                t7.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
                t9.setVisibility(View.GONE);
            }
        });

        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname8.setText("Velvet");
                sname.setVisibility(View.GONE);
                sname1.setVisibility(View.GONE);
                sname2.setVisibility(View.GONE);
                sname3.setVisibility(View.GONE);
                sname4.setVisibility(View.GONE);
                sname5.setVisibility(View.GONE);
                sname6.setVisibility(View.GONE);
                sname7.setVisibility(View.GONE);
                sname8.setVisibility(View.VISIBLE);
                sd.setVisibility(View.VISIBLE);
                simage8.setImageResource(R.drawable.symp9);
                simage8.setVisibility(View.VISIBLE);
                simage7.setVisibility(View.GONE);
                simage6.setVisibility(View.GONE);
                simage5.setVisibility(View.GONE);
                simage4.setVisibility(View.GONE);
                simage3.setVisibility(View.GONE);
                simage2.setVisibility(View.GONE);
                simage1.setVisibility(View.GONE);
                simage.setVisibility(View.GONE);
                t9.setVisibility(View.VISIBLE);
                t8.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
            }
        });

    }
}