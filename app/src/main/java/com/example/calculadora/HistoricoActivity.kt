package com.example.calculadora

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HistoricoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)

        val lista = findViewById<ListView>(R.id.listHistorico)
        val historico = intent.getStringArrayListExtra("historico")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, historico ?: listOf())
        lista.adapter = adapter
    }
}
