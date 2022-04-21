package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private Button optionBtn1, optionBtn2, optionBtn3, optionBtn4;
    private TextView questionAttempt, question;
    private ArrayList<ModelQuiz> modelQuiz;
    Random random;
    int score = 0, attempted = 1, pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question = findViewById(R.id.question);
        questionAttempt = findViewById(R.id.questionAttempt);
        optionBtn1 = findViewById(R.id.optionBtn1);
        optionBtn2 = findViewById(R.id.optionBtn2);
        optionBtn3 = findViewById(R.id.optionBtn3);
        optionBtn4 = findViewById(R.id.optionBtn4);

        modelQuiz = new ArrayList<>();
        random = new Random();


        getQuestions(modelQuiz);
        pos = random.nextInt(modelQuiz.size());
        setDataView(pos);

        optionBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(modelQuiz.get(pos).getAnswer().trim().toLowerCase().equals(optionBtn1.getText().toString().trim().toLowerCase())) {
                    score ++;
                }
                attempted++;
                pos = random.nextInt(modelQuiz.size());
                setDataView(pos);
            }
        });

        optionBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(modelQuiz.get(pos).getAnswer().trim().toLowerCase().equals(optionBtn2.getText().toString().trim().toLowerCase())) {
                    score ++;
                }
                attempted++;
                pos = random.nextInt(modelQuiz.size());
                setDataView(pos);
            }
        });

        optionBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(modelQuiz.get(pos).getAnswer().trim().toLowerCase().equals(optionBtn3.getText().toString().trim().toLowerCase())) {
                    score ++;
                }
                attempted++;
                pos = random.nextInt(modelQuiz.size());
                setDataView(pos);
            }
        });

        optionBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(modelQuiz.get(pos).getAnswer().trim().toLowerCase().equals(optionBtn4.getText().toString().trim().toLowerCase())) {
                    score ++;
                }
                attempted++;
                pos = random.nextInt(modelQuiz.size());
                setDataView(pos);
            }
        });

    }

    private void getQuestions(ArrayList<ModelQuiz> modelQuiz) {
        modelQuiz.add(new ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"));
        modelQuiz.add(new ModelQuiz("Które z płatków śniadaniowych są najbardziej kaloryczne?", "1 kubek płatków kukurydzianych","1 kubek płatków kukurydzianych z miodem","1 kubek muesli tropikalnego","1 kubek granoli orzechowej","1 kubek granoli orzechowej"));
        modelQuiz.add(new ModelQuiz("Które mięso zawiera najmniej tłuszczu?", "Chuda mielona wołowina","Mielone mięso indycze","Kurze udka bez skóry","Mielone mięso wieprzowe","Chuda mielona wołowina"));
        modelQuiz.add(new ModelQuiz("Co ma najwięcej witaminy A?", "Ziemniak","Marchew","Szpinak","Jarmuż","Marchew"));
        modelQuiz.add(new ModelQuiz("Ile razy dziennie powinno się jeść produkty mleczne?", "2 porcje dziennie, najlepiej rano na śniadanie","2-3 razy dziennie, w ciągu całego dnia","Ludzie aktywni potrzebują od 3 do 4 porcji dziennie","Przynajmniej raz dziennie jedną porcje","2-3 razy dziennie, w ciągu całego dnia"));
        modelQuiz.add(new ModelQuiz("Jaką ilość płynów powinien wypijać codziennie aktywny człowiek?", "Mężczyźni potrzebują 330 ml (puszka), a kobiety 250 ml (szklanka) płynów","Osiem szklanek dziennie","Tyle, ile trzeba, żeby zaspokoić pragnienie","Sześć-osiem szklanek, wyłączając kawę i inne napoje moczopędne","Sześć-osiem szklanek, wyłączając kawę i inne napoje moczopędne"));
    }

    private void setDataView(int pos) {
        questionAttempt.setText("Question: " + attempted + "/6");

        if ( attempted == 6) {
            showScore();
        } else {
            question.setText(modelQuiz.get(pos).getQuestion());
            optionBtn1.setText(modelQuiz.get(pos).getOption1());
            optionBtn2.setText(modelQuiz.get(pos).getOption2());
            optionBtn3.setText(modelQuiz.get(pos).getOption3());
            optionBtn4.setText(modelQuiz.get(pos).getOption4());
        }
    }

    private void showScore() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(QuizActivity.this);
        View bottomScoreView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_score,(LinearLayout) findViewById(R.id.scoreView));
        TextView scor = bottomScoreView.findViewById(R.id.scores);
        Button restarts = bottomScoreView.findViewById(R.id.restart);

        scor.setText("Score: " + score + "/6");
        restarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos = random.nextInt(modelQuiz.size());
                setDataView(pos);
                attempted = 1;
                score = 0;
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomScoreView);
        bottomSheetDialog.show();
    }
}