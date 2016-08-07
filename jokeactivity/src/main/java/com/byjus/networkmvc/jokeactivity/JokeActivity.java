package com.byjus.networkmvc.jokeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static String  JOKE_STRING = "joke_string";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent i = getIntent();
        String val = i.getStringExtra(JOKE_STRING);
        TextView tv = (TextView) findViewById(R.id.joke_textview);
        tv.setText(val);

    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }
}
