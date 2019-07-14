package com.example.alc4phase1

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent

class AboutALC : AppCompatActivity() {

    private var customTabHelper: CustomTabHelper = CustomTabHelper()

    companion object {
        private const val URL = "https://andela.com/alc/"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        /** Google custom tabs **/
        val builder = CustomTabsIntent.Builder()

        // Shows website title
        builder.setShowTitle(true)

        val customTabsIntent = builder.build()

        // Checks if Chrome is available
        val packageName = customTabHelper.getPackageNameToUse(this, "https://andela.com/alc/")

        customTabsIntent.intent.setPackage(packageName)

        customTabsIntent.launchUrl(this, Uri.parse(URL))
    }

    // Controls navigation button behaviour
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

//        // Navigation support for action bar
//        val actionbar = supportActionBar
//        actionbar?.setDisplayHomeAsUpEnabled(true)
//
//        // Sets content view
//        setContentView(R.layout.activity_about_alc)
//
//        // Prevents redirect
//        webview.webViewClient = WebViewClient()
//
//        // Loads the URL
//        webview.loadUrl("https://www.andela.com/alc/")

