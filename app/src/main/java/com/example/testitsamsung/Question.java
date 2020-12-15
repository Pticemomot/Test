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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("TestITSamsung");

        QuestionText1 = findViewById(R.id.text2);
        secondAnsw = findViewById(R.id.radioButton3);
        thirdAnsw = findViewById(R.id.radioButton4);
    }
    public void onMyButtonClick(View view)
    {
        if (secondAnsw.isChecked()) {
            QuestionText1.setTextColor(Color.RED);
        }
        if (thirdAnsw.isChecked()) {
            QuestionText1.setTextColor(Color.GREEN);
        }
        Intent intent = new Intent(Question.this, FinalActivity.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }
}