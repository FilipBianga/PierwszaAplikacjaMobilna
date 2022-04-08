package com.example.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button bmi, bmr, recipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmi = (Button) findViewById(R.id.bmi);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBmiCalculate();
            }
        });

        bmr = (Button) findViewById(R.id.bmr);
        bmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTdeeCalculate();
            }
        });

        recipe = (Button) findViewById(R.id.recipe);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayRecipe();
            }
        });

    }

    private void displayRecipe() {
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

    private void openTdeeCalculate() {
        Intent intent = new Intent(this, TdeeActivity.class);
        startActivity(intent);
    }

    public void openBmiCalculate() {
        Intent intent = new Intent(this, BmiActivity.class);
        startActivity(intent);
    }
}



