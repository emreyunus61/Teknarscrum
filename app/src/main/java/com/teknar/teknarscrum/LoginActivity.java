package com.teknar.teknarscrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {
     Button logbuton;
     TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logbuton=(Button)findViewById(R.id.log_bot);
        tv1=findViewById(R.id.textView1);
        logbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new arkaPlan().execute("https://api.aladhan.com/timingsByAddress/10-09-2019?address=istanbul,UAE&method=8&tune=2,3,4,5,2,3,4,5,-3");
                Intent intent=new Intent(getApplicationContext(),TransitionActivity.class);
                startActivity(intent);
            }
        });


    }
    class arkaPlan extends AsyncTask<String,String,String> {

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection;
            BufferedReader br;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is));
                String satir;
                String dosya = "";
                while ((satir = br.readLine()) != null) {
                    Log.d("satir:", satir);
                    dosya += satir;
                }
                return dosya;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "hata";
        }
        protected void onPostExecute(String s) {
            Log.d("gelen mesaj", s);
            tv1.setText(s);

        }
    }


}
