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
import android.widget.TextView;

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

public class TwitchLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitch_login);


        final TextView mTextView = findViewById(R.id.FeaturedStreamer);
        final TextView mTextView2 = findViewById(R.id.FeaturedBio);
        final ImageView mImageView = findViewById(R.id.FeaturedLogo);
        final View CrashWebsite = findViewById(R.id.crashWebsite);


        final String aldrenUrl = "https://api.twitch.tv/helix/users?login=Aldren";
        final String TazUrl = "https://api.twitch.tv/helix/users?login=taztheterriblyfluffy";
        final String CrashUrl = "https://api.twitch.tv/helix/users?login=CrashKoeck";


        // Instantiate the RequestQueue. k
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.getCache().clear();
        final String url = CrashUrl;


        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("description");
                                mTextView2.append(bio);
                            }

                            JSONObject jsonObject2 = response;
                            JSONArray JA2 = jsonObject2.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA2.getJSONObject(i);
                                String name = object.getString("display_name");
                                mTextView.append(name);
                            }

                            JSONObject jsonObject3 = response;
                            JSONArray JA3 = jsonObject3.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA3.getJSONObject(i);
                                String Image = object.getString("profile_image_url");
                                new DownLoadImageTask(mImageView).execute(Image);
                            }

                            if (url == CrashUrl) {
                                CrashWebsite.setVisibility(View.VISIBLE);
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
                        mTextView.append("Welcome Guest");
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

        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);



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


    public void CrashSite(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://crashkoeck.com/"));
        startActivity(intent);
    }

    public void CrashTwitter(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitter.com/crashkoeck"));
        startActivity(intent);
    }

    public void CrashDiscord(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://crashkoeck.com/"));
        startActivity(intent);
    }



}
