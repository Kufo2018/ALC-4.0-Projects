package com.example.alc4phase1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.alc4phase1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instantiates data binding
        val dataBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Sets the text for the about_alc button
        dataBinding.aboutAlc.text = getString(R.string.about_alc)

        // Sets the text for the my_profile button
        dataBinding.myProfile.text = getString(R.string.my_profile)

        // Navigates to the AboutALC activity
        dataBinding.myProfile.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }

        // Navigates to the MyProfile activity
        dataBinding.aboutAlc.setOnClickListener {
            val intent = Intent(this, AboutAlcJava::class.java)
            startActivity(intent)
        }
    }
}
