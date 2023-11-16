package com.example.myapplication


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    lateinit var txv1 : TextView
    lateinit var txv2 : TextView
    var Splash_top: Animation? = null
    var Splash_bottom: Animation? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        txv1 = findViewById(R.id.tv1)
        txv2 = findViewById(R.id.tv2)

        var h = Handler()
        h.postDelayed(object : Runnable{
            override fun run() {

                var intent = Intent(this@MainActivity,Login_Page::class.java)
                startActivity(intent)
            }
        },2000)

        Splash_top = AnimationUtils.loadAnimation(this, R.anim.splash_top)
        Splash_bottom = AnimationUtils.loadAnimation(this, R.anim.splash_bottom)

        txv1.setAnimation(Splash_top)
        txv2.setAnimation(Splash_bottom)
    }
}