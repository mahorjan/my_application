package com.horvat.demoapplication01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "OnCreate");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "onTounchEvent");

        return super.onTouchEvent(event);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MainActivity", "OnDestroy");
    }

    public void onKlikAction(View view) {

        Intent intent=new Intent(this, NovoOkno.class);
        startActivity(intent);

        Log.d("MainActivity", "KLIK");
    }
}
