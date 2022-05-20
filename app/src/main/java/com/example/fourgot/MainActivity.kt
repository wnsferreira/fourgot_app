package com.example.fourgot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCard1 = this.findViewById<ImageButton>(R.id.btnCard1)

        btnCard1.setOnClickListener {
            val intent = Intent(this, ReadSenha::class.java)

            startActivity(intent)
        }

        val addSenha = this.findViewById<ImageButton>(R.id.addSenha)

        addSenha.setOnClickListener {
            val intent = Intent(this, CreateSenha::class.java)

            startActivity(intent)
        }
    }
}