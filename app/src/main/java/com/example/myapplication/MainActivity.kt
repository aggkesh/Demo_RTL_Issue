package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.press_me).setOnClickListener {
            SimpleAppCompactFragment().show(supportFragmentManager, SimpleAppCompactFragment::class.java.name)
        }
    }
}