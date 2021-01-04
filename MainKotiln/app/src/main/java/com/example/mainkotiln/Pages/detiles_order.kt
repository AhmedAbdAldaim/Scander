package com.example.mainkotiln.Pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.Adapters.details_Adapter
import com.example.mainkotiln.Adapters.orders_Adapter
import com.example.mainkotiln.R

class detiles_order : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<details_Adapter.ViewHolder>?=null
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detiles_order)
        recyclerView = findViewById(R.id.rce) as RecyclerView
        val linearLayoutManage: LinearLayoutManager = GridLayoutManager(this, 1)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManage
        adapter = details_Adapter()
        recyclerView.adapter = adapter
    }
}