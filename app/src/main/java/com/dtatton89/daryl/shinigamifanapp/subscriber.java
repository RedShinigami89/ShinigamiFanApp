package com.dtatton89.daryl.shinigamifanapp;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class subscriber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscriber);

   }

 public void ordertshirt(View view){
     Intent intent = new Intent();
     intent.setAction(Intent.ACTION_VIEW);
     intent.addCategory(Intent.CATEGORY_BROWSABLE);
     intent.setData(Uri.parse("https://discord.gg/Svt5nTh"));
     startActivity(intent);
   }
}

