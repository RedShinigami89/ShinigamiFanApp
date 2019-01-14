package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class BrockTwitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brock_twitch);


        final WebView Video = findViewById(R.id.BrockTwitch);

        Video.setWebChromeClient(new WebChromeClient());
        Video.getSettings().setJavaScriptEnabled(true);
        Video.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        Video.getSettings().setLoadsImagesAutomatically(true);
        Video.getSettings().setAllowContentAccess(true);
        Video.getSettings().setMediaPlaybackRequiresUserGesture(false);
        Video.setWebChromeClient(new WebChromeClient());
        Video.loadUrl("file:///android_asset/BrockyTwitch.Embed");
    }
}
