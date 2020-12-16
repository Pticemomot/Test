package com.example.testitsamsung;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Question extends AppCompatActivity {

    private TextView QuestionText1;
    private RadioButton secondAnsw;
    private RadioButton thirdAnsw;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("TestITSamsung");

        QuestionText1 = findViewById(R.id.text2);
        secondAnsw = findViewById(R.id.radioButton3);
        thirdAnsw = findViewById(R.id.radioButton4);
        score = getIntent().getIntExtra("score", 0);
    }
    public void ButtonStart(View view)
    {
        if (secondAnsw.isChecked()) {
            QuestionText1.setTextColor(Color.RED);
        }
        if (thirdAnsw.isChecked()) {
            QuestionText1.setTextColor(Color.GREEN);
            score += 1;
        }
        Intent intent = new Intent(Question.this, FinalActivity.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }
}