package com.dtatton89.daryl.shinigamifanapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView RedStatus = findViewById(R.id.statusOnline);
        RequestQueue queue = Volley.newRequestQueue(this);

        String url = "https://api.twitch.tv/helix/streams?user_id=48683189";

        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest7 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("type");
                                if (bio.equals("live")) {
                                    RedStatus.setVisibility(View.VISIBLE);
                                } else {
                                    RedStatus.setVisibility(View.GONE);

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
                        RedStatus.setVisibility(View.GONE);
                        Log.e("VOLLEY", "ERROR");

                    }
                })


        {    //this is the part, that adds the header to the request

            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("Client-ID", "wa96tyey0qflbcid8e6jpt45681p2e");
                params.put("content-type", "application/json");
                return params;
            }


        };

        // Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest7);

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

        ImageView Test = findViewById(R.id.countdown_icon);
        Test.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, alternative.class);
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
        if (id == R.id.menu_refresh) {


                Intent intent = getIntent();
                finish();
                startActivity(intent);
                return true;

        }

        int id2 = item.getItemId();
        if (id2 == R.id.menu) {


            /*Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://id.twitch.tv/oauth2/authorize?client_id=wa96tyey0qflbcid8e6jpt45681p2e&redirect_uri=myapp://com.daryl.dtatton89.shinigamifanapp&response_type=token&scope=user:edit+user:read:email"));
            startActivity(intent);
            Log.v("Authorization:","Error");


            WebView login =  new WebView(this);
            login.setWebViewClient(new WebViewClient());
            login.getSettings().setJavaScriptEnabled(true);
            login.setBackgroundColor(0);
            login.loadUrl("javascript:var nameHash = location.hash;");
            */

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




