package com.lakshaysethi.driverhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new android.os.Handler().postDelayed( new Runnable() {public void run() { openStartActivity(); } }, 500); }

    private void openStartActivity() {
        Intent startOpenIntent = new Intent(MainActivity.this, Start.class);
        //myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(startOpenIntent);
    }
}
