package com.example.pr8

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rButton: Button = findViewById(R.id.red_button)
        val bButton: Button = findViewById(R.id.blue_button)
        val yButton: Button = findViewById(R.id.yellow_button)
        val textView: TextView = findViewById(R.id.textView)

        val rLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val bLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val yLayout: ConstraintLayout = findViewById(R.id.root_layout)

        rButton.setOnClickListener {
            textView.setText(resources.getText(R.string.red))
            rLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        bButton.setOnClickListener{
            textView.setText(resources.getText(R.string.blue))
            bLayout.setBackgroundColor(resources.getColor(R.color.blue, null))
        }
        yButton.setOnClickListener {
            textView.setText(resources.getText(R.string.yellow))
            yLayout.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }


    }
}