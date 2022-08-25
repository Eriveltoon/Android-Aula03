package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editNome: EditText = findViewById(R.id.editNome)
        val editSobrenome: EditText = findViewById(R.id.editSobrenome)
        val textResultado: TextView = findViewById(R.id.editSobrenome)
        val buttonExibir: Button = findViewById(R.id.buttonExibir)

        buttonExibir.setOnClickListener {

        }
    }
}