package com.example.mainkotiln

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mainkotiln.R

class select_chipess_type : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_chipess_type)
    }

    fun big_dort(view: View?) {
        val intent = Intent(this@select_chipess_type, chipes_big::class.java)
        startActivity(intent)
    }

    fun smail_dort(view: View?) {
        val intent = Intent(this@select_chipess_type, chipes::class.java)
        startActivity(intent)
    }
}