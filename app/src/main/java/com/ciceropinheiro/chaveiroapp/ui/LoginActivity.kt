package com.ciceropinheiro.chaveiroapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ciceropinheiro.chaveiroapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(10000)

        setTheme(R.style.Theme_ChaveiroApp)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()


    }
}