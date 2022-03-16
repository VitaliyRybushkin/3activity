package com.example.a3act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button rand = (Button)findViewById(R.id.button4);
        TextView txt = (TextView)findViewById(R.id.textView3) ;

        rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ra = new Random();
                txt.setText(String.valueOf(ra.nextInt()));

            }
        });
    }
}