package com.example.mycomputer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCustomActionBar();
    }

    private void setCustomActionBar() {
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        View v = LayoutInflater.from(this).inflate(R.layout.custom_action_bar,null);

        getSupportActionBar().setCustomView(v);
        getSupportActionBar().setElevation(0);
    }

    public void components_click(View view) {
        Intent intent = new Intent(MainActivity.this, components.class);
        startActivity(intent);
    }

    public void build_onclick(View view) {
        Intent intent = new Intent(MainActivity.this, build.class);
        startActivity(intent);
    }

    public void programm_onclick(View view) {
        Intent intent = new Intent(MainActivity.this, program.class);
        startActivity(intent);
    }
}