package com.example.myapplicationpamo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bmi = findViewById<Button>(R.id.bmi)
        bmi.setOnClickListener { displayBmiCalculate() }

        val bmr = findViewById<Button>(R.id.bmr)
        bmr.setOnClickListener { displayBmrCalculate() }

        val recipe = findViewById<Button>(R.id.recipe)
        recipe.setOnClickListener { displayRecipe() }

        val barChart = findViewById<Button>(R.id.barChart)
        barChart.setOnClickListener { displayChart() }
    }

    private fun displayBmiCalculate() {
        val intent = Intent(this, BmiActivity::class.java)
        startActivity(intent)
    }

    private fun displayBmrCalculate() {
        val intent = Intent(this, BmrActivity::class.java)
        startActivity(intent)
    }

    private fun displayRecipe() {
        val intent = Intent(this, RecipeActivity::class.java)
        startActivity(intent)
    }

    private fun displayChart() {
        val intent = Intent(this, ChartActivity::class.java)
        startActivity(intent)
    }
}