package com.farias.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnCadastrado.setOnClickListener{

            val nome = edtNomeCadastro.text.toString().trim()
            val sobrenome = edtSobrenomeCadastro.text.toString().trim()
            val email = edtEmailCadastrp.text.toString().trim()
            val senha = edtSenhaCadastro.text.toString().trim()

            if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || senha.isEmpty()){

            }
        }

    }
}
