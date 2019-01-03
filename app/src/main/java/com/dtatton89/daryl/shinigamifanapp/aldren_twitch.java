package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class aldren_twitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aldren_twitch);

        final TextView aldrenTitle = findViewById(R.id.AldrenTitle);
        final TextView aldrenTime = findViewById(R.id.AldrenTime);
        final WebView aldrenVideo = findViewById(R.id.AldrenVideo);
        final TextView aldrenClipTitle = findViewById(R.id.AldrenClip2Title);
        final TextView aldrenClipTime = findViewById(R.id.AldrenClipVIews);
        final ImageView aldrenClip = findViewById(R.id.AldrenClip);


        String url = "https://api.twitch.tv/helix/clips?broadcaster_id=64578628";

        // Request a string response from the provided URL.
        final JsonObjectRequest AldrenRequest = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {


                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 1; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String Name = object.getString("title");
                                aldrenTitle.setText(Name);
                            }


                            JSONObject jsonObject2 = response;
                            JSONArray JA2 = jsonObject2.getJSONArray("data");
                            for (int i = 1; i < response.length(); i++) {
                                JSONObject object = JA2.getJSONObject(i);
                                String Time = object.getString("view_count");
                                aldrenTime.setText("Views:  " + Time);
                            }


                            JSONObject jsonObject3 = response;
                            JSONArray JA3 = jsonObject3.getJSONArray("data");
                            for (int i = 1; i < response.length(); i++) {
                                JSONObject object = JA3.getJSONObject(i);
                                String video = object.getString("embed_url");




                                String html = "<iframe width=\"375\" height=\"225\" style=\"border: 1px solid #cccccc;\" src=\"https://player.tv/?channel=aldren\"></iframe>";
                               // String html = "<iframe frameborder= \"1\" scrolling = \"yes\" id =\"aldren\" src=\"https://www.twitch.tv/embed/aldren/chat\" height = \"300\" width=\"780\"><iframe>";
                                aldrenVideo.setWebChromeClient(new WebChromeClient());
                                aldrenVideo.getSettings().setJavaScriptEnabled(true);
                                aldrenVideo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                                aldrenVideo.getSettings().setLoadsImagesAutomatically(true);
                                aldrenVideo.getSettings().setAllowContentAccess(true);
                                aldrenVideo.getSettings().setMediaPlaybackRequiresUserGesture(false);
                                aldrenVideo.setWebChromeClient(new WebChromeClient());
                                aldrenVideo.loadData(html, "text/html", null);



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
                Map<String, String> params = new HashMap<String, String>();
                params.put("Client-ID", "wa96tyey0qflbcid8e6jpt45681p2e");
                params.put("content-type", "application/json");
                return params;
            }


        };

        final JsonObjectRequest AldrenRequest2 = new JsonObjectRequest
                (com.android.volley.Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONObject jsonObject = response;
                            JSONArray JA = jsonObject.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA.getJSONObject(i);
                                String Name = object.getString("title");
                                aldrenClipTitle.setText(Name);
                            }


                            JSONObject jsonObject2 = response;
                            JSONArray JA2 = jsonObject2.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA2.getJSONObject(i);
                                String Time = object.getString("view_count");
                                aldrenClipTime.append(Time);
                            }


                            JSONObject jsonObject3 = response;
                            JSONArray JA3 = jsonObject3.getJSONArray("data");
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject object = JA3.getJSONObject(i);
                                String Image = object.getString("thumbnail_url");
                                new DownLoadImageTask(aldrenClip).execute(Image);


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
                Map<String, String> params = new HashMap<String, String>();
                params.put("Client-ID", "wa96tyey0qflbcid8e6jpt45681p2e");
                params.put("content-type", "application/json");
                return params;
            }


        };

        MySingleton.getInstance(this).addToRequestQueue(AldrenRequest);
        MySingleton.getInstance(this).addToRequestQueue(AldrenRequest2);

    }


}
