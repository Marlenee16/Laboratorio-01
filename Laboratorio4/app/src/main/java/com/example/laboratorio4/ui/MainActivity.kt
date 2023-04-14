package com.example.laboratorio4.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.example.laboratorio4.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: TextInputEditText
    private lateinit var mailEditText: TextInputEditText
    private lateinit var phoneEditText: TextInputEditText
    private lateinit var save: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_field)
        mailEditText = findViewById(R.id.mail_field)
        phoneEditText = findViewById(R.id.phone_field)
        save = findViewById(R.id.Save)

        save.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("mail", mailEditText.text.toString())
            intent.putExtra("phone", phoneEditText.text.toString())
            startActivity(intent)
        }
    }
}