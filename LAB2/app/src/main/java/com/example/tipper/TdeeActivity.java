package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TdeeActivity extends AppCompatActivity {
    EditText height, weight, age;
    RadioButton sex_female, sex_male;
    TextView result;
    Button calculate, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdee);

        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        age = (EditText) findViewById(R.id.age);
        sex_female = (RadioButton) findViewById(R.id.sex_female);
        sex_male = (RadioButton) findViewById(R.id.sex_male);
        result = (TextView) findViewById(R.id.result);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateTdee();
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TdeeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calculateTdee() {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        String ageStr = age.getText().toString();

        if (heightStr != null && !"".equals(heightStr) && weightStr != null && !"".equals(weightStr)) {
            if(sex_female.isChecked()) {
                float heightValue = Float.parseFloat(heightStr) / 100;
                float weightValue = Float.parseFloat(weightStr);
                float ageValue = Float.parseFloat(ageStr);

                float tdee = (float) (66.7 + 13.7*weightValue + 5.0*heightValue - 6.76*ageValue);

                displayTdeeFemale(tdee);
            }
            else if(sex_male.isChecked()) {
                float heightValue = Float.parseFloat(heightStr) / 100;
                float weightValue = Float.parseFloat(weightStr);
                float ageValue = Float.parseFloat(ageStr);

                float tdee = (float) (65.51 + (9.567*weightValue) + (1.85*heightValue) - (4.68*ageValue));

                displayTdeeMale(tdee);
            }
        }
    }

    private void displayTdeeFemale(float bmi) {

        String bmiLabel = "";

        if(Float.compare(bmi, 1f) <= 0) {
            bmiLabel = "wygłodzenie";
        } else {
            bmiLabel = "otyłość III stopnia";
        }

        bmiLabel = bmi + "\n" + bmiLabel;
        result.setText(bmiLabel);
    }

    private void displayTdeeMale(float bmi) {

        String bmiLabel = "";

        if(Float.compare(bmi, 1f) <= 0) {
            bmiLabel = "wygłodzenie";
        } else {
            bmiLabel = "otyłość III stopnia";
        }

        bmiLabel = bmi + "\n" + bmiLabel;
        result.setText(bmiLabel);
    }

}