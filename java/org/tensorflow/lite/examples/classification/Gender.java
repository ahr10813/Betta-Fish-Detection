package org.tensorflow.lite.examples.classification;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Gender extends AppCompatActivity {

    private ImageView Male1, Male2, Male3, Male4, Male5, Male6, Female1, Female2, Female3;
    TextView tvv1, tvv2, tvv3, tvv4, tvv5, tvv6, tvm1, tvm2, tvm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender);

        Male1 = findViewById(R.id.Male1);
        Male2 = findViewById(R.id.Male2);
        Male3 = findViewById(R.id.Male3);
        Male4 = findViewById(R.id.Male4);
        Male5 = findViewById(R.id.Male5);
        Male6 = findViewById(R.id.Male6);
        Female1 = findViewById(R.id.Female1);
        Female2 = findViewById(R.id.Female2);
        Female3 = findViewById(R.id.Female3);


        tvv1 = findViewById(R.id.tvv1);
        tvv2 = findViewById(R.id.tvv2);
        tvv3 = findViewById(R.id.tvv3);
        tvv4 = findViewById(R.id.tvv4);
        tvv5 = findViewById(R.id.tvv5);
        tvv6 = findViewById(R.id.tvv6);
        tvm1 = findViewById(R.id.tvm1);
        tvm2 = findViewById(R.id.tvm2);
        tvm3 = findViewById(R.id.tvm3);

            Male1.setImageDrawable(getResources().getDrawable(R.drawable.a1));
            Male2.setImageDrawable(getResources().getDrawable(R.drawable.a2));
            Male3.setImageDrawable(getResources().getDrawable(R.drawable.a3));
            Male4.setImageDrawable(getResources().getDrawable(R.drawable.a4));
            Male5.setImageDrawable(getResources().getDrawable(R.drawable.a5));
            Male6.setImageDrawable(getResources().getDrawable(R.drawable.a6));
            Female1.setImageDrawable(getResources().getDrawable(R.drawable.b1));
            Female2.setImageDrawable(getResources().getDrawable(R.drawable.b2));
            Female3.setImageDrawable(getResources().getDrawable(R.drawable.b3));


            tvv1.setText("Wait until characteristics begin to develop with age. " +
                    "Male and female Betta fish will look very similar when young. " +
                    "This is because their body has not yet developed to the point where sexual characteristics are manifested. " +
                    "Before sexing your betta, either wait until you can see obvious male characteristics or wait about two months.");
            tvv2.setText("Observe the size and shape of their fins." +
                    "Male Betta fish will generally have long dorsal (top), ventral (bottom), and caudal (tail) fins. " +
                    "Often 2-3+ times their body height. " +
                    "The dorsal and caudal fins will often droop due to their length. " +
                    "Female Betta fish will typically have shorter fins about as long as the Betta is tall or shorter. " +
                    "However, Plakat Betta Fish have short fins, so do not immediately assume that your betta is a female just because of shorter fins." +
                    "Female Betta's ventral fin may often resemble a hair comb. There are long-finned female Betta Fish that are sold by breeders.\n" +
                    "Short fins may indicate female sex, but this characteristic should be combined with other evidence before sexing is conclusive.");
            tvv3.setText("\n" +
                    "Note his or her colors." +
                    " Males typically have bright colors. " +
                    "Females usually do not. Females from the pet store tend to have subdued or dull colors, especially in the body. " +
                    "However, you can find colorful female betta fish from breeders. Female betta fish aren’t always dull. " +
                    "Bright, bold coloration in the body and fins is a good indication of a male Betta.\n" +
                    "Colors can change depending on the stress level of the fish. " +
                    "Female Bettas will be more colorful when stressed than non-stressed females.");
            tvv4.setText("\n" +
                    "Look for the egg spot." +
                    " Female Bettas will have a small white spot (the ovipositor tube) on their underside. " +
                    "This spot will resemble a grain of salt. " +
                    "It is located between the near the edge of the ventral fin near the head of the Betta. " +
                    "Male bettas can develop a false egg spot, so using an egg spot to confirm sex is not the most accurate way.\n" +
                    "Finding this spot may be difficult with younger females whose sexual organs have not fully developed. " +
                    "As the fish ages and becomes larger, the ovipositor tube will become larger and easier to see.\n" +
                    "If you are having trouble viewing the location of the spot, consider feeding or preparing to feed your fish. " +
                    "He or she will likely move to the top and angle himself or herself so you can more easily view the location.");
            tvv5.setText("\n" +
                    "Compare their body shapes. Male and female Betta fish have subtle differences in body shape. " +
                    "Males tend to be long and thin. Females tend to be shorter and thicker. This is a subtle difference. " +
                    "You will probably want to familiarize yourself with obviously male Betta fish to use this method to sex Bettas. " +
                    "Female Bettas almost look like stubby males when comparing body shape.");
            tvv6.setText("Put a mirror beside or in the tank. Bettas will flare at other males. " +
                    "Both male and female Betta fish have aggressive tendencies. However, male are typically more likely to engage in aggressive behavior. When you place a mirror beside or in your Betta's tank, your Betta will see another Betta. Males will likely stretch or flare their gills to show dominance. They may even try to attack the mirror.\n" +
                    "Female Bettas will sometimes flare to show dominance too. However, they do so with less determination. " +
                    "Males tend to become obsessed with the fact that another male is near them.\n" +
                    "Do not leave the mirror in the tank for extended periods of time. " +
                    "While seeing your male Betta's aggressive display is fun, this can stress your Betta to the point it affects his or her health. " +
                    "Male Betta's fins, particularly, may start to shorten simply due to experiencing long periods of high stress.");
            tvm1.setText("Consider the method of purchase. " +
                    "How you purchased your Betta can tell you a little about his or her sex. " +
                    "Male bettas are typically sold exclusively in the typical \"pet store\" because of their bright colors and large fins. " +
                    "These are typically male traits, and, consequently, most pet stores sell and stock only male Bettas. " +
                    "Female Bettas are typically sold by aquarium enthusiasts or higher-end aquarium stores.\n" +
                    "Many pet store staffers are more knowledgeable about pets than you. " +
                    "However, their expert knowledge may be limited by their own pet interests. " +
                    "When consulting a pet store staff worker about the sex of a Betta, consider asking if they have ever personally bred Bettas, or if they have to look at the label before telling you if a Betta is male or female. When in doubt, assume the fish is male.");
            tvm2.setText("Look for bubble nests. When males are ready to mate, they typically create bubbles on the surface of the water. " +
                    "They create hundreds or thousands of little tiny bubbles that group together. " +
                    "This is in preparation for tending to fertilized eggs. " +
                    "Male Bettas typically tend to be the primary caregivers for their offspring. " +
                    "Note, Female bettas have been known to build bubble nests as well.");
            tvm3.setText("Check your Betta's gills for a beard. " +
                    "Both male and female Betta fish have a membrane under their gills that is a different color than their body. " +
                    "Usually, the beard is brown or black in coloration. " +
                    "Males tend to have larger beards than females. " +
                    "You may only be able to see the female's beard with when her gills are closed if you look hard enough. " +
                    "Males tend to be more obvious even when the gills are open.");
    }
}