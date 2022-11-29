package com.example.mycomputer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class components extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.components);

    }


    public void notherboardclick(View view) {
        Intent intent = new Intent(components.this, motherboards.class);
        startActivity(intent);
    }

    public void processoronclick(View view) {
        Intent intent = new Intent(components.this, processor.class);
        startActivity(intent);
    }

    public void memoryonclick(View view) {
        Intent intent = new Intent(components.this, memory.class);
        startActivity(intent);
    }

    public void poweronclick(View view) {
        Intent intent = new Intent(components.this, power.class);
        startActivity(intent);
    }


    public void videoonclick(View view) {
        Intent intent = new Intent(components.this, video.class);
        startActivity(intent);
    }

    public void coolonclick(View view) {
        Intent intent = new Intent(components.this, cool.class);
        startActivity(intent);
    }


    public void bodyonclick(View view) {
        Intent intent = new Intent(components.this, body.class);
        startActivity(intent);
    }

    public void hddonclick(View view) {
        Intent intent = new Intent(components.this, hdd.class);
        startActivity(intent);
    }

    public void ssdonclick(View view) {
        Intent intent = new Intent(components.this, ssd.class);
        startActivity(intent);
    }
}
