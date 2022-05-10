package com.example.myapplicationpamo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val firstRecipe = findViewById<ImageButton>(R.id.firstRecipe)
        firstRecipe.setOnClickListener { displayFirstrecipe() }

        val secondRecipe = findViewById<ImageButton>(R.id.secondRecipe)
        secondRecipe.setOnClickListener { displaySecondRecipe() }
    }

    private fun displayFirstrecipe() {
        val intent = Intent(this, FirstRecipeActivity::class.java)
        startActivity(intent)
    }
    private fun displaySecondRecipe() {
        val intent = Intent(this, SecondRecipeActivity::class.java)
        startActivity(intent)
    }
}