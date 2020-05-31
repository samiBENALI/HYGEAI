package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Write a message to the database


    }
    public void connectDevice(View v){
        Intent connection = new Intent(this,Connection.class);
        startActivity(connection);
    }


    public void about_us1(View v) {
        Intent abt1 = new Intent(this, aboutus.class);
        startActivity(abt1);
    }
    public void howitworks(View v) {
        Intent how = new Intent(this, howitworks.class);
        startActivity(how);
    }

}
