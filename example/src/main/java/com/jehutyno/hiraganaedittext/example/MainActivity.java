package com.jehutyno.hiraganaedittext.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jehutyno.hiraganaedittext.HiraganaEditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HiraganaEditText hiraganaEditText = (HiraganaEditText) findViewById(R.id.edittext);

        hiraganaEditText.setEnableConversion(false);
    }
}
