package com.example.laboratorio4.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.laboratorio4.R

class SecondActivity : AppCompatActivity() {

    private lateinit var nameview: TextView
    private lateinit var mailview: TextView
    private lateinit var phoneview: TextView
    private lateinit var shareBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nameview= findViewById(R.id.vista_name)
        mailview = findViewById(R.id.vista_mail)
        phoneview = findViewById(R.id.vista_phone)
        shareBTN = findViewById(R.id.shareBtn)

        val name = intent.getStringExtra("name").toString()
        val mail = intent.getStringExtra("mail").toString()
        val phone = intent.getStringExtra("phone").toString()

        nameview.text = "\bNombre: ${name}"
        mailview.text = "\bCorreo: ${mail}"
        phoneview.text = "\bTelefono: ${phone}"

        shareBTN.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, name + mail + phone)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }


    }
}