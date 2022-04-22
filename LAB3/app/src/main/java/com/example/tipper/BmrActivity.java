package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class BmrActivity extends AppCompatActivity {
    EditText height, weight, age;
    RadioButton sex_female, sex_male;
    TextView result;
    Button calculate, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);

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
                calculateBmr();
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmrActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calculateBmr() {

        double heightValue = Double.parseDouble(height.getText().toString());
        double weightValue = Double.parseDouble(weight.getText().toString());
        double ageValue = Double.parseDouble(age.getText().toString());
        String text = " Calories/day";
        if(sex_female.isChecked()) {

            double bmr = 447.593 + (9.247*weightValue) + (3.098*heightValue) - (4.330*ageValue);

            result.setText(bmr + text);
        }
        else if(sex_male.isChecked()) {

            double bmr = 88.362 + (13.397*weightValue) + (4.799*heightValue) - (5.677*ageValue);

            result.setText(bmr + text);
        }

    }


}