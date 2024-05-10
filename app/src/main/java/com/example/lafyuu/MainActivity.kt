package com.example.lafyuu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_register = findViewById<TextView>(R.id.register)
        btn_register.setOnClickListener(this)

        val btn_signin = findViewById<Button>(R.id.signin_btn)
        btn_signin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val register = findViewById<TextView>(R.id.register)
        register.setOnClickListener(){
            toRegisterPage()
        }

        val signin = findViewById<Button>(R.id.signin_btn)
        signin.setOnClickListener(){
            toHomePage()
        }
    }

    private fun toHomePage(){
        Intent(this, HomePage::class.java).also {
            startActivity(it)
            finish()
        }
    }
    private fun toRegisterPage(){
        Intent(this, RegisterPage::class.java).also {
            startActivity(it)
            finish()
        }
    }


}