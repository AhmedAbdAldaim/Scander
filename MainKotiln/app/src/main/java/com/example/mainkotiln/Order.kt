package com.example.mainkotiln


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mainkotiln.R

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
    }

    fun detailes(view: View?) {
        val intent = Intent(this@Order, detiles_order::class.java)
        startActivity(intent)
    }
}