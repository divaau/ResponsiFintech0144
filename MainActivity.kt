package com.divaulia.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.SetOnClickListener{
            Intent(this@MainActivity, RegisterActivity::class.java).also(
                startActivity(it)
            )
        }
    }
}