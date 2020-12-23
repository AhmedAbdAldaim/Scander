package com.example.mainkotiln

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mainkotiln.R

class fragmentFav : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fargment_fav, container, false)
    }
    companion object{
        fun newInstance() : fragmentFav{
            return fragmentFav()
        }
    }
}