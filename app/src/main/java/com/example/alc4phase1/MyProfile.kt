package com.example.alc4phase1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.alc4phase1.databinding.ActivityMyProfileBinding

class MyProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instantiates data binding
        val dataBinding: ActivityMyProfileBinding = DataBindingUtil.setContentView(this, R.layout.activity_my_profile)

        // Sets the text for respective views
        dataBinding.myName.text = getString(R.string.my_name)
        dataBinding.track.text = getString(R.string.track)
        dataBinding.country.text = getString(R.string.country_name)
        dataBinding.email.text = getString(R.string.email)
        dataBinding.phoneNumber.text = getString(R.string.phone_number)
        dataBinding.slackUsername.text = getString(R.string.slack_username)


    }
}
