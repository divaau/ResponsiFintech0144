package com.divaulia.responsi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnLogin.SetOnClickListener{
            Intent(this@RegisterActivity, MainActivity::class.java).also(
                startActivity(it)
            )
        }
    }
}