package com.example.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {


    private static final String TAG = "MainActivity3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.v(TAG, "This is verbose log");
        Log.d(TAG, "This is debug log");
        Log.i(TAG, "This is info log");
        Log.w(TAG, "This is warn log");
        Log.e(TAG, "This is an error log");


        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}