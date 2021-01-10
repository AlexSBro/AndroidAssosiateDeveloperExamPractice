package com.example.androidassosiatedeveloperexampractice

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toast.*

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        buttonToast.setOnClickListener(View.OnClickListener {
            val text = "Toast"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        })


        buttonTopToast.setOnClickListener(View.OnClickListener {
            val toast = Toast.makeText(applicationContext, "Top Toast", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 40)
            toast.show()
        })

        buttonCustomToast.setOnClickListener(View.OnClickListener {

            //This inflates our new view and its view group
            val inflater = layoutInflater
            val container = findViewById<ViewGroup>(R.id.custom_toast_container)
            val layout: View = inflater.inflate(R.layout.custom_toast, container)
            //This finds and sets the text view
            val textView: TextView = layout.findViewById(R.id.text)
            textView.text = "This is a custom toast"

            //This initializes the toast and passes it the layout with the preset text view.
            with (Toast(applicationContext)) {
                setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                duration = Toast.LENGTH_LONG
                view = layout
                show()
            }
        })

    }
}