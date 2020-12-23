package com.example.mainkotiln

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainkotiln.R

class Carts : AppCompatActivity() {
    var i = 0
    var conut1: TextView? = null
    var count2: TextView? = null
    var count3: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carts)
        conut1 = findViewById<View>(R.id.count1) as TextView
    }

    operator fun plus(view: View?) {
        i++
        conut1!!.text = i.toString() + ""
    }

    fun mins(view: View?) {
        if (i == 0) {
            i = 0
        } else {
            i--
            conut1!!.text = i.toString() + ""
        }
    }

    fun detailes(view: View?) {}
}