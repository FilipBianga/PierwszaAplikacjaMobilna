package com.example.myapplicationpamo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class BmiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val calculate = findViewById<Button>(R.id.calculate);
        val weight = findViewById<EditText>(R.id.weight);
        val height = findViewById<EditText>(R.id.height);
        val result = findViewById<TextView>(R.id.result);



        calculate.setOnClickListener() {
            val input_weight: String = weight.text.toString()
            val value: Double = input_weight.toDouble()


            val input_height: String = height.text.toString()
            val value1: Double = input_height.toDouble() / 100

            val bmiresult = calculateBMI(value,value1)



            if (bmiresult < 18.5) {
                result.text =
                    "%.2f".format(bmiresult) + " wygłodzenie"
            } else if (bmiresult <= 24.9) {
                result.text =
                    "%.2f".format(bmiresult) + " pożądana masa ciała"
            } else {
                result.text =
                    "%.2f".format(bmiresult) + " nadwaga"
            }
        }




    }
    private fun calculateBMI(v1: Double, v2: Double): Double {
        val bmiresult: Double = v1 / (v2 * v2)
        return bmiresult

    }
}