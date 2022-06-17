package org.tensorflow.lite.examples.classification;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView, imageView2, imageView3, imageView4, imageView5;
    Button btnclear;
    private RadioGroup group1, group2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);
        imageView5 = findViewById(R.id.image5);
        group1 = findViewById(R.id.radioGroup1);
        group2 = findViewById(R.id.radioGroup2);

        btnclear = findViewById(R.id.btnclear);
        Button button = findViewById(R.id.answerBtn);
        final RadioButton crowntailm = findViewById(R.id.crowntailm);
        final RadioButton deltam = findViewById(R.id.deltam);
        final RadioButton doublem = findViewById(R.id.doublem);
        final RadioButton halfmoonm = findViewById(R.id.halfmoonm);
        final RadioButton plakatm = findViewById(R.id.plakatm);
        final RadioButton halfsunm = findViewById(R.id.halfsunm);
        final RadioButton rosem = findViewById(R.id.rosem);
        final RadioButton veilm = findViewById(R.id.veilm);
        final RadioButton spadem = findViewById(R.id.spadem);

        final RadioButton crowntailf = findViewById(R.id.crowntailf);
        final RadioButton deltaf = findViewById(R.id.deltaf);
        final RadioButton doublef = findViewById(R.id.doublef);
        final RadioButton halfmoonf = findViewById(R.id.halfmoonf);
        final RadioButton plakatf = findViewById(R.id.plakatf);
        final RadioButton halfsunf = findViewById(R.id.halfsunf);
        final RadioButton rosef = findViewById(R.id.rosef);
        final RadioButton veilf = findViewById(R.id.veilf);
        final RadioButton spadef = findViewById(R.id.spadef);

        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);
        final TextView textView4 = findViewById(R.id.textView4);
        final TextView textView5 = findViewById(R.id.question1);
        final TextView textView6 = findViewById(R.id.question2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("GENETICS");
                textView3.setText("BREEDING OUTCOME");
                ////////// Crowntail //////////
                if (crowntailm.isChecked()&&crowntailf.isChecked()) {
                    textView2.setText("SINGLE TAIL BETTA – CTCT\n" +
                            "CROWNTAIL HOMOZYGOUS – ctct\n" +
                            "SINGLE TAIL BETTA WITH CROWNTAIL GEN – CTct");
                    textView4.setText("CROWNTAIL X NORMAL\n" +
                            "\t\t\t\t100% Crowntail-geno (CTct)\n" +
                            "CROWNTAIL-GENO X CROWNTAIL-GENO\n" +
                            "\t\t\t\t25% Crowntail (ctct)\n" +
                            "\t\t\t\t50% Crowntail-geno (CTct)\n" +
                            "\t\t\t\t25% Normal (CTCT)\n" +
                            "CROWNTAIL X CROWNTAIL\n" +
                            "\t\t\t\t100% Crowntail (ctct)\n" +
                            "CROWNTAIL-GENO X CROWNTAIL\n" +
                            "\t\t\t\t50% Crowntail (ctct)\n" +
                            "\t\t\t\t50% Crowntail-geno (CTct)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (crowntailm.isChecked()&&deltaf.isChecked()){
                    textView2.setText("CROWNTAIL, RECESSIVE – ctct\n" +
                            "DELTATAIL, DOMINANT – DETDET");
                    textView4.setText("ct X DET\n" +
                            "\t\t\t\t50% Crowntail\n" +
                            "\t\t\t\t25% Deltatail\n" +
                            "\t\t\t\t25% Halfsun\n");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (crowntailm.isChecked()&&doublef.isChecked()) {
                    textView2.setText("CROWNTAIL, PARTIAL DOMINANT – CTCT\n" +
                            "DOUBLETAIL, PARTIAL DOMINANT – dtdt");
                    textView4.setText("CT X dt\n" +
                            "\t\t\t\t100% Combtails with Doubletail genotype");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (crowntailm.isChecked()&&halfmoonf.isChecked()) {
                    textView2.setText("CROWNTAIL, DOMINANT – CTCT\n" +
                            "HALFMOON, RECESSIVE – hmhm");
                    textView4.setText("CT x hm\n" +
                            "\t\t\t\t70% Halfsun\n" +
                            "\t\t\t\t30% Crowntail Homozygous");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (crowntailm.isChecked()&&plakatf.isChecked()) {
                    textView2.setText("CROWNTAIL, PARTIAL DOMINANT – CTCT\n" +
                            "PLAKAT, RECESSIVE – pkpk");
                    textView4.setText("CT x pk\n" +
                            "\t\t\t\t20% Crowntail Plakat (CTPK) \n" +
                            "\t\t\t\t10% Halfsun \n" +
                            "\t\t\t\t70% Crowntail-geno");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (crowntailm.isChecked()&&halfsunf.isChecked()) {
                    textView2.setText("CROWNTAIL, PARTIAL DOMINANT – CTCT\n" +
                            "HALFSUN, CO-DOMINANT (Second Generation) – HSHS");
                    textView4.setText("CT x HS\n" +
                            "\t\t\t\t100% Halfsun");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (crowntailm.isChecked()&&rosef.isChecked()) {
                    textView2.setText("CROWNTAIL, DOMINANT – CTCT\n" +
                            "ROSETAIL, CO-DOMINANT (Second Generation) – RTRT");
                    textView4.setText("CT x rt\n" +
                            "\t\t\t\t80% Crowntail Homozygous\n" +
                            "\t\t\t\t20% HALFSUN");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (crowntailm.isChecked()&&veilf.isChecked()) {
                    textView2.setText("CROWNTAIL, RECESSIVE – ctct\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("ct x VT\n" +
                            "\t\t\t\t100% CT-geno\n" +
                            "\t\t\t\tVT, with or without CT markings, VT-CT geno with wider spread, delta tail with or without web reduction, Comb VT or delta ," +
                            "There should be No equal web reduction.");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (crowntailm.isChecked()&&spadef.isChecked()) {
                    textView2.setText("CROWNTAIL, DOMINANT – CTCT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("CT x st\n" +
                            "\t\t\t\t100% CT-geno");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                ////////// Deltatail //////////
                else if (deltam.isChecked()&&deltaf.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – DeTDeT\n" +
                            "DELTATAIL HOMOZYGOUS – detdet\n" +
                            "SINGLE TAIL BETTA W/ DELTATAIL GEN – DeTdet");
                    textView4.setText("DELTATAIL X NORMAL\n" +
                            "\t\t\t\t100% Deltatail-geno (DeTdet)\n" +
                            "DELTATAIL-GENO X DELTATAIL-GENO\n" +
                            "\t\t\t\t25% Deltatail (detdet)\n" +
                            "\t\t\t\t50% Deltatail-geno (DeTdet)\n" +
                            "\t\t\t\t25% normal (DeTDeT)\n" +
                            "DELTATAIL X DELTATAIL\n" +
                            "\t\t\t\t100% Deltatail (detdet)\n" +
                            "DELTATAIL-GENO X DELTATAIL\n" +
                            "\t\t\t\t50% Deltatail (detdet)\n" +
                            "\t\t\t\t50% Deltatail-geno (DeTdet)\n");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (deltam.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("CROWNTAIL, RECESSIVE – CTCT\n" +
                            "DELTATAIL, DOMINANT – DeT");
                    textView4.setText("CT X DeT\n" +
                            "\t\t\t\t60% Crowntail\n" +
                            "\t\t\t\t25% Deltatail\n" +
                            "\t\t\t\t15% Halfsun\n");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (deltam.isChecked()&&doublef.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "DOUBLETAIL, INTERMEDIAIR – dtdt");
                    textView4.setText("DeT x dt\n" +
                            "\t\t\t\t70% Deltatail\n" +
                            "\t\t\t\t30% Doubletail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (deltam.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "HALFMOON, RECESSIVE – hmhm");
                    textView4.setText("DeT x hm\n" +
                            "\t\t\t\t70% Deltatail\n" +
                            "\t\t\t\t30% Halfmoon");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (deltam.isChecked()&&plakatf.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "PLAKAT, RECCESSIVE – pkpk");
                    textView4.setText("DeT x pk\n" +
                            "\t\t\t\t100% Deltatail- heterozygous");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));

                }
                else if (deltam.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("DeT x HS\n" +
                            "\t\t\t\t80% Deltatail-heterozygous\n" +
                            "\t\t\t\t20% Crowntail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (deltam.isChecked()&&rosef.isChecked()){
                    textView2.setText("DELTATAIL, RECESSIVE – detdet\n" +
                            "ROSETAIL, DOMINANT – RTRT");
                    textView4.setText("det x RT\n" +
                            "\t\t\t\t50% Deltatail-heterozygous\n" +
                            "\t\t\t\t25% Rosetail\n" +
                            "\t\t\t\t25% Halfmoon");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (deltam.isChecked()&&veilf.isChecked()){
                    textView2.setText("DELTATAIL, RECESSIVE – detdet\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("det x VT\n" +
                            "\t\t\t\t50% Veiltail\n" +
                            "\t\t\t\t25% Roundtail\n" +
                            "\t\t\t\t25% Deltatail\n" +
                            "VeilTail is dominant over HalfMoon, thus results should be long finned; VT, VT with slightly wider spread, round tail, delta tail, NO HM.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (deltam.isChecked()&&spadef.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("DeT x st\n" +
                            "\t\t\t\t100% Deltatail-heterozygous");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                ////////// Doubletail //////////
                else if (doublem.isChecked()&&doublef.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – DTDT\n" +
                            "DOUBLETAIL HOMOZYGOUS – dtdt\n" +
                            "SINGLE TAIL BETTA W/ DOUBLETAIL GEN –DTdt");
                    textView4.setText("DOUBLETAIL X NORMAL\n" +
                            "\t\t\t\t100% Doubletail-geno (CTct)\n" +
                            "DOUBLETAIL-GENO X DOUBLETAIL-GENO\n" +
                            "\t\t\t\t25% Doubletail (ctct)\n" +
                            "\t\t\t\t50% Doubletail-geno (CTct)\n" +
                            "\t\t\t\t25% Normal (CTCT)\n" +
                            "DOUBLETAIL X DOUBLETAIL\n" +
                            "\t\t\t\t100% Doubletail (ctct)\n" +
                            "DOUBLETAIL-GENO X DOUBLETAIL\n" +
                            "\t\t\t\t50% Doubletail (ctct)\n" +
                            "\t\t\t\t50% Doubletail-geno (CTct)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (doublem.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "CROWNTAIL, DOMINANT – CTCT");
                    textView4.setText("dt x CT\n" +
                            "\t\t\t\t100% combtails with doubletail genotype");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (doublem.isChecked()&&deltaf.isChecked()){
                    textView2.setText("DOUBLETAIL, INTERMEDIAIR – dtdt\n" +
                            "DELTATAIL, DOMINANT – DeTDeT");
                    textView4.setText("dt x DeT\n" +
                            "\t\t\t\t70% Deltatail\n" +
                            "\t\t\t\t30% Doubletail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (doublem.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "HALFMOON, RECESSIVE – hmhm");
                    textView4.setText("dt x hm\n" +
                            "\t\t\t\t50% Doubletail-geno\n" +
                            "\t\t\t\t25% Halfmoon \n" +
                            "\t\t\t\t25% Deltatail \n" +
                            "Single Tail DeT and HM, Single tail HM and Delta with or without longer dorsal, DT with unequal caudal lobes.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (doublem.isChecked()&&plakatf.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "PLAKAT, RECESSIVE – pkpk");
                    textView4.setText("dt x pk\n" +
                            "\t\t\t\t50% Doubletail-geno\n" +
                            "\t\t\t\t50% Deltatail\n" +
                            "Similar to the CT, there should be 100% DT-geno. Physically fin length result is similar to PK x HM spawn. " +
                            "Most would be long single tails, long to short fins, " +
                            "some have uneven caudal lobes and long dorsal, some may have one caudal lobe but longer dorsal.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (doublem.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "HALFSUN, RECESSIVE – hshs");
                    textView4.setText("dt x hs\n" +
                            "\t\t\t\t80% Doubletail-heterozygous\n" +
                            "\t\t\t\t20% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (doublem.isChecked()&&rosef.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "ROSETAIL, RECESSIVE – rtrt");
                    textView4.setText("dt x rt\n" +
                            "\t\t\t\t70% Doubletail-heterozygous\n" +
                            "\t\t\t\t20% Halfmoon \n" +
                            "\t\t\t\t10% Rosetail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                }
                else if (doublem.isChecked()&&veilf.isChecked()){
                    textView2.setText("DOUBLETAIL, DOMINANT – DTDT\n" +
                            "VEILTAIL, RECESSIVE – vtvt");
                    textView4.setText("DT x vt\n" +
                            "\t\t\t\t100% Doubletail-geno\n" +
                            "Regular VT, VT with uneven caudal lobes or with longer dorsal, " +
                            "single tail VT with longer dorsal, regular VT, VT with wider spread.");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (doublem.isChecked()&&spadef.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("dt x st\n" +
                            "\t\t\t\t100% Doubletail-heterozygous");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                ////////// Halfmoon //////////
                else if (halfmoonm.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – HMHM\n" +
                            "HALFMOON HOMOZYGOUS – hmhm\n" +
                            "SINGLE TAIL BETTA W/ HALFMOON GEN – HMhm");
                    textView4.setText("HALFMOON X NORMAL\n" +
                            "\t\t\t\t100% HALFMOON-geno (HMhm)\n" +
                            "HALFMOON-GENO X HALFMOON-GENO\n" +
                            "\t\t\t\t25% Halfmoon (hmhm)\n" +
                            "\t\t\t\t50% Halfmoon-geno (HMhm)\n" +
                            "\t\t\t\t25% Normal (HMHM)\n" +
                            "HALFMOON X HALFMOON\n" +
                            "\t\t\t\t100% Halfmoon (hmhm)\n" +
                            "HALFMOON-GENO X HALFMOON\n" +
                            "\t\t\t\t50% Halfmoon (hmhm)\n" +
                            "\t\t\t\t50% Halfmoon-geno (HMhm)\n" +
                            "Halfmoon x non Halfmoon = little to no HM.\n" +
                            "Halfmoon x Halfmoon spawns often does not produce 100% halfmoon.\n" +
                            "A pair of HM from a bad line will only produce a few HM.\n" +
                            "A good pair of HM from a good line may produce 60% halfmoon or more.\n" +
                            "A Super delta from a good line can produce some good HM\n" +
                            "This applies to all fin types (HM, HMPK, HMCT, HMDT)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (halfmoonm.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "CROWNTAIL, DOMINANT – CTCT");
                    textView4.setText("hm x CT\n" +
                            "\t\t\t\t40% Halfsun\n" +
                            "\t\t\t\t60% Crowntail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (halfmoonm.isChecked()&&deltaf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "DELTATAIL, DOMINANT – DeTDeT");
                    textView4.setText("hm x DeT\n" +
                            "\t\t\t\t70% Deltatail\n" +
                            "\t\t\t\t30% Halfmoon");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (halfmoonm.isChecked()&&doublef.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "DOUBLETAIL, RECESSIVE – dtdt");
                    textView4.setText("hm x dt\n" +
                            "\t\t\t\t50% Doubletail-geno\n" +
                            "\t\t\t\t25% Halfmoon \n" +
                            "\t\t\t\t25% Deltatail \n" +
                            "Single Tail DeT and HM, Single tail HM and Delta with or without longer dorsal, " +
                            "DT with unequal caudal lobes.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (halfmoonm.isChecked()&&plakatf.isChecked()){
                    textView2.setText("HALFMOON, DOMINANT – HMHM\n" +
                            "PLAKAT, RECESSIVE – pkpk");
                    textView4.setText("HM x pk\n" +
                            "\t\t\t\t30% Deltatail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfmoonplakat");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (halfmoonm.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "HALFSUN, RECESSIVE – hshs");
                    textView4.setText("hm x hs\n" +
                            "\t\t\t\t50% Halfmoon\n" +
                            "\t\t\t\t50% Halfsun");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (halfmoonm.isChecked()&&rosef.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "ROSETAIL, RECESSIVE – rtrt");
                    textView4.setText("hm x rt\n" +
                            "\t\t\t\t25% Rosetail\n" +
                            "\t\t\t\t50% Halfmoon\n" +
                            "\t\t\t\t25% Deltatail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (halfmoonm.isChecked()&&veilf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("hm x VT\n" +
                            "\t\t\t\t50% Rosetail\n" +
                            "\t\t\t\t50% Deltatail\n" +
                            "VT, VT with wider caudal, RT, DeT.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (halfmoonm.isChecked()&&spadef.isChecked()){
                    textView2.setText("HALFMOON, DOMINANT– HMHM\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("HM x st\n" +
                            "\t\t\t\t60% Halfmoon\n" +
                            "\t\t\t\t40% Deltatail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                ////////// Plakat //////////
                else if (plakatm.isChecked()&&plakatf.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – PKPK\n" +
                            "PLAKAT HOMOZYGOUS – pkpk\n" +
                            "SINGLE TAIL BETTA WITH PLAKAT GEN – PKpk");
                    textView4.setText("PLAKAT X NORMAL\n" +
                            "\t\t\t\t100% plakat-geno (PKpk)\n" +
                            "PLAKAT-GENO X PLAKAT-GENO\n" +
                            "\t\t\t\t25% plakat (pkpk)\n" +
                            "\t\t\t\t50% plakat-geno (PKpk)\n" +
                            "\t\t\t\t25% Normal (PKPK)\n" +
                            "PLAKAT X PLAKAT\n" +
                            "\t\t\t\t100% plakat (pkpk)\n" +
                            "PLAKAT-GENO X PLAKAT\n" +
                            "\t\t\t\t50% plakat (pkpk)\n" +
                            "\t\t\t\t50% plakat-geno (PKpk)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (plakatm.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "CROWNTAIL, DOMINANT – CTCT");
                    textView4.setText("pk x  CT\n" +
                            "\t\t\t\t30% CTPK \n" +
                            "\t\t\t\t20% HALFSUN\n" +
                            "\t\t\t\t50% CROWNTAIL");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (plakatm.isChecked()&&deltaf.isChecked()){
                    textView2.setText("PLAKAT, RECCESSIVE – pkpk\n" +
                            "DELTATAIL, DOMINANT – DeTDeT");
                    textView4.setText("pk x DeT\n" +
                            "\t\t\t\t100% Deltatail-heterozygous");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (plakatm.isChecked()&&doublef.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "DOUBLETAIL, RECESSIVE – dtdt");
                    textView4.setText("pk x dt\n" +
                            "\t\t\t\t50% Doubletail-geno\n" +
                            "\t\t\t\t50% Deltatail\n" +
                            "Similar to the CT, there should be 100% DT-geno. Physically fin length result is similar to PK x HM spawn. " +
                            "Most would be long single tails, long to short fins, some have uneven caudal lobes and long dorsal, " +
                            "some may have one caudal lobe but longer dorsal.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (plakatm.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "HALFMOON, DOMINANT – HMHM");
                    textView4.setText("pk x HM\n" +
                            "\t\t\t\t30% Deltatail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfmoonplakat");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (plakatm.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("pk x HS\n" +
                            "\t\t\t\t30% Combtail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfmoonplakat");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (plakatm.isChecked()&&rosef.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "ROSETAIL, DOMINANT – RTRT");
                    textView4.setText("pk x RT\n" +
                            "\t\t\t\t30% Deltatail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfmoonplakat");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (plakatm.isChecked()&&veilf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pk\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("pk x RT\n" +
                            "\t\t\t\t50% Deltatail\n" +
                            "\t\t\t\t20% Plakat\n" +
                            "\t\t\t\t30% Veiltail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                }
                else if (plakatm.isChecked()&&spadef.isChecked()){
                    textView2.setText("PLAKAT, DOMINANT – PK\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("PK x st\n" +
                            "\t\t\t\t50% Halfmoonplakat\n" +
                            "\t\t\t\t30% Plakat\n" +
                            "\t\t\t\t20% Spadetail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.spadetailremove));
                }
                ////////// Halfsun //////////
                else if (halfsunm.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – HSHS\n" +
                            "HALFSUN HOMOZYGOUS – hshs\n" +
                            "SINGLE TAIL BETTA WITH HALFSUN GEN – HShs");
                    textView4.setText("HALFSUN X NORMAL\n" +
                            "\t\t\t\t100% halfsun-geno (HShs)\n" +
                            "HALFSUN-GENO X HALFSUN-GENO\n" +
                            "\t\t\t\t25% halfsun (hshs)\n" +
                            "\t\t\t\t50% halfsun-geno (HShs)\n" +
                            "\t\t\t\t25% Normal (HSHS)\n" +
                            "HALFSUN X HALFSUN\n" +
                            "\t\t\t\t100% halfsun (hshs)\n" +
                            "HALFSUN-GENO X HALFSUN\n" +
                            "\t\t\t\t50% halfsun (hshs)\n" +
                            "\t\t\t\t50% halfsun-geno (HShs)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfsunremove));
                }
                else if (halfsunm.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("CROWNTAIL, PARTIAL DOMINANT – CTCT\n" +
                            "HALFSUN, CO-DOMINANT (Second Generation) – HSHS");
                    textView4.setText("CT x HS\n" +
                            "\t\t\t\t100% Halfsun");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (halfsunm.isChecked()&&deltaf.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("DeT x HS\n" +
                            "\t\t\t\t80% Deltatail-heterozygous\n" +
                            "\t\t\t\t20% Crowntail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (halfsunm.isChecked()&&doublef.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "HALFSUN, RECESSIVE – hshs");
                    textView4.setText("dt x hs\n" +
                            "\t\t\t\t80% Doubletail-heterozygous\n" +
                            "\t\t\t\t20% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (halfsunm.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "HALFSUN, RECESSIVE – hshs");
                    textView4.setText("hm x hs\n" +
                            "\t\t\t\t50% Halfmoon\n" +
                            "\t\t\t\t50% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (halfsunm.isChecked()&&plakatf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("pk x HS\n" +
                            "\t\t\t\t30% Combtail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfmoonplakat");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (halfsunm.isChecked()&&rosef.isChecked()){
                    textView2.setText("ROSETAIL, RECESSIVE – rtrt\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("HS x rt\n" +
                            "\t\t\t\t30% Rosetail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (halfsunm.isChecked()&&veilf.isChecked()){
                    textView2.setText("VEILTAIL, DOMINANT – VTVT\n" +
                            "HALFSUN, RECESSIVE – hshs");
                    textView4.setText("hs x VT\n" +
                            "\t\t\t\t70% Veiltail\n" +
                            "\t\t\t\t20% Crowntail\n" +
                            "\t\t\t\t10% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (halfsunm.isChecked()&&spadef.isChecked()){
                    textView2.setText("SPADETAIL, RECESSIVE – stst\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("HS x st\n" +
                            "\t\t\t\t50% Veiltail\n" +
                            "\t\t\t\t30% Crowntail\n" +
                            "\t\t\t\t20% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                ////////// Rosetail //////////
                else if (rosem.isChecked()&&rosef.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – RTRT\n" +
                            "ROSETAIL HOMOZYGOUS – rtrt\n" +
                            "SINGLE TAIL BETTA WITH ROSETAIL GEN – RTrt");
                    textView4.setText("ROSETAIL X NORMAL\n" +
                            "\t\t\t\t100% rosetail-geno (RTrt)\n" +
                            "ROSETAIL-GENO X ROSETAIL-GENO\n" +
                            "\t\t\t\t25% rosetail (rtrt)\n" +
                            "\t\t\t\t50% rosetail-geno (RTrt)\n" +
                            "\t\t\t\t25% Normal (RTRT)\n" +
                            "ROSETAIL X ROSETAIL\n" +
                            "\t\t\t\t100% rosetail (rtrt)\n" +
                            "ROSETAIL-GENO X ROSETAIL\n" +
                            "\t\t\t\t50% rosetail (rtrt)\n" +
                            "\t\t\t\t50% rosetail-geno (RTrt)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                }
                else if (rosem.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("CROWNTAIL, DOMINANT – CTCT\n" +
                            "ROSETAIL, CO-DOMINANT (Second Generation) – RTRT");
                    textView4.setText("CT x rt\n" +
                            "\t\t\t\t80% Crowntail Homozygous\n" +
                            "\t\t\t\t20% HALFSUN");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (rosem.isChecked()&&deltaf.isChecked()){
                    textView2.setText("DELTATAIL, RECESSIVE – detdet\n" +
                            "ROSETAIL, DOMINANT – RTRT");
                    textView4.setText("det x RT\n" +
                            "\t\t\t\t50% Deltatail-heterozygous\n" +
                            "\t\t\t\t25% Rosetail\n" +
                            "\t\t\t\t25% Halfmoon");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (rosem.isChecked()&&doublef.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "ROSETAIL, RECESSIVE – rtrt");
                    textView4.setText("dt x rt\n" +
                            "\t\t\t\t70% Doubletail-heterozygous\n" +
                            "\t\t\t\t20% Halfmoon \n" +
                            "\t\t\t\t10% Rosetail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                }
                else if (rosem.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "ROSETAIL, RECESSIVE – rtrt");
                    textView4.setText("hm x rt\n" +
                            "\t\t\t\t25% Rosetail\n" +
                            "\t\t\t\t50% Halfmoon\n" +
                            "\t\t\t\t25% Deltatail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (rosem.isChecked()&&plakatf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pkpk\n" +
                            "ROSETAIL, DOMINANT – RTRT");
                    textView4.setText("pk x RT\n" +
                            "\t\t\t\t30% Deltatail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfmoonplakat");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                }
                else if (rosem.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("ROSETAIL, RECESSIVE – rtrt\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("HS x rt\n" +
                            "\t\t\t\t30% Rosetail\n" +
                            "\t\t\t\t40% Halfmoon\n" +
                            "\t\t\t\t30% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (rosem.isChecked()&&veilf.isChecked()){
                    textView2.setText("ROSETAIL, RECESSIVE – rtrt\n" +
                            "VEILTAIL, DOMINANT – HSHS");
                    textView4.setText("VT x rt\n" +
                            "\t\t\t\t30% Rosetail\n" +
                            "\t\t\t\t40% Veiltail\n" +
                            "\t\t\t\t30% Halfmoon\n" +
                            "VT, VT with wider caudal, RT carrier, DeT, SdeT/HM\n" +
                            "It is best to wait until F1 is 6 months before continuing your line.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (rosem.isChecked()&&spadef.isChecked()){
                    textView2.setText("ROSETAIL, DOMINANT – RTRT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("VT x rt\n" +
                            "\t\t\t\t10% Rosetail\n" +
                            "\t\t\t\t60% Veiltail\n" +
                            "\t\t\t\t30% Halfmoon\n" +
                            "VT, VT with wider caudal, RT carrier, DeT, SdeT/HM\n" +
                            "It is best to wait until F1 is 6 months before continuing your line.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                ////////// Veiltail //////////
                else if (veilm.isChecked()&&veilf.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – VTVT\n" +
                            "VEILTAIL HOMOZYGOUS – vtvt\n" +
                            "SINGLE TAIL BETTA WITH VEILTAIL GEN – VTvt");
                    textView4.setText("VEILTAIL X NORMAL\n" +
                            "\t\t\t\t100% veiltail-geno (VTvt)\n" +
                            "VEILTAIL-GENO X VEILTAIL-GENO\n" +
                            "\t\t\t\t25% veiltail (vtvt)\n" +
                            "\t\t\t\t50% veiltail-geno (VTvt)\n" +
                            "\t\t\t\t25% Normal (VTVT)\n" +
                            "VEILTAIL X VEILTAIL\n" +
                            "\t\t\t\t100% veiltail (vtvt)\n" +
                            "VEILTAIL-GENO X VEILTAIL\n" +
                            "\t\t\t\t50% veiltail (vtvt)\n" +
                            "\t\t\t\t50% veiltail-geno (VTvt)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                }
                else if (veilm.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("CROWNTAIL, RECESSIVE – ctct\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("ct x VT\n" +
                            "\t\t\t\t100% CT-geno\n" +
                            "\t\t\t\tVT, with or without CT markings, VT-CT geno with wider spread, delta tail with or without web reduction, Comb VT or delta ," +
                            "There should be No equal web reduction.");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (veilm.isChecked()&&deltaf.isChecked()){
                    textView2.setText("DELTATAIL, RECESSIVE – detdet\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("det x VT\n" +
                            "\t\t\t\t50% Veiltail\n" +
                            "\t\t\t\t25% Roundtail\n" +
                            "\t\t\t\t25% Deltatail\n" +
                            "VeilTail is dominant over HalfMoon, thus results should be long finned; VT, " +
                            "VT with slightly wider spread, round tail, delta tail, NO HM.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (veilm.isChecked()&&doublef.isChecked()){
                    textView2.setText("DOUBLETAIL, DOMINANT – DTDT\n" +
                            "VEILTAIL, RECESSIVE – vtvt");
                    textView4.setText("DT x vt\n" +
                            "\t\t\t\t100% Doubletail-geno\n" +
                            "Regular VT, VT with uneven caudal lobes or with longer dorsal, " +
                            "single tail VT with longer dorsal, regular VT, VT with wider spread.");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (veilm.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("HALFMOON, RECESSIVE – hmhm\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("hm x VT\n" +
                            "\t\t\t\t50% Rosetail\n" +
                            "\t\t\t\t50% Deltatail\n" +
                            "VT, VT with wider caudal, RT, DeT.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (veilm.isChecked()&&plakatf.isChecked()){
                    textView2.setText("PLAKAT, RECESSIVE – pk\n" +
                            "VEILTAIL, DOMINANT – VTVT");
                    textView4.setText("pk x RT\n" +
                            "\t\t\t\t50% Deltatail\n" +
                            "\t\t\t\t20% Plakat\n" +
                            "\t\t\t\t30% Veiltail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                }
                else if (veilm.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("VEILTAIL, DOMINANT – VTVT\n" +
                            "HALFSUN, RECESSIVE – hshs");
                    textView4.setText("hs x VT\n" +
                            "\t\t\t\t70% Veiltail\n" +
                            "\t\t\t\t20% Crowntail\n" +
                            "\t\t\t\t10% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (veilm.isChecked()&&rosef.isChecked()){
                    textView2.setText("ROSETAIL, RECESSIVE – rtrt\n" +
                            "VEILTAIL, DOMINANT – HSHS");
                    textView4.setText("VT x rt\n" +
                            "\t\t\t\t30% Rosetail\n" +
                            "\t\t\t\t40% Veiltail\n" +
                            "\t\t\t\t30% Halfmoon\n" +
                            "VT, VT with wider caudal, RT carrier, DeT, SdeT/HM\n" +
                            "It is best to wait until F1 is 6 months before continuing your line.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (veilm.isChecked()&&spadef.isChecked()){
                    textView2.setText("VEILTAIL, DOMINANT – VTVT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("VT x st\n" +
                            "\t\t\t\t70% Veiltail\n" +
                            "\t\t\t\t30% Halfmoon");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                ////////// Spadetail //////////
                else if (spadem.isChecked()&&spadef.isChecked()){
                    textView2.setText("SINGLE TAIL BETTA – STST\n" +
                            "SPADETAIL HOMOZYGOUS – stst\n" +
                            "SINGLE TAIL BETTA WITH SPADETAIL GEN – STst");
                    textView4.setText("SPADETAIL X NORMAL\n" +
                            "\t\t\t\t100% spadetail-geno (STst)\n" +
                            "SPADETAIL-GENO X SPADETAIL-GENO\n" +
                            "\t\t\t\t25% spadetail (stst)\n" +
                            "\t\t\t\t50% spadetail-geno (STst)\n" +
                            "\t\t\t\t25% Normal (STST)\n" +
                            "SPADETAIL X SPADETAIL\n" +
                            "\t\t\t\t100% spadetail (stst)\n" +
                            "SPADETAIL-GENO X SPADETAIL\n" +
                            "\t\t\t\t50% spadetail (stst)\n" +
                            "\t\t\t\t50% spadetail-geno (STst)");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.spadetailremove));
                }
                else if (spadem.isChecked()&&crowntailf.isChecked()){
                    textView2.setText("CROWNTAIL, DOMINANT – CTCT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("CT x st\n" +
                            "\t\t\t\t100% CT-geno");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                }
                else if (spadem.isChecked()&&deltaf.isChecked()){
                    textView2.setText("DELTATAIL, DOMINANT – DeTDeT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("DeT x st\n" +
                            "\t\t\t\t100% Deltatail-heterozygous");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (spadem.isChecked()&&doublef.isChecked()){
                    textView2.setText("DOUBLETAIL, RECESSIVE – dtdt\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("dt x st\n" +
                            "\t\t\t\t100% Doubletail-heterozygous");
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                }
                else if (spadem.isChecked()&&halfmoonf.isChecked()){
                    textView2.setText("HALFMOON, DOMINANT– HMHM\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("HM x st\n" +
                            "\t\t\t\t60% Halfmoon\n" +
                            "\t\t\t\t40% Deltatail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                }
                else if (spadem.isChecked()&&plakatf.isChecked()){
                    textView2.setText("PLAKAT, DOMINANT – PK\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("PK x st\n" +
                            "\t\t\t\t50% Halfmoonplakat\n" +
                            "\t\t\t\t30% Plakat\n" +
                            "\t\t\t\t20% Spadetail");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.spadetailremove));
                }
                else if (spadem.isChecked()&&halfsunf.isChecked()){
                    textView2.setText("SPADETAIL, RECESSIVE – stst\n" +
                            "HALFSUN, DOMINANT – HSHS");
                    textView4.setText("HS x st\n" +
                            "\t\t\t\t50% Veiltail\n" +
                            "\t\t\t\t30% Crowntail\n" +
                            "\t\t\t\t20% Halfsun");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                }
                else if (spadem.isChecked()&&rosef.isChecked()){
                    textView2.setText("ROSETAIL, DOMINANT – RTRT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("VT x rt\n" +
                            "\t\t\t\t10% Rosetail\n" +
                            "\t\t\t\t60% Veiltail\n" +
                            "\t\t\t\t30% Halfmoon\n" +
                            "VT, VT with wider caudal, RT carrier, DeT, SdeT/HM\n" +
                            "It is best to wait until F1 is 6 months before continuing your line.");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                else if (spadem.isChecked()&&veilf.isChecked()){
                    textView2.setText("VEILTAIL, DOMINANT – VTVT\n" +
                            "SPADETAIL, RECESSIVE – stst");
                    textView4.setText("VT x st\n" +
                            "\t\t\t\t70% Veiltail\n" +
                            "\t\t\t\t30% Halfmoon");
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                }
                RadioButton myRadioButton = (RadioButton) findViewById(R.id.crowntailm);
                myRadioButton.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton1 = (RadioButton) findViewById(R.id.crowntailf);
                myRadioButton1.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton2 = (RadioButton) findViewById(R.id.halfmoonm);
                myRadioButton2.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton3 = (RadioButton) findViewById(R.id.halfmoonf);
                myRadioButton3.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton4 = (RadioButton) findViewById(R.id.plakatm);
                myRadioButton4.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton5 = (RadioButton) findViewById(R.id.plakatf);
                myRadioButton5.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton6 = (RadioButton) findViewById(R.id.deltam);
                myRadioButton6.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton7 = (RadioButton) findViewById(R.id.deltaf);
                myRadioButton7.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton8 = (RadioButton) findViewById(R.id.doublem);
                myRadioButton8.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton9 = (RadioButton) findViewById(R.id.doublef);
                myRadioButton9.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton00 = (RadioButton) findViewById(R.id.halfsunm);
                myRadioButton00.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton11 = (RadioButton) findViewById(R.id.halfsunf);
                myRadioButton11.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton22 = (RadioButton) findViewById(R.id.spadem);
                myRadioButton22.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton33 = (RadioButton) findViewById(R.id.spadef);
                myRadioButton33.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton44 = (RadioButton) findViewById(R.id.veilm);
                myRadioButton44.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton55 = (RadioButton) findViewById(R.id.veilf);
                myRadioButton55.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton66 = (RadioButton) findViewById(R.id.rosem);
                myRadioButton66.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton77 = (RadioButton) findViewById(R.id.rosef);
                myRadioButton77.setVisibility(View.INVISIBLE);
                imageView2.setImageBitmap(null);
                imageView3.setImageBitmap(null);
                textView5.setText("");
                textView6.setText("");
                btnclear.setVisibility(View.VISIBLE);
                btnclear.setText("CLEAR");
                button.setVisibility(View.GONE);
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageBitmap(null);
                imageView4.setImageBitmap(null);
                imageView5.setImageBitmap(null);
                textView2.setText("");
                textView4.setText("");
                textView1.setText("");
                textView3.setText("");
                textView5.setText("CHOOSE THE MALE BETTA");
                textView6.setText("CHOOSE THE FEMALE BETTA");
                btnclear.setVisibility(View.GONE);
                button.setVisibility(View.VISIBLE);

                RadioButton myRadioButton = (RadioButton) findViewById(R.id.crowntailm);
                myRadioButton.setVisibility(View.VISIBLE);
                RadioButton myRadioButton1 = (RadioButton) findViewById(R.id.crowntailf);
                myRadioButton1.setVisibility(View.VISIBLE);
                RadioButton myRadioButton2 = (RadioButton) findViewById(R.id.halfmoonm);
                myRadioButton2.setVisibility(View.VISIBLE);
                RadioButton myRadioButton3 = (RadioButton) findViewById(R.id.halfmoonf);
                myRadioButton3.setVisibility(View.VISIBLE);
                RadioButton myRadioButton4 = (RadioButton) findViewById(R.id.plakatm);
                myRadioButton4.setVisibility(View.VISIBLE);
                RadioButton myRadioButton5 = (RadioButton) findViewById(R.id.plakatf);
                myRadioButton5.setVisibility(View.VISIBLE);
                RadioButton myRadioButton6 = (RadioButton) findViewById(R.id.deltam);
                myRadioButton6.setVisibility(View.VISIBLE);
                RadioButton myRadioButton7 = (RadioButton) findViewById(R.id.deltaf);
                myRadioButton7.setVisibility(View.VISIBLE);
                RadioButton myRadioButton8 = (RadioButton) findViewById(R.id.doublem);
                myRadioButton8.setVisibility(View.VISIBLE);
                RadioButton myRadioButton9 = (RadioButton) findViewById(R.id.doublef);
                myRadioButton9.setVisibility(View.VISIBLE);
                RadioButton myRadioButton00 = (RadioButton) findViewById(R.id.halfsunm);
                myRadioButton00.setVisibility(View.VISIBLE);
                RadioButton myRadioButton11 = (RadioButton) findViewById(R.id.halfsunf);
                myRadioButton11.setVisibility(View.VISIBLE);
                RadioButton myRadioButton22 = (RadioButton) findViewById(R.id.spadem);
                myRadioButton22.setVisibility(View.VISIBLE);
                RadioButton myRadioButton33 = (RadioButton) findViewById(R.id.spadef);
                myRadioButton33.setVisibility(View.VISIBLE);
                RadioButton myRadioButton44 = (RadioButton) findViewById(R.id.veilm);
                myRadioButton44.setVisibility(View.VISIBLE);
                RadioButton myRadioButton55 = (RadioButton) findViewById(R.id.veilf);
                myRadioButton55.setVisibility(View.VISIBLE);
                RadioButton myRadioButton66 = (RadioButton) findViewById(R.id.rosem);
                myRadioButton66.setVisibility(View.VISIBLE);
                RadioButton myRadioButton77 = (RadioButton) findViewById(R.id.rosef);
                myRadioButton77.setVisibility(View.VISIBLE);
            }
        });

        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged (RadioGroup group,int checkedId){
                switch (checkedId){
                    case R.id.crowntailm:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                        break;
                    case R.id.halfmoonm:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                        break;
                    case R.id.deltam:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                        break;
                    case R.id.doublem:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                        break;
                    case R.id.plakatm:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                        break;
                    case R.id.halfsunm:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                        break;
                    case R.id.rosem:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                        break;
                    case R.id.veilm:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                        break;
                    case R.id.spadem:
                        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.spadetailremove));
                        break;
                }
            }
        });

        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged (RadioGroup group,int checkedId){
                switch (checkedId){
                    case R.id.crowntailf:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.ctthreeremove));
                        break;
                    case R.id.halfmoonf:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.halfmoonremove));
                        break;
                    case R.id.deltaf:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.deltalang2));
                        break;
                    case R.id.doublef:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.doubletail));
                        break;
                    case R.id.plakatf:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.plakatt));
                        break;
                    case R.id.halfsunf:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.halfsun1234));
                        break;
                    case R.id.rosef:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.rosetaillremove));
                        break;
                    case R.id.veilf:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.veiltailremove));
                        break;
                    case R.id.spadef:
                        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.spadetailremove));
                        break;
                }
            }
        });
    }
}