package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text);
        TextView output = findViewById(R.id.output);
    //@SuppressLint("WrongViewCast") Button btn = findViewById(R.id.btn);
        TextView input = findViewById(R.id.input);

     /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(input.getText().toString().equals("11940139")){
                    Toast.makeText(MainActivity.this, "es hat geklappt", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
}