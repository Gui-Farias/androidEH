package com.farias.estacaohack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minhaPrefe = getSharedPreferences("minha_preferencia", Context.MODE_PRIVATE)
        val nome = minhaPrefe.getString("nome", "Error preference nome")
        val sobrenome = minhaPrefe.getString("sobrenome", "Error preference sobrenome")
        val email = minhaPrefe.getString("email", "Error preference email")
        val sexo = minhaPrefe.getString("sexo", "Error preference sexo")

        txvNome.text = "$nome $sobrenome"
        txvEmail.text = email
        txvSexo.text = sexo

        if (sexo == "Feminino"){
            txvBoasVindas.text = "Seja bem vinda!"
        }else {
            txvBoasVindas.text = "Seja bem vindo!"
        }

        btnSair.setOnClickListener{
            startActivity((Intent(this@MainActivity, LoginActivity::class.java)))
            finishAffinity()
        }

        btnSiteCellep.setOnClickListener{
            startActivity(Intent(this@MainActivity, WebActivity::class.java))
        }
    }
}
