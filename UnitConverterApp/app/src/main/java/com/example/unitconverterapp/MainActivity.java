package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

// android R.java file contains resource IDs for all the resources
//we can use to access views from our java files
// button = findViewById(R.id.myButton)

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));

        Button button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    String s = editText.getText().toString();
                    int kg = Integer.parseInt(s);
                    double pound = 2.20462*kg;
                    textView.setText(pound +" Pounds");
                    Toast.makeText(MainActivity.this, "Hi this got worked!", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    textView.setText("");
                    Toast.makeText(MainActivity.this, "Please Enter Value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}