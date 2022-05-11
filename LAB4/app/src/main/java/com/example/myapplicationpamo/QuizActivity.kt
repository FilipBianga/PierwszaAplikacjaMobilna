package com.example.myapplicationpamo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_quiz.*
import kotlin.random.Random

class QuizActivity : AppCompatActivity() {

    private lateinit var modelQuiz: ArrayList<ModelQuiz>
    lateinit var random: Random
    var score: Int = 0
    var attempted: Int = 1
    var pos: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val question = findViewById<TextView>(R.id.question)
        val questionAttempt = findViewById<TextView>(R.id.questionAttempt)
        val optionBtn1 = findViewById<Button>(R.id.optionBtn1)
        val optionBtn2 = findViewById<Button>(R.id.optionBtn2)
        val optionBtn3 = findViewById<Button>(R.id.optionBtn3)
        val optionBtn4 = findViewById<Button>(R.id.optionBtn4)

        modelQuiz = ArrayList()
        random = Random

        getQuestions(modelQuiz)
        pos = random.nextInt(modelQuiz.size)

        optionBtn1.setOnClickListener {
            if(modelQuiz[pos].answer.trim().equals(optionBtn1.text.toString().trim(), ignoreCase = true)) {
                score++
            }
            attempted++
            pos = random.nextInt(modelQuiz.size)

        }

        optionBtn2.setOnClickListener {
            if(modelQuiz[pos].answer.trim().equals(optionBtn2.text.toString().trim(), ignoreCase = true)) {
                score++
            }
            attempted++
            pos = random.nextInt(modelQuiz.size)

        }

        optionBtn3.setOnClickListener {
            if(modelQuiz[pos].answer.trim().equals(optionBtn3.text.toString().trim(), ignoreCase = true)) {
                score++
            }
            attempted++
            pos = random.nextInt(modelQuiz.size)

        }

        optionBtn4.setOnClickListener {
            if(modelQuiz[pos].answer.trim().equals(optionBtn4.text.toString().trim(), ignoreCase = true)) {
                score++
            }
            attempted++
            pos = random.nextInt(modelQuiz.size)

        }
    }

    private fun getQuestions(modelQuiz: ArrayList<ModelQuiz>) {
        modelQuiz.add(ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"))
        modelQuiz.add(ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"))
        modelQuiz.add(ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"))
        modelQuiz.add(ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"))
        modelQuiz.add(ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"))
        modelQuiz.add(ModelQuiz("Ile porcji zawiera szklanka makaronu?", "Pół porcji","Jedną porcję","Dwie porcję","Trzy porcję","Dwie porcję"))
    }

    private fun setDataView(pos: Int) {
        "Question: $attempted/6".also { questionAttempt.text = it }
        if (attempted == 6) {
            showScore()
        } else {
            question.text = modelQuiz[pos].question
            optionBtn1.text = modelQuiz[pos].option1
            optionBtn2.text = modelQuiz[pos].option2
            optionBtn3.text = modelQuiz[pos].option3
            optionBtn4.text = modelQuiz[pos].option4
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showScore() {
        val bottomSheetDialog = BottomSheetDialog(this@QuizActivity)
        val bottomScoreView: View = LayoutInflater.from(getApplicationContext())
            .inflate(R.layout.activity_score, findViewById(R.id.scores))
        val scor: TextView = bottomScoreView.findViewById(R.id.scores)
        val restarts: Button = bottomScoreView.findViewById(R.id.restart)
        scor.text = "Score: $score/6"
        restarts.setOnClickListener {
            pos = random.nextInt(modelQuiz.size)
            setDataView(pos)
            attempted = 1
            score = 0
            bottomSheetDialog.dismiss()
        }
        bottomSheetDialog.setCancelable(false)
        bottomSheetDialog.setContentView(bottomScoreView)
        bottomSheetDialog.show()
    }
}