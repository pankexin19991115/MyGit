package com.example.mygit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void fun1(){
        Log.d(TAG, "fun1: ");
    }
    private void fun2(){
        Log.d(TAG, "fun2: ");
    }
}
