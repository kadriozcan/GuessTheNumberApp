package com.example.tahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonBasla: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonBasla = findViewById(R.id.buttonBasla)


        buttonBasla.setOnClickListener {
            val intent = Intent(this, TahminActivity::class.java)
            startActivity(intent)
        }

    }
}