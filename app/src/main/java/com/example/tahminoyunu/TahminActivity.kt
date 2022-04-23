package com.example.tahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TahminActivity : AppCompatActivity() {

    private lateinit var textViewKalanHak: TextView
    private lateinit var editTextTahminGir: EditText
    private lateinit var buttonTahminEt: Button
    private lateinit var textViewYardim: TextView

    private var kalanHak = 5
    private var sayi: Int = 0
    private var tahmin: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)


        textViewKalanHak = findViewById(R.id.textViewKalanHak)
        editTextTahminGir = findViewById(R.id.editTextTahminGir)
        buttonTahminEt = findViewById(R.id.buttonTahminEt)
        textViewYardim = findViewById(R.id.textViewYardim)

        sayi = (0..100).random()
        Log.e("Random Sayi: " , sayi.toString())






        buttonTahminEt.setOnClickListener {
            kalanHak -=1
            textViewKalanHak.text = "Kalan Hak: " + kalanHak.toString()
            val intent = Intent(this, SonucActivity::class.java)

            tahmin = editTextTahminGir.text.toString().toInt()

            if (tahmin == sayi) {
                intent.putExtra("sonuc", true)
                startActivity(intent)
                finish()
                return@setOnClickListener
            }
            if (kalanHak == 0) {
                intent.putExtra("sonuc", false)
                startActivity(intent)
                finish()
                return@setOnClickListener
            }
            if (tahmin < sayi) {
                textViewYardim.text = "Artir"
                editTextTahminGir.setText("")
            }
            if (tahmin > sayi) {
                textViewYardim.text = "Azalt"
                editTextTahminGir.setText("")
            }
        }



    }
}