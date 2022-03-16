package com.example.a3act;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class Activity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        Button fact3 =(Button)findViewById(R.id.button5);
        EditText rost = (EditText)findViewById(R.id.editTextNumber);
        EditText ves = (EditText)findViewById(R.id.editTextNumber2);
        TextView imt = (TextView)findViewById(R.id.textView8);
        TextView stat = (TextView)findViewById(R.id.textView9);
        fact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String growth = rost.getText().toString();
                if(growth.equals("")){
                    growth="1";
                }
                String weight = ves.getText().toString();
                if(weight.equals("")){
                    weight="1";
                }
                int a = Integer.parseInt(weight);
                System.out.println(a);
                int b = Integer.parseInt(growth);
                System.out.println(b);
                float dimt = ((float)a)/((float)(b*b))*10000;
                System.out.println(dimt);
                imt.setText(String.valueOf(dimt));
                if (dimt == 1.0){
                    stat.setText("Ошибка");
                }else if (dimt<=16){
                    stat.setText("Выраженный дефицит массы тела");
                }else if ((dimt > 16)&(dimt <= 18.5)){
                    stat.setText("Недостаточная (дефицит) масса тела");
                }else if(dimt <= 25){
                    stat.setText("В норме");
                }else if(dimt<=30){
                    stat.setText("Предожирение");
                }else if(dimt<=35){
                    stat.setText("Ожирение первой степени");
                }else if (dimt <=40){
                    stat.setText("Ожирение второй степени");
                }
                else{
                    stat.setText("Ожирение третьей степени");
                }

            }
        });

    }
}