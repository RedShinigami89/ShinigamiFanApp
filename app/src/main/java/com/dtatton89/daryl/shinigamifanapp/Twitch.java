package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Twitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitch);

        WebView view = findViewById(R.id.twitchvid);
        view.setWebViewClient(new WebViewClient());
        view.getSettings().setJavaScriptEnabled(true);
        view.setBackgroundColor(0);
        view.loadData("<iframe src=\"http://player.twitch.tv/?channel=red_shinigami89&muted=true\" height=\"100%\"width=\"100%\"align=\"middle\"frameborder=\"0\"scrolling=\"no\"allowfullscreen=\"true\"></iframe>", "text/html", "utf-8");


    }


}






