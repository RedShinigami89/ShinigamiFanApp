package com.dtatton89.daryl.shinigamifanapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView contact = findViewById(R.id.contact_Icon);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Contact.class);
                startActivity(contactIntent);
            }
        });


        ImageView friends = findViewById(R.id.friends_Icon);
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, FriendsStream.class);
                startActivity(contactIntent);
            }
        });


        ImageView subscriber = findViewById(R.id.sub_Icon);
        subscriber.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, subscriber.class);
                startActivity(contactIntent);
            }
        });


        ImageView twitch = findViewById(R.id.twitch_Icon);
        twitch.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Twitch.class);
                startActivity(contactIntent);
            }
        });


        ImageView donate = findViewById(R.id.donate_Icon);
        donate.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, TwitchLogin.class);
                startActivity(contactIntent);
            }
        });


    }


    public void Blog(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://dtatton89.wixsite.com/reds-room"));
        startActivity(intent);
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

    public void discordLink(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://discord.gg/Svt5nTh"));
        startActivity(intent);
    }


    public void twitterLink(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitter.com/red_shinigami89"));
        startActivity(intent);

    }

    public void twitchLink(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitch.tv/red_shinigami89"));
        startActivity(intent);
    }


}




