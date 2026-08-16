package com.watch.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.watchWebView);
        WebSettings settings = webView.getSettings();
        
        // Essential web engine settings
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        
        // Keeps the website inside the watch app window
        webView.setWebViewClient(new WebViewClient());
        
        // CHANGE THIS TO YOUR WEBSITE URL
        webView.loadUrl("https://aturtlegod.github.io");
    }
}
