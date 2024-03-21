package com.grobik.fd

import android.graphics.Paint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.grobik.fd.R.id

class forPas : AppCompatActivity() {
    var TIMEOUT_MILLIS = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_pas)
        val text = findViewById<TextView>(R.id.password11)
        text.setOnClickListener {
            if (text.text != "Что-то") {
                text.text = "Что-то"
            }

        }
    }
}