package com.dtatton89.daryl.shinigamifanapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class subscriber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscriber);

        ImageView CatCam = findViewById(R.id.CatCamera);
        CatCam.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(subscriber.this, catCamera.class);
                startActivity(contactIntent);
            }
        });
    }


            public void ordertshirt(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://discord.gg/Svt5nTh"));
                startActivity(intent);
            }




}

