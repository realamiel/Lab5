package com.real.francisamiel.lab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Activity 1");
    }

    public void process (View v){
        Intent i = null, chooser=null;
        if (v.getId() == R.id.btnmap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:13.996174, 121.342159"));
            chooser = Intent.createChooser(i,"Choose map app");
            startActivity(chooser);
        }

        else if (v.getId() == R.id.btnact2){
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        }
    }
}
