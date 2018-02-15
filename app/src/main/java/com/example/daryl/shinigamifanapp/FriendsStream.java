package com.example.daryl.shinigamifanapp;


import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import android.widget.VideoView;
import android.net.Uri;
import android.widget.MediaController;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class FriendsStream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends);


        WebView webview = findViewById(R.id.testwebview1);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setBackgroundColor(0);
        webview.loadUrl("http://stream.kappamon.com/98c23803-2306-4989-8c1d-804d06e133d9");

        WebView bitBoss = findViewById(R.id.bitBoss);
        bitBoss.setWebViewClient(new WebViewClient());
        bitBoss.getSettings().setJavaScriptEnabled(true);
        bitBoss.setBackgroundColor(0);
        bitBoss.loadUrl("https://streamlabs.com/widgets/streamboss?token=8AA2128A41E20E07");

    }

    public class myWebClient extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
    }


    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub

        view.loadUrl(url);
        return true;

    }

}
