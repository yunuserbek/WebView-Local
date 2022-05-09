package com.example.webviewjavascript;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webViewCalculator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        webViewCalculator = (WebView) findViewById(R.id.webViewCalculator);
        webViewCalculator.getSettings().setJavaScriptEnabled(true);
        webViewCalculator.loadUrl("file:///android_asset/index.html");
    }
}