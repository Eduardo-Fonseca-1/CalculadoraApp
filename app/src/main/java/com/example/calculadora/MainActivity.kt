package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val historico = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.editNum1)
        val num2 = findViewById<EditText>(R.id.editNum2)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val btnHistorico = findViewById<Button>(R.id.btnHistorico)

        btnSomar.setOnClickListener {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()

            if (n1 != null && n2 != null) {
                val res = n1 + n2
                resultado.text = "Resultado: $res"
                historico.add("$n1 + $n2 = $res")
            } else {
                resultado.text = "Digite valores válidos"
            }
        }

        btnHistorico.setOnClickListener {
            val intent = Intent(this, HistoricoActivity::class.java)
            intent.putStringArrayListExtra("historico", historico)
            startActivity(intent)
        }
    }
}
