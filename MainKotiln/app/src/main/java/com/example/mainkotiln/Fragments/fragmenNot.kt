package com.example.mainkotiln.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mainkotiln.R

class fragmenNot : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fargment_not, container, false)
    }
    companion object{
        fun newInstance() : fragmenNot {
            return fragmenNot()
        }
    }
}