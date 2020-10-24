package com.wcc.lancedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val botaoJogar = findViewById<Button>(R.id.bt_jogar)
        botaoJogar.setOnClickListener {
            var nomeJogador = findViewById<EditText>(R.id.et_nome).text.toString()
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nomeJogador", nomeJogador)

            startActivity(intent)
        }
    }

}