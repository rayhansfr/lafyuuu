package com.example.lafyuu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterPage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_signinPage = findViewById<TextView>(R.id.signinpage_btn)
        btn_signinPage.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val register = findViewById<TextView>(R.id.signinpage_btn)
        register.setOnClickListener(){
            toSignInPage()
        }
    }

    private fun toSignInPage(){
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

}