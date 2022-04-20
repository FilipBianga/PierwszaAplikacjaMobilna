package com.example.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button bmi, bmr, recipe, quiz;


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
                openBmrCalculate();
            }
        });

        recipe = (Button) findViewById(R.id.recipe);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayRecipe();
            }
        });

        quiz = (Button) findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayQuiz();
            }
        });

    }

    private void displayQuiz() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    private void displayRecipe() {
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

    private void openBmrCalculate() {
        Intent intent = new Intent(this, BmrActivity.class);
        startActivity(intent);
    }

    public void openBmiCalculate() {
        Intent intent = new Intent(this, BmiActivity.class);
        startActivity(intent);
    }
}



