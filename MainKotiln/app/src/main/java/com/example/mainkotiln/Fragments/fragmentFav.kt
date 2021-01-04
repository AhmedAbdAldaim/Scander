package com.example.mainkotiln.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.Adapters.favorite_Adapter
import com.example.mainkotiln.R

class fragmentFav : Fragment() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<favorite_Adapter.ViewHolder>?=null
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fargment_fav, container, false)

        recyclerView = view.findViewById(R.id.rce) as RecyclerView

        val linearLayoutManage: LinearLayoutManager = GridLayoutManager(activity, 2)
        layoutManager = LinearLayoutManager(activity)

        recyclerView.layoutManager = linearLayoutManage
        adapter = favorite_Adapter()
        recyclerView.adapter = adapter
        return view
    }
    companion object{
        fun newInstance() : fragmentFav {
            return fragmentFav()
        }
    }
}
