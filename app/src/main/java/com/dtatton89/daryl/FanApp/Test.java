package com.dtatton89.daryl.FanApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        GridView gridview = findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

       gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Test.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
