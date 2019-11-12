package com.example.englishlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LearnFreeEnglishActivity extends AppCompatActivity {

    Button btnEngGrammar,btnEngTenses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_english);
        btnEngGrammar=(Button)findViewById(R.id.btnEngGrammar);
        btnEngTenses=(Button)findViewById(R.id.btnEngTenses);


        btnEngGrammar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnFreeEnglishActivity.this,EnglishGrammarActivity.class);
                startActivity(intent);


            }
        });

        btnEngTenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnFreeEnglishActivity.this,EnglishTensesActivity.class);
                startActivity(intent);


            }
        });


    }
}