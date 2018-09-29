package com.real.francisamiel.lab5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.setTitle("Activity 2");
    }

    public void process (View v){
        Intent i = null, chooser=null;
        if (v.getId() == R.id.btnmap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.282254, 121.096895"));
            chooser = Intent.createChooser(i,"Choose map app");
            startActivity(chooser);
        }

        else if (v.getId() == R.id.btnact1){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
