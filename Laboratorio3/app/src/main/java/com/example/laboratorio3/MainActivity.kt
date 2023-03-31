package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var imagefive: ImageView
    private lateinit var imagetencents: ImageView
    private lateinit var imagequartercents: ImageView
    private lateinit var imagedollar: ImageView
    private lateinit var cantidad_total: TextView

    private val five = 0.05
    private val ten = 0.10
    private val quarter = 0.25
    private val dollar = 1.00
    private var contador = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        clickListenersFunction()
    }

    private fun bind(){
        imagefive = findViewById(R.id.five_cents)
        imagetencents = findViewById(R.id.ten_cents)
        imagequartercents = findViewById(R.id.quarter_cents)
        imagedollar = findViewById(R.id.dollar)

        cantidad_total = findViewById(R.id.contador_money)
    }

    private fun clickListenersFunction(){

        imagefive.setOnClickListener {

            contador += five
            contador = String.format("%.2f", contador).toDouble()
            cantidad_total.text = "$${contador}"
        }

        imagetencents.setOnClickListener {
            contador += ten
            contador = String.format("%.2f", contador ).toDouble()
            cantidad_total.text = "$${contador}"
        }

        imagequartercents.setOnClickListener {
            contador += quarter
            contador = String.format("%.2f", contador).toDouble()
            cantidad_total.text = "$${contador}"
        }

        imagedollar.setOnClickListener {
            contador += dollar
            contador = String.format("%.2f", contador ).toDouble()
            cantidad_total.text = "$${contador}"
        }


    }
}