package com.teknar.teknarscrum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class TaskAddActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorev_atama);

        spinner=(Spinner)findViewById(R.id.spinner);
        textView=(TextView)findViewById(R.id.text);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.person,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner=(Spinner)findViewById(R.id.spinner2);
        textView=(TextView)findViewById(R.id.text2);
        ArrayAdapter adapter1=ArrayAdapter.createFromResource(this,R.array.task,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
    }
}