package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TwitchLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitch_login);

        WebView twitchEmbedded = findViewById(R.id.featuredStreamer);
        twitchEmbedded.setWebViewClient(new WebViewClient());
        twitchEmbedded.getSettings().setJavaScriptEnabled(true);
        twitchEmbedded.setBackgroundColor(0);
        twitchEmbedded.loadData("<iframe src=\"http://player.twitch.tv/?channel=aldren&muted=true\" height=\"100%\"width=\"100%\"align=\"middle\"frameborder=\"0\"scrolling=\"yes\"allowfullscreen=\"true\"></iframe>", "text/html", "utf-8");


    }


}
