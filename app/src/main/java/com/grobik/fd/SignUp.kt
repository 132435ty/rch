package com.grobik.fd

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        val text = findViewById<TextView>(R.id.textView7)
        text.setOnClickListener {
            if (text.text != "Что-то") {
                val intent = Intent(this, LogInActivity::class.java)
                startActivity(intent)
            }
        }
    }
}