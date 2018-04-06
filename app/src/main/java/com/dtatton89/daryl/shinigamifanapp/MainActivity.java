package com.dtatton89.daryl.shinigamifanapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nimbusds.oauth2.sdk.AuthorizationRequest;
import com.nimbusds.oauth2.sdk.Scope;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.id.State;
import com.nimbusds.openid.connect.sdk.op.OIDCProviderMetadata;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView contact = (ImageView) findViewById(R.id.contact_Icon);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Contact.class);
                startActivity(contactIntent);
            }
        });

        ImageView friends = (ImageView) findViewById(R.id.friends_Icon);
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, FriendsStream.class);
                startActivity(contactIntent);
            }
        });

        ImageView subscriber = (ImageView) findViewById(R.id.sub_Icon);
        subscriber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, subscriber.class);
                startActivity(contactIntent);
            }
        });

        ImageView twitch = (ImageView) findViewById(R.id.twitch_Icon);
        twitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Twitch.class);
                startActivity(contactIntent);
            }
        });

        ImageView donate = (ImageView) findViewById(R.id.donate_Icon);
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, TwitchLogin.class);
                startActivity(contactIntent);
            }
        });

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