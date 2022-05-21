package com.example.fourgot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ReadSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read_senha)

        val btnVoltar = this.findViewById<ImageButton>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        val btnEditar = this.findViewById<ImageButton>(R.id.btnEditar)

        btnEditar.setOnClickListener {
            val intent = Intent(this, CreateSenha::class.java)

            startActivity(intent)
        }

    }
}