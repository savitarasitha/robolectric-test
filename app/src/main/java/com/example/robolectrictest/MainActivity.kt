package com.example.robolectrictest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView:TextView
    private lateinit var editText:EditText
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tv_hello_world)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.btn_change_text)

        button.setOnClickListener {
            textView.setText(editText.text)
        }
    }
}