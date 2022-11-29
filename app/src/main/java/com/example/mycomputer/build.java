package com.example.mycomputer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class build extends Activity {
    WebView webView;
    
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.build);





        ImageView mimageView = findViewById(R.id.imageView);
        mimageView.setImageResource(R.drawable.pc);

        ImageView intelimageView = findViewById(R.id.imageView2);
        intelimageView.setImageResource(R.drawable.intel);

        ImageView amdimageView = findViewById(R.id.imageView3);
        amdimageView.setImageResource(R.drawable.amd);


        ImageView matherimageView = findViewById(R.id.imageView4);
        matherimageView.setImageResource(R.drawable.img);


        ImageView coolimageView = findViewById(R.id.imageView5);
        coolimageView.setImageResource(R.drawable.cool);

        ImageView videoimageView = findViewById(R.id.imageView6);
        videoimageView.setImageResource(R.drawable.video);

        ImageView bodyimageView = findViewById(R.id.imageView7);
        bodyimageView.setImageResource(R.drawable.body);

        ImageView hddimageView = findViewById(R.id.imageView8);
        hddimageView.setImageResource(R.drawable.img_1);

        ImageView ozuimageView = findViewById(R.id.imageView9);
        ozuimageView.setImageResource(R.drawable.img_2);

        ImageView bpimageView = findViewById(R.id.imageView10);
        bpimageView.setImageResource(R.drawable.img_3);
    }
}
