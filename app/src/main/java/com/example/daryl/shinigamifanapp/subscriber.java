package com.example.daryl.shinigamifanapp;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;

public class subscriber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscriber);


        WebView bitBoss = findViewById(R.id.embedded);
        bitBoss.setWebViewClient(new WebViewClient());
        bitBoss.getSettings().setJavaScriptEnabled(true);
        bitBoss.setBackgroundColor(0);
        bitBoss.loadData("<iframe src=http://player.twitch.tv/red_shinigami89/height=300/width=400\"></iframe>", "text/html", "utf-8");

    }
}

