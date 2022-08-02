package com.example.ep3dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnLancarDados(v: View){
        v as Button
        var dado = 0
        when (v){
            btnLancarD4 -> dado = 4
            btnLancarD6 -> dado = 6
            btnLancarD10 -> dado = 10
            btnLancarD20 -> dado = 20
        }
        var resultado = Random.nextInt(dado)+1
        txtResultado.text = resultado.toString()
    }

}
