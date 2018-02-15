package com.example.daryl.shinigamifanapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Twitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitch);


        WebView webview = findViewById(R.id.Kappa);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setBackgroundColor(0);
        webview.loadUrl("http://stream.kappamon.com/98c23803-2306-4989-8c1d-804d06e133d9");


        WebView bitBoss = findViewById(R.id.bitBoss2);
        bitBoss.setWebViewClient(new WebViewClient());
        bitBoss.getSettings().setJavaScriptEnabled(true);
        bitBoss.setBackgroundColor(0);
        bitBoss.loadUrl("https://streamlabs.com/widgets/streamboss?token=8AA2128A41E20E07");

        WebView chatbox = findViewById(R.id.chatbox);
        chatbox.setWebViewClient(new WebViewClient());
        chatbox.getSettings().setJavaScriptEnabled(true);
        chatbox.setBackgroundColor(0);
        chatbox.loadUrl("https://streamlabs.com/widgets/chat-box/v1/8AA2128A41E20E07");

        WebView view = new WebView(this);
        view.findViewById(R.id.twitchvid);
        view.setWebViewClient(new WebViewClient());
        view.getSettings().setJavaScriptEnabled(true);
        view.setBackgroundColor(0);
        view.loadUrl("file:///android_asset/twitchEmbbed.HTML");


    }


}
