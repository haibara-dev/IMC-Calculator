package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DECLARAR BOTÕES
        val buttonImc = findViewById<Button>(R.id.button_imc)
        val buttonSobre = findViewById<Button>(R.id.button_sobre)

        // CONFIGURAR BOTÕES PRA DIRECIONAR PRAS TELAS
        buttonImc.setOnClickListener {
            val abrirImc = Intent(this, ImcActivity::class.java)
            startActivity(abrirImc) }

        buttonSobre.setOnClickListener{
            val abrirSobre = Intent(this, sobreActivity::class.java)
            startActivity(abrirSobre) }

    }
}