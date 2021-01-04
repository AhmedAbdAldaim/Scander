package com.example.mainkotiln.Fragments

import android.annotation.SuppressLint
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
import com.example.mainkotiln.Adapters.Sale_offers_Adapter
import com.example.mainkotiln.Pages.Carts
import com.example.mainkotiln.Pages.select_chipess_type
import com.example.mainkotiln.R

@Suppress("UNREACHABLE_CODE")
class fragmentHome : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<Sale_offers_Adapter.ViewHolder>?=null

  lateinit var recyclerView: RecyclerView
    lateinit var  carts: ImageView
    lateinit var card_chipess :CardView

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fargment_home, container, false)

        recyclerView = view.findViewById(R.id.rce) as RecyclerView
        carts = view.findViewById(R.id.carts) as ImageView
        card_chipess = view.findViewById(R.id.card_chipess) as CardView

        val linearLayoutManage: LinearLayoutManager = GridLayoutManager(activity, 2)
        layoutManager = LinearLayoutManager(activity)

        recyclerView.layoutManager = linearLayoutManage
        adapter = Sale_offers_Adapter()
        recyclerView.adapter = adapter

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
        fun newInstance() : fragmentHome {
            return fragmentHome()
        }
    }
}