package com.example.alc4phase1

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Navigation support for action bar
        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

        // Sets content view
        setContentView(R.layout.activity_about_alc)

        // Prevents redirect
        webview.webViewClient = WebViewClient()

        webview.settings.domStorageEnabled = true
        webview.settings.useWideViewPort = true
        webview.settings.loadWithOverviewMode = true

        // Loads the URL
        webview.loadUrl("https://www.andela.com/alc/")

    }

    // Controls navigation button behaviour
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
