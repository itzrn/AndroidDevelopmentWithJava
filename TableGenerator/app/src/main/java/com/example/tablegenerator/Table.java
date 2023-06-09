package com.example.tablegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class Table extends AppCompatActivity {
    private final Handler mHandler = new Handler();
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        number = getIntent().getStringExtra("number");

        mToastRunnable.run();
    }

    private int i = 1;
    private final Runnable mToastRunnable = new Runnable() {
        @Override
        public void run() {
            addNewLine();
            if (i == 11){
                Objects.requireNonNull(getSupportActionBar()).setTitle("Table Generated");
                return;
            }
            mHandler.postDelayed(this,1000);
        }
    };

    @SuppressLint("SetTextI18n")
    public void addNewLine(){
        LinearLayout linearLayout = findViewById(R.id.container);
        View view = getLayoutInflater().inflate(R.layout.table_card,null);
        TextView textView = view.findViewById(R.id.cardTextView);
        int result = i*Integer.parseInt(number);
        textView.setText(number +" X "+i+" = " + result);
        linearLayout.addView(view);
        i++;
    }

}