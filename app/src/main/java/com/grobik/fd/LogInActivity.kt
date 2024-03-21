package com.grobik.fd

import android.graphics.Paint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LogInActivity : AppCompatActivity() {
    var TIMEOUT_MILLIS = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)
        val text = findViewById<TextView>(R.id.password11)
        text.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        text.setOnClickListener {
            if (text.text != "Что-то") {
                text.text = "Что-то"
            } else {
                text.text = "Здравствуйте"
            }

        }
    }
}