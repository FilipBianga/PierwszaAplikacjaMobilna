package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondRecipeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_recipe);

        TextView textView = (TextView) findViewById(R.id.gradients);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Składniki:\n" +
                "300 g mięsa mielonego\n" +
                "1 cebula\n" +
                "2 ząbki czosnku\n" +
                "1 marchewka\n" +
                "2 łyżki oleju\n" +
                "1 puszka krojonych pomidorów bez skórki lub pulpy pomidorowej (puszka 400g)\n" +
                "3 łyżki przecieru pomidorowego\n" +
                "100 ml bulionu mięsnego lub warzywnego\n" +
                "2 łyżeczki suszonego oregano\n" +
                "sól, pieprz\n" +
                "300 g makaronu Spaghetti\n" +
                "świeżo starty parmezan do posypania\n\n"+
                "Przygotowanie:\n" +
                "Cebulę i czosnek obrać i poszatkować.\n" +
                "Marchewkę umyć, obrać i pokroić w drobną kostkę.\n" +
                "Cebulę i czosnek chwilkę podsmażyć na oleju. Dodać mięso mielone i marchewkę. Wszystko razem chwilę podsmażyć, aż mięso straci kolor różowy. Dodać pomidory z puszki (razem z sosem z puszki), przecier pomidorowy i bulion. Całość dusić pod przykryciem na niskiej mocy palnika ok. 20 minut. Przyprawić solą, pieprzem i oregano.\n" +
                "Spaghetti ugotować w osolonej wodzie według przepisu na opakowaniu. Odcedzić na durszlaku. (Nie przelewać zimną wodą).\n" +
                "Spaghetti rozłożyć na talerzach. Polać sosem z mięsem i posypać parmezanem.\n\n\n\n\n");
    }

}