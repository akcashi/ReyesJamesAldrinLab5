package com.Reyes.JamesAldrin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Lab 5: Explicit and Implicit Content");
        Intent i = new Intent(this, bgService.class);
        startService(i); }

public void lab5Act2(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.back2){
        i = new Intent(this, MainActivity.class);
        startActivity(i); }
        else if(v.getId() == R.id.next2){
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:14.5849, 120.9927"));
        chooser = Intent.createChooser(i, "Choose App to be Used");
        startActivity(chooser); }
        }
        }
