package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ImcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val pesoUsuario = findViewById<EditText>(R.id.edit_text_peso)
        val alturaUsuario = findViewById<EditText>(R.id.edit_text_altura)

        buttonCalcular.setOnClickListener{
            val peso = pesoUsuario.text.toString().toFloat()
            val altura = alturaUsuario.text.toString().toFloat()

            var resultado = (peso / (altura * altura))
            var resultadoImc = findViewById<TextView>(R.id.resultado_imc)

            resultadoImc.text = resultado.toString()
        }

    }

}