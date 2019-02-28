package com.dtatton89.daryl.shinigamifanapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class TazTwitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taz_twitch);

        final WebView Video = findViewById(R.id.TazTwitch);

        Video.setWebChromeClient(new WebChromeClient());
        Video.getSettings().setJavaScriptEnabled(true);
        Video.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        Video.getSettings().setLoadsImagesAutomatically(true);
        Video.getSettings().setAllowContentAccess(true);
        Video.getSettings().setMediaPlaybackRequiresUserGesture(false);
        Video.setWebChromeClient(new WebChromeClient());
        Video.loadUrl("file:///android_asset/TazTwitch.Embed");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //and this to handle actions
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
        if (id == R.id.menu_refresh) {
            Intent intent = getIntent();
            finish();
            startActivity(intent);


            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
