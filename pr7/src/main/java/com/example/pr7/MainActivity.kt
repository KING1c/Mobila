package com.example.pr7

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var counter2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var button: Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.textView)
        var textView2: TextView = findViewById(R.id.textView2)

        button.setOnClickListener {
            textView.text = "Hello, friend!"
        }
        var buttonCount: Button = findViewById(R.id.button_count)
        buttonCount.setOnClickListener {
            textView.text = "Я нажал кнопку ${++counter} раз"
        }
        var imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            textView2.text = "Я нажал хомяка ${++counter2} раз"
        }
    }
}