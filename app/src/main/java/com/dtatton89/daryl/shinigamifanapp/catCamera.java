package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class catCamera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_camera);

        WebView twitchEmbedded = findViewById(R.id.CatCam);
        twitchEmbedded.setWebViewClient(new WebViewClient());
        twitchEmbedded.getSettings().setJavaScriptEnabled(true);
        twitchEmbedded.setBackgroundColor(0);
        twitchEmbedded.loadUrl("http://192.168.0.10:86/live.html?src=1");


    }

}
