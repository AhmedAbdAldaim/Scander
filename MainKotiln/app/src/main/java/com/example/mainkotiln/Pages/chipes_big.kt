package com.example.mainkotiln.Pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.Adapters.chipes_big_Adapter
import com.example.mainkotiln.Adapters.favorite_Adapter
import com.example.mainkotiln.R

class chipes_big : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<chipes_big_Adapter.ViewHolder>?=null
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chipes_big)
        recyclerView = findViewById(R.id.rce) as RecyclerView

        val linearLayoutManage: LinearLayoutManager = GridLayoutManager(this, 2)
        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = linearLayoutManage
        adapter = chipes_big_Adapter()
        recyclerView.adapter = adapter
    }
}