package com.example.mycomputer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class components extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.components);

    }


    public void MotherboardOnClick(View view) {
        Intent intent = new Intent(components.this, motherboards.class);
        startActivity(intent);
    }

    public void ProcessorOnClick(View view) {
        Intent intent = new Intent(components.this, processor.class);
        startActivity(intent);
    }

    public void MemoryOnClick(View view) {
        Intent intent = new Intent(components.this, memory.class);
        startActivity(intent);
    }

    public void PowerOnClick(View view) {
        Intent intent = new Intent(components.this, power.class);
        startActivity(intent);
    }


    public void VideoOnClick(View view) {
        Intent intent = new Intent(components.this, video.class);
        startActivity(intent);
    }

    public void CoolOnClick(View view) {
        Intent intent = new Intent(components.this, cool.class);
        startActivity(intent);
    }


    public void BodyOnClick(View view) {
        Intent intent = new Intent(components.this, body.class);
        startActivity(intent);
    }

    public void hddssdOnClick(View view) {
        Intent intent = new Intent(components.this, hddssd.class);
        startActivity(intent);
    }


}
