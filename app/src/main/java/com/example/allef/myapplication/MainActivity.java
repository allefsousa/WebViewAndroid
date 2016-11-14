package com.example.allef.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nav ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url ="http://localhost:85/site";
        WebView wv=(WebView) findViewById(R.id.webView1);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        wv.getSettings().setAllowFileAccess(true);
        wv.loadUrl(url);


    }
}
