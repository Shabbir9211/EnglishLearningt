package com.example.englishlearning;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TodayWordActivity extends AppCompatActivity {
    TextView TvEnglish,TvEngWords,TvUrdu,TvUrduword;
    String[] EngWords={"Advisement" , "Audi" , "Archipelago" , "Anconal" , "Asses" , "Badar" , "Beaverboard" , "Bootees" , "Bittern" , "Chime" , "Erring" , "Embassy" , "Essentialnesses" , "Exocarp" , "Excommunication" , "Epidemiologies" ,
            "Eel" , "Flirting" , "Foregoer" , "Fury" , "Fertilizer" , "Fangs" , "Gallopades" , "Glassworks" , "Give Introduction" , "Guying" , "Gromwell" , "Ideality" , "Incorruptness" , "Indurative"};
    String[] UrduWords={"نِگرانی" , "قابل سماعت" , "سمندر میں جزیروں کا سلسلہ" , "کہنی سے متعلق" , "اندازہ کرنا" , "بدر" , "ریشوں سے بنا ، لیفی تختہ" , "جسے فائدہ پہنچے" , "بگلا" , "ہم نوائی" , "غلط" , "سفارت خانہ" , "اصلی" , "برثمرہ" , "برادری یا ذات سے اخراج" , "علم امراض وبائی" ,
            "بام مچھلی" , "اچھالنا" , "پیش رو" , "جوش" , "کیمیائی کھاد" , "دانت" , "پرجوش رقص" , "شیشہ فیکٹری" , "دینا تعارف" , "آدمی" , "گروم ویل" , "معنویت" , "لازوالی" , "شدید کرنے والا"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_word);

        TvEnglish=(TextView) findViewById(R.id.TvEnglish);
        TvEngWords=(TextView) findViewById(R.id.TvEngWords);
        TvUrdu=(TextView) findViewById(R.id.TvUrdu);
        TvUrduword=(TextView) findViewById(R.id.TvUrduword);






    }
}
