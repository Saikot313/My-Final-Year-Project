package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Login_Page : AppCompatActivity() {


    lateinit var btn1 : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

       btn1 = findViewById(R.id.button2)



        btn1.setOnClickListener {
            intent = Intent(this,Register_Page_Two::class.java)
            startActivity(intent)
        }



    }
}