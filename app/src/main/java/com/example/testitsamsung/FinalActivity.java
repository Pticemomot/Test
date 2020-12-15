package com.example.testitsamsung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        setTitle("ПОЗДРАВЛЯЕМ");

        TextView text = findViewById(R.id.textView);

        Bundle arguments = getIntent().getExtras();
        int scoreI = arguments.getInt("score");
        String score = arguments.get("score").toString();
        text.setText("Ваши Очки " + score + "\n это " + scoreI / 2 * 100 + "%");
    }
}