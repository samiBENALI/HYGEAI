package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void disconnect_button(View v){
        Intent dis = new Intent(this,MainActivity.class);
        startActivity(dis);

    }
    public void change_button(View v){
        Intent reconf = new Intent(this,ConfigStep1.class);
        startActivity(reconf);

    }
    public void about_us2(View v) {
        Intent abt2 = new Intent(this, aboutus.class);
        startActivity(abt2);
    }
}
