package com.example.daryl.shinigamifanapp;

import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Uri.Builder b = Uri.parse("http://www.twitch.tv/Red_Shinigami89").buildUpon();

    }

            public void onClick(View view){

             setContentView(R.layout.discord);
}



}

