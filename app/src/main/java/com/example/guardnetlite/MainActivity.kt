package com.example.guardnetlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener()
        {
            Toast.makeText(this@MainActivity,
                    R.string.editmsg, Toast.LENGTH_LONG).show() }

    }
}
