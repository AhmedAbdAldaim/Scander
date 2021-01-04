package com.example.mainkotiln.Pages


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.Adapters.orders_Adapter
import com.example.mainkotiln.R

class Order : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<orders_Adapter.ViewHolder>?=null
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        recyclerView = findViewById(R.id.rce) as RecyclerView

        val linearLayoutManage: LinearLayoutManager = GridLayoutManager(this, 1)
        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = linearLayoutManage
        adapter = orders_Adapter()
        recyclerView.adapter = adapter
    }

    fun detailes(view: View?) {
        val intent = Intent(this@Order, detiles_order::class.java)
        startActivity(intent)
    }
}