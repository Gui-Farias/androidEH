package com.farias.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        //habilitando o js no webview
        wbvCellep.settings.javaScriptEnabled = true
        wbvCellep.loadUrl("http://br.cellep.com/")
    }
}
