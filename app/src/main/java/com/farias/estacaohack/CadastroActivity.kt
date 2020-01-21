package com.farias.estacaohack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val minhaPref = getSharedPreferences("minha_preferencia", Context.MODE_PRIVATE)
        val meuEditor = minhaPref.edit()

        val listaSexo = arrayListOf("Selecionar o sexo", "Feminino", "Masculino")
        val adapterSexo = ArrayAdapter(this@CadastroActivity, android.R.layout.simple_spinner_dropdown_item, listaSexo)
        spnSexoCadastro.adapter = adapterSexo

        btnCadastrado.setOnClickListener{

            val nome = edtNomeCadastro.text.toString().trim()
            val sobrenome = edtSobrenomeCadastro.text.toString().trim()
            val email = edtEmailCadastro.text.toString().trim().toLowerCase()
            val senha = edtSenhaCadastro.text.toString().trim()


            if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                Toast.makeText(this@CadastroActivity, "Preencha todos os campos", Toast.LENGTH_LONG).show()
            }else if(spnSexoCadastro.selectedItem == "Selecionar o sexo"){
                Toast.makeText(this@CadastroActivity, "Informe o seu sexo!", Toast.LENGTH_LONG).show()
            }else{
                meuEditor.putString("nome", nome).apply()
                meuEditor.putString("sobrenome", sobrenome).apply()
                meuEditor.putString("email", email).apply()
                meuEditor.putString("senha", senha).apply()
                meuEditor.putString("sexo", spnSexoCadastro.selectedItem.toString()).apply()

                AlertDialog.Builder(this@CadastroActivity)
                    .setTitle("Sucesso")
                    .setMessage("Usuario cadastrado!!!")
                    .setPositiveButton("OK"){_,_ ->
                        //onBackPressed()
                        startActivity(Intent(this@CadastroActivity, MainActivity::class.java))
                    }
                    .create()
                    .show()
            }
        }
    }
}
