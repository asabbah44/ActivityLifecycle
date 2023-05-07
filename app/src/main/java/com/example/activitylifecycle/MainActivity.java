package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  String tag="Life cycle step : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(tag,"onCreate");
    }

    public void onClickButton(View v) {

        Intent i = new Intent(this, Second.class);
        startActivity(i);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_LONG).show();

        Log.d(tag,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_LONG).show();

         Log.d(tag,"onRestart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Toast.makeText(getApplicationContext(), "onResumed called", Toast.LENGTH_LONG).show();

         Log.d(tag,"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_LONG).show();

        Log.d(tag,"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_LONG).show();
        Log.d(tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy");
    }
}