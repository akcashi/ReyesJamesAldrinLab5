package com.Reyes.JamesAldrin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lab 5: Explicit and Implicit Content");
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, bgService.class);
        startService(i); }

        public void labAct5(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.act2){
            i = new Intent(this, activity_main2.class);
            startActivity(i); }
            else if(v.getId() == R.id.act2map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5889, 120.9753"));
            chooser = Intent.createChooser(i, "Choose App to be Used");
            startActivity(chooser); }
        }
    }
