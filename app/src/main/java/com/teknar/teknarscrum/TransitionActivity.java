package com.teknar.teknarscrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransitionActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        button1=(Button)findViewById(R.id.t_task);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Log1=new Intent(TransitionActivity.this,TaskActivity.class);
                startActivity(Log1);
            }
        });
        button2=(Button)findViewById(R.id.t_tasksc);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Log2=new Intent(TransitionActivity.this, TaskAddActivity.class);
                startActivity(Log2);
            }
        });
        button3=(Button)findViewById(R.id.t_user);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Log3=new Intent(TransitionActivity.this,AddContacts.class);
                startActivity(Log3);
            }
        });
        button4=(Button)findViewById(R.id.t_tasksc2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Log4=new Intent(TransitionActivity.this,WeeklyScrumActivity.class);
                startActivity(Log4);
            }
        });

    }
}
