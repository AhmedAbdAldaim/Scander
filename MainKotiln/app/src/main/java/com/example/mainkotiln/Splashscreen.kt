package com.example.mainkotiln

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainkotiln.R

class Splashscreen : AppCompatActivity() {
    var imageView: ImageView? = null
    var animation: Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        imageView = findViewById<View>(R.id.img) as ImageView
        val animation = AnimationUtils.loadAnimation(this, R.anim.anim_splashscreen)
        imageView!!.animation = animation
        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    val intent = Intent(this@Splashscreen, Login::class.java)
                    startActivity(intent)
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                super.run()
            }
        }
        thread.start()
    }
}