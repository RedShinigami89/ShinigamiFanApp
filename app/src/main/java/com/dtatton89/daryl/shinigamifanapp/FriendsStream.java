package com.dtatton89.daryl.shinigamifanapp;


import android.content.Intent;
import android.graphics.Color;
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


public class FriendsStream extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends);

        final TextView mTextView = findViewById(R.id.AldrenBio);
        final TextView mTextView2 = findViewById(R.id.info_text);
        final TextView mTextView3 = findViewById(R.id.TazBio);
        final TextView mTextView4 = findViewById(R.id.info_text2);
        final TextView mTextView5 = findViewById(R.id.info_text3);
        final TextView mTextView6 = findViewById(R.id.kellBio);
        final ImageView tazImage = findViewById(R.id.tazImage);
        final ImageView AldrenImage = findViewById(R.id.AldrenLogo);
        final ImageView KellImage = findViewById(R.id.kellLogo);
        final View BannerTaz = findViewById(R.id.tazBanner);
        final TextView TazOnline = findViewById(R.id.TazOnline);
        final TextView AldrenOnline = findViewById(R.id.AldrenOnline);
        final View BannerAldren = findViewById(R.id.AldrenBanner);
        final TextView KelladornOnline = findViewById(R.id.KelladornOnline);
        final View BannerKelladorn = findViewById(R.id.KelladornBanner);



    // Instantiate the RequestQueue.
    RequestQueue queue = Volley.newRequestQueue(this);
    String url = "https://api.twitch.tv/helix/users?login=Aldren";


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
                            mTextView.append("'s Bio - \n" + bio);
                        }

                        JSONObject jsonObject2 = response;
                        JSONArray JA2 = jsonObject2.getJSONArray("data");
                        for (int i = 0; i < response.length(); i++) {
                            JSONObject object = JA2.getJSONObject(i);
                            String name = object.getString("display_name");
                            mTextView2.append(name);
                        }

                        JSONObject jsonObject3 = response;
                        JSONArray JA3 = jsonObject3.getJSONArray("data");
                        for (int i = 0; i < response.length(); i++) {
                            JSONObject object = JA3.getJSONObject(i);
                            String Image = object.getString("profile_image_url");
                            new DownLoadImageTask(AldrenImage).execute(Image);
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

     url ="https://api.twitch.tv/helix/users?login=TaztheterriblyFluffy";

    // Request a string response from the provided URL.
    final JsonObjectRequest jsonObjectRequest2 = new JsonObjectRequest
            (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {

                        JSONObject jsonObject = response;
                        JSONArray JA = jsonObject.getJSONArray("data");
                        for (int i = 0; i < response.length(); i++) {
                            JSONObject object = JA.getJSONObject(i);
                            String bio = object.getString("description");
                            mTextView3.append("'s Bio - \n" + bio);
                        }

                        JSONObject jsonObject2 = response;
                        JSONArray JA2 = jsonObject2.getJSONArray("data");
                        for (int i = 0; i < response.length(); i++) {
                            JSONObject object = JA2.getJSONObject(i);
                            String name = object.getString("display_name");
                            mTextView4.append(name);
                        }

                        JSONObject jsonObject3 = response;
                        JSONArray JA3 = jsonObject3.getJSONArray("data");
                        for (int i = 0; i < response.length(); i++) {
                            JSONObject object = JA3.getJSONObject(i);
                            String Image = object.getString("profile_image_url");
                            new DownLoadImageTask(tazImage).execute(Image);
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



        url ="https://api.twitch.tv/helix/users?login=kelladorn";

        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest3 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("description");
                                mTextView6.append("'s Bio - \n" + bio);
                            }

                            JSONObject jsonObject2 = response;
                            JSONArray JA2 = jsonObject2.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA2.getJSONObject(i);
                                String name = object.getString("display_name");
                                mTextView5.append(name);
                            }

                            JSONObject jsonObject3 = response;
                            JSONArray JA3 = jsonObject3.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA3.getJSONObject(i);
                                String Image = object.getString("profile_image_url");
                                new DownLoadImageTask(KellImage).execute(Image);
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



        url ="https://api.twitch.tv/helix/streams?user_id=153549704";

        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest4 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("type");
                                if (bio.equals("live"))
                                    BannerTaz.setBackgroundColor(Color.parseColor("#7289da"));
                                TazOnline.append(bio);
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

        url = "https://api.twitch.tv/helix/streams?user_id=64578628";

        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest5 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("type");
                                if (bio.equals("live"))
                                    BannerAldren.setBackgroundColor(Color.parseColor("#9b00d2"));
                                AldrenOnline.append(bio);
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

        url = "https://api.twitch.tv/helix/streams?user_id=148347511";

        // Request a string response from the provided URL.
        final JsonObjectRequest jsonObjectRequest6 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String bio = object.getString("type");
                                if (bio.equals("live"))
                                    BannerKelladorn.setBackgroundColor(Color.parseColor("#9b00d2"));
                                KelladornOnline.append(bio);
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



// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest2);
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest3);
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest4);
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest5);
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest6);


}



    public void twitterLinkAldren(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://twitter.com/aldrendakeer"));
        startActivity(intent);
    }

    public void discordLinkAldren(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://discord.gg/ssqTuM6"));
        startActivity(intent);
    }

    public void twitchLinkAldren(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitch.tv/aldren"));
        startActivity(intent);
    }

    public void twitterLinkTaz(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://twitter.com/Taz_TheTerrible"));
        startActivity(intent);
    }

    public void discordLinkTaz(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://discord.gg/dCndXc6"));
        startActivity(intent);
    }

    public void twitchLinkTaz(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitch.tv/taztheterriblyfluffy"));
        startActivity(intent);
    }

    public void twitterLinkKelladorn(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://twitter.com/tydriest"));
        startActivity(intent);
    }

    public void discordLinkKelladorn(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://discord.gg/5CNFGKD"));
        startActivity(intent);
    }

    public void twitchLinkKelladorn(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.twitch.tv/kelladorn"));
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
        }if (id == R.id.menu_refresh) {


            Intent intent = getIntent();
            finish();
            startActivity(intent);
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}


