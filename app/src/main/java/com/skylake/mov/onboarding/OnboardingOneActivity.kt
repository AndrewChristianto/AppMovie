package com.skylake.mov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skylake.mov.R
import kotlinx.android.synthetic.main.activity_on_boarding_one.*
import com.skylake.mov.signin.signin.SignInActivity

class OnboardingOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        btn_home.setOnClickListener {
            val intent = Intent( this@OnboardingOneActivity,
                OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_daftar.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OnboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
