package com.dtatton89.daryl.shinigamifanapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class subscriber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscriber);
        WebView SA = findViewById(R.id.StreamAvatar);
        SA.getSettings().setJavaScriptEnabled(true);
        SA.setWebViewClient(new WebViewClient());
        SA.loadUrl("https://server.streamavatars.com/viewer.html?channel_id=48683189&platform=twitch");



    }

    /*public void ordertshirt(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://discord.gg/Svt5nTh"));
        startActivity(intent);
    }
*/

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
        if (id == R.id.menu) {




            /* Intent productIntent = new Intent();
            productIntent.setAction(Intent.ACTION_VIEW);
            productIntent.setData(Uri.parse("https://id.twitch.tv/oauth2/authorize?response_type=token+id_token&client_id=wa96tyey0qflbcid8e6jpt45681p2e&redirect_uri=arn:aws:iam::636538204394:oidc-provider/api.twitch.tv/api/&scope=viewing_activity_read openid&state=c3ab8aa609ea11e793ae92361f002671"));
            startActivity(productIntent);
            */
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

