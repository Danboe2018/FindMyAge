package com.webappclouds.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butGetAge.setOnClickListener {
            buttonClick()
        }
    }

    fun buttonClick() {
        val userDOB = Integer.parseInt(etDOB.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYears = currentYear - userDOB
        tvShowAge.text = "Your age is $userAgeInYears years."
    }
}
