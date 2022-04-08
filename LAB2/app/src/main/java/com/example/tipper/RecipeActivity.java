package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RecipeActivity extends AppCompatActivity {
    Button btnBack;
    ImageButton firstRecipe, secondRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecipeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        firstRecipe = (ImageButton) findViewById(R.id.firstRecipe);
        firstRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecipeActivity.this, FirstRecipeActivity.class);
                startActivity(intent);
            }
        });

        secondRecipe = (ImageButton) findViewById(R.id.secondRecipe);
        secondRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecipeActivity.this, SecondRecipeActivity.class);
                startActivity(intent);
            }
        });
    }


}