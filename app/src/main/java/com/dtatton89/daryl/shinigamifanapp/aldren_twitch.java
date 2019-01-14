package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class aldren_twitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aldren_twitch);


        final WebView aldrenVideo = findViewById(R.id.AldrenVideo);

        aldrenVideo.setWebChromeClient(new WebChromeClient());
        aldrenVideo.getSettings().setJavaScriptEnabled(true);
        aldrenVideo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        aldrenVideo.getSettings().setLoadsImagesAutomatically(true);
        aldrenVideo.getSettings().setAllowContentAccess(true);
        aldrenVideo.getSettings().setMediaPlaybackRequiresUserGesture(false);
        aldrenVideo.setWebChromeClient(new WebChromeClient());
        aldrenVideo.loadUrl("file:///android_asset/AldrenTwitch.Embed");


    }

}


