package com.example.tahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SonucActivity : AppCompatActivity() {

    private lateinit var buttonTekrarOyna: Button
    private lateinit var resim_mutlu: ImageView
    private lateinit var textViewSonuc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)


        buttonTekrarOyna = findViewById(R.id.buttonTekrarOyna)
        resim_mutlu = findViewById(R.id.resim_mutlu)
        textViewSonuc = findViewById(R.id.textViewSonuc)

        val sonuc = intent.getBooleanExtra("sonuc", true)

        if (!sonuc) {
            resim_mutlu.setImageResource(R.drawable.resim_uzgun)
            textViewSonuc.text = "Kaybettiniz"
        }

        buttonTekrarOyna.setOnClickListener {
            val intent = Intent(this, TahminActivity::class.java)
            startActivity(intent)
            finish()
        }




    }
}