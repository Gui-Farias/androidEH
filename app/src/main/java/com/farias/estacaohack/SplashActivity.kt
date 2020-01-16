package com.farias.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Setando um tempo na tela de splash para tela de login

        Handler().postDelayed({
            //Abrindo tela de login
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            //Finalizando a splash
            finish()
        },2500)


    }
}
