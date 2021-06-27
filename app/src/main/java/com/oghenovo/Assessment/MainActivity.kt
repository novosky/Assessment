package com.oghenovo.Assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeButton = findViewById(R.id.welcomeButton)

        welcomeButton.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

    }

}
