package com.dtatton89.daryl.shinigamifanapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TwitchLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
    setContentView(R.layout.twitch_login);

        WebView webview = findViewById(R.id.Web);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setBackgroundColor(0);
        String htmlString = "<html>\n" +
                "  <body>\n" +
                "    <!-- Add a placeholder for the Twitch embed -->\n" +
                "    <div id=\"twitch-embed\"></div>\n" +
                "\n" +
                "    <!-- Load the Twitch embed script -->\n" +
                "    <script src=\"https://embed.twitch.tv/embed/v1.js\"></script>\n" +
                "\n" +
                "    <!-- Create a Twitch.Embed object that will render within the \"twitch-embed\" root element. -->\n" +
                "    <script type=\"text/javascript\">\n" +
                "      new Twitch.Embed(\"twitch-embed\", {\n" +
                "        width: 350,\n" +
                "        height: 480,\n" +
                "        channel: \"monstercat\"\n" +
                "      });\n" +
                "    </script>\n" +
                "  </body>\n" +
                "</html";

        webview.loadData(htmlString, "text/html", "utf-8");

}

public class Twitch{

}
}
