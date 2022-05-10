package com.example.myapplicationpamo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class BmrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmr)

        val calculate = findViewById<Button>(R.id.calculate);
        val weight = findViewById<EditText>(R.id.weight);
        val height = findViewById<EditText>(R.id.height);
        val age = findViewById<EditText>(R.id.age);
        val sex_female = findViewById<RadioButton>(R.id.sex_female)
        val sex_male = findViewById<RadioButton>(R.id.sex_male)
        val result = findViewById<TextView>(R.id.result);

        calculate.setOnClickListener() {
            val input_height: String = height.text.toString()
            val value1: Double = input_height.toDouble()

            val input_weight: String = weight.text.toString()
            val value2: Double = input_weight.toDouble()

            val input_age: String = age.text.toString()
            val value3: Double = input_age.toDouble()

            if (sex_female.isChecked) {
                val bmrresult = femaleBmrCalculate(value1, value2, value3)
                result.text = "Calories/day " + "%.2f".format(bmrresult)
            } else if (sex_male.isChecked) {
                val bmrresult = maleBmrCalculate(value1, value2, value3)
                result.text = "Calories/day " + "%.2f".format(bmrresult)
            }

        }
    }

    private fun femaleBmrCalculate(v1: Double, v2: Double, v3: Double): Double {
        val bmrresult: Double = 447.593 + (9.247*v2) + (3.098*v1) - (4.330*v3)
        return bmrresult
    }

    private fun maleBmrCalculate(v1: Double, v2: Double, v3: Double): Double {
        val bmrresult: Double = 88.362 + (13.397*v2) + (4.799*v1) - (5.677*v3)
        return bmrresult
    }
}