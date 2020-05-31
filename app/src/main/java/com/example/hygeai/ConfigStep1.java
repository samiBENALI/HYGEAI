package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class ConfigStep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_step1);

    }
    public void goToStep2(View v){
        Intent step2 = new Intent(this,ConfigStep2.class);
        startActivity(step2);

    }
}
