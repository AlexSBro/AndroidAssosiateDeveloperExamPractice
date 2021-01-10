package com.example.androidassosiatedeveloperexampractice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        val completionSnackbar = Snackbar.make(activitySnackBarContainer, "Action Complete", Snackbar.LENGTH_LONG)

        val actionSnackbar = Snackbar.make(activitySnackBarContainer, "Action required", Snackbar.LENGTH_INDEFINITE)
        actionSnackbar.setAction("Action", View.OnClickListener { completionSnackbar.show() })
        actionSnackbar.setTextColor(Color.RED)

        actionSnackbar.show()

    }

}