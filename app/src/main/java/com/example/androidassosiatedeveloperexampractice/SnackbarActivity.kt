package com.example.androidassosiatedeveloperexampractice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snackbar.*

class SnackbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        val completionSnackbar = Snackbar.make(activitySnackBarContainer, R.string.action_complete, Snackbar.LENGTH_LONG)

        val actionSnackbar = Snackbar.make(activitySnackBarContainer,  R.string.action_required, Snackbar.LENGTH_INDEFINITE)
        actionSnackbar.setAction(R.string.action, View.OnClickListener { completionSnackbar.show() })
        actionSnackbar.setTextColor(Color.RED)

        actionSnackbar.show()

    }

}