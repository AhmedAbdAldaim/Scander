package com.example.mainkotiln

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNREACHABLE_CODE")
class fragmentHome : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<Mainadapteview.ViewHolder>?=null

  lateinit var rce: RecyclerView
    lateinit var  carts: ImageView
    lateinit var card_chipess :CardView

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fargment_home, container, false)

        rce = view.findViewById(R.id.rce) as RecyclerView
        carts = view.findViewById(R.id.carts) as ImageView
        card_chipess = view.findViewById(R.id.card_chipess) as CardView

        val linearLayoutManage: LinearLayoutManager = GridLayoutManager(activity, 2)
        layoutManager = LinearLayoutManager(activity)
        rce.layoutManager = linearLayoutManage
        adapter = Mainadapteview()
        rce.adapter = adapter

        carts.setOnClickListener {
            val intent = Intent(activity, Carts::class.java)
            startActivity(intent)
        }
        card_chipess.setOnClickListener {
            val intent = Intent(activity, select_chipess_type::class.java)
            startActivity(intent)
        }

        return view

    }



    companion object{
        fun newInstance() : fragmentHome{
            return fragmentHome()
        }
    }
}