package com.rco.truckstracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class
MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton
                = findViewById<Button>(R.id.showInput)
        val editText
                = findViewById<EditText>(R.id.editText)
        val textView
                = findViewById<TextView>(R.id.txtVw)

    }

    //utbah first commit changes


}