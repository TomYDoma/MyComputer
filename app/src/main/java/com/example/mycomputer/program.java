package com.example.mycomputer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class program extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_program);

    }
    public void goToMO (View view) {
        goToUrl ( "https://www.microsoft.com/ru-ru/microsoft-365/microsoft-office");
    }

    public void goToYandex (View view) {
        goToUrl ( "https://browser.yandex.ru/");
    }

    public void goToChrome (View view) {
        goToUrl ( "https://www.google.ru/chrome/");
    }

    public void goToTelegram (View view) {
        goToUrl ( "https://desktop.telegram.org/");
    }

    public void goToVLC (View view) {
        goToUrl ( "https://www.videolan.org/");
    }

    public void goToPhotoshop (View view) {
        goToUrl ( "https://www.adobe.com/ru/products/photoshop.html");
    }

    public void goToSteam (View view) {
        goToUrl ( "https://store.steampowered.com/about/");
    }

    public void goToMediaGet (View view) {
        goToUrl ( "https://mediaget.com/");
    }

    public void goToVSCode (View view) {
        goToUrl ( "https://code.visualstudio.com/download");
    }
    public void goToDrWeb (View view) {
        goToUrl ( "https://www.drweb.ru/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
