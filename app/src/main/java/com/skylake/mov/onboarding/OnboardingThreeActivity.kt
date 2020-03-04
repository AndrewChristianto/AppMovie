package com.skylake.mov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skylake.mov.R
import com.skylake.mov.signin.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_on_boarding_one.*

class OnboardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_three)

        btn_home.setOnClickListener {
            finishAffinity()
            val intent = Intent(this@OnboardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
