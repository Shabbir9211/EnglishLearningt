package com.example.englishlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLearnEng,btnFreeLearnEngGrammer,btnDictionary,btnTodayWord,btnTodayQustion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLearnEng=(Button)findViewById(R.id.btnLearnEng);
        btnFreeLearnEngGrammer=(Button)findViewById(R.id.btnFreeLearnEngGrammer);
        btnDictionary=(Button)findViewById(R.id.btnDictionary);
        btnTodayWord=(Button)findViewById(R.id.btnTodayWord);
        btnTodayQustion=(Button)findViewById(R.id.btnTodayQustion);


        btnFreeLearnEngGrammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this,LearnFreeEnglishActivity.class);
                startActivity(intent);


            }
        });

        btnLearnEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this,LearnEnglishActivity.class);
                startActivity(intent);


            }
        });

        btnDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this,DictionaryActivity.class);
                startActivity(intent);


            }
        });


        btnTodayQustion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this,TodayQustionActivity.class);
                startActivity(intent);


            }
        });


        btnTodayWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this,TodayWordActivity.class);
                startActivity(intent);


            }
        });






    }
}
