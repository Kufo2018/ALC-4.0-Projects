package com.example.alc4phase1;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AboutALCJava extends AppCompatActivity {

    WebView webView;
    String url = "https://andela.com/alc";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alcjava);

        // Gets a support ActionBar corresponding to the action bar
        ActionBar ab = getSupportActionBar();

        // Enables the up navigation button
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);
        }

        // Handles logic for loading URL in WebView correctly
        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyClientWebView());
        webView.loadUrl(url);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    /**
     * Custom Webview client adapted from
     * Regnex(https://gist.github.com/RegNex)
     */
    private class MyClientWebView extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {

            // Handler proceeds despite SSL certficate error
            handler.proceed();
        }
    }
}