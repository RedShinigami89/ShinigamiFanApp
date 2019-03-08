package com.dtatton89.daryl.FanApp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {


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
        if (id == R.id.contact) {
            Intent contactIntent = new Intent(MainActivity.this, Contact.class);
            startActivity(contactIntent);
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

   /* public void redTwitchLink(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitch.tv/red_shinigami89"));
        startActivity(intent);
    }
*/
/*
    final String CHANNEL_ID = "redAlert";
    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.twitterwhite)
            .setContentTitle("Red_Shinigami89 Is Live")
            .setContentText("Join Me! Restiance is Futile!")
            .setStyle(new NotificationCompat.BigTextStyle()
                    .bigText("Red_shinigami89 Has Gone live, Resitance Is Futile"))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT);
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView RBC = findViewById(R.id.rbc2);
/*
      ImageView comingsoon = findViewById(R.id.rbc2);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.swing);
        comingsoon.startAnimation(animation);
*/
/*
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        // notificationId is a unique int for each notification that you must define
        notificationManager.notify(12456, mBuilder.build());
*/
        final FloatingActionButton fab2 = findViewById(R.id.fab);
        RequestQueue queue = Volley.newRequestQueue(this);

        String url = "https://api.twitch.tv/helix/streams?user_login=Red_shinigami89";

        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest7 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

/*
                            JSONObject IconObject = response;
                            JSONArray JA2 = IconObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA2.getJSONObject(i);
                                String Image = object.getString("profile_image_url");
                                new DownLoadImageTask(RBC).execute(Image);
                            }
*/
                            JSONObject liveObject = response;
                            JSONArray JA = liveObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("type");
                                if (bio.equals("live")) {
                                    //createNotificationChannel();
                                    fab2.setVisibility(View.VISIBLE);

                                }
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }


                }


                        , new Response.ErrorListener()


                {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Log.e("VOLLEY", "ERROR");

                    }
                })


        {    //this is the part, that adds the header to the request

            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> params = new HashMap<>();
                params.put("Client-ID", "wa96tyey0qflbcid8e6jpt45681p2e");
                params.put("content-type", "application/json");
                return params;
            }


        };

        // Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest7);

      /*  ImageView contact = findViewById(R.id.contact_Icon);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Contact.class);
                startActivity(contactIntent);
            }
        });
        */


        ImageView friends = findViewById(R.id.friends_Icon);
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, FriendsStream.class);
                startActivity(contactIntent);
            }
        });


        ImageView subscriber = findViewById(R.id.StreamAvatar);
        subscriber.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, subscriber.class);
                startActivity(contactIntent);
            }
        });

       /* ImageView twitch = findViewById(R.id.twitch_Icon);
        twitch.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Twitch.class);
                startActivity(contactIntent);
            }
        });
        */


        ImageView donate = findViewById(R.id.donate_Icon);
        donate.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, TwitchLogin.class);
                startActivity(contactIntent);
            }
        });

        ImageView Test = findViewById(R.id.countdown_icon);
        Test.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, VIP.class);
                startActivity(contactIntent);
            }
        });

        //   FloatingActionButton fab = findViewById(R.id.fab);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitch.tv/red_shinigami89"));
                startActivity(intent);

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


/*
    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.app_name);
            String description = getString(R.string.WelcomeUser);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
    */

}





