package com.example.testitsamsung;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView QuestionText1;
    private RadioButton secondAnsw;
    private RadioButton thirdAnsw;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("TestITSamsung");

        QuestionText1 = findViewById(R.id.text1);
        secondAnsw = findViewById(R.id.radioButton1);
        thirdAnsw = findViewById(R.id.radioButton2);
        Button stopButton = findViewById(R.id.button);

        stopButton.setOnClickListener(v -> {
            if (secondAnsw.isChecked()) {
                QuestionText1.setTextColor(Color.RED);
            }
            if (thirdAnsw.isChecked()) {
                QuestionText1.setTextColor(Color.GREEN);
                score += 1;
            }
            Intent intent = new Intent(this, Question.class);
            intent.putExtra("score", score);
            startActivity(intent);
        });
    }
}