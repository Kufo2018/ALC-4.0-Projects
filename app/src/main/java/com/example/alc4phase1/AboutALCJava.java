package com.example.alc4phase1;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class AboutALCJava extends AppCompatActivity {

    /**
     * Webview client adapted from Regnex(https://gist.github.com/RegNex)
     */
    WebView webView;
    String url = "https://andela.com/alc";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alcjava);
        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyClientWebView());
        webView.loadUrl(url);
    }

    // Custom webview client
    private class MyClientWebView extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {

            // Handler proceeds despite SSL cert error
            handler.proceed();
        }
    }
}