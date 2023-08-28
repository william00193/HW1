package com.example.hw1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    private lateinit var trueButton: Button
    private lateinit var falseButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)


        trueButton.setOnClickListener {

            Toast.makeText(
                this,
                R.string.true_button,
                Toast.LENGTH_SHORT
            )
                .show()
        }

        falseButton.setOnClickListener {

            Toast.makeText(
                this,
                R.string.false_button,
                Toast.LENGTH_SHORT
            )
                .show()
        }


    }
}