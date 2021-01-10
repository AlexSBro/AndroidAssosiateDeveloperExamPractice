package com.example.androidassosiatedeveloperexampractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inflates view and sets text
        val inflater = layoutInflater
        val container = findViewById<ViewGroup>(R.id.custom_toast_container)
        val view = inflater.inflate(R.layout.custom_toast, container)
        val textView = view.findViewById<TextView>(R.id.text)
        textView.text = "MY TEXT"

        //Initializes toast positions and shows it
        val toast = Toast(applicationContext)
        toast.view = view
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()

    }
}