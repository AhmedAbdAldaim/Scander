package com.example.mainkotiln

import android.content.Context
import com.example.mainkotiln.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mainkotiln.Order
import java.util.*


class fragmentUser : Fragment() {
    lateinit var mContext: Context

    lateinit var List_More: ListView
    var items = arrayOf(
       "طلباتي","تعديل الصفحة الشخصية","من نحن","مشاركة التطبيق","تسجيل خروج"

    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)
        mContext = context!!
        List_More = view.findViewById(R.id.list)
        val Adapter = ArrayAdapter(mContext, android.R.layout.simple_list_item_1, items)
        List_More.adapter = Adapter
        List_More.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, position, _ ->
                if (position == 0) {
                    startActivity(Intent(mContext, Order::class.java))
                }
                if (position == 1) {
                    Toast.makeText(view.context, "تعديل البيانات الشخصية", Toast.LENGTH_LONG).show()
                }
                if (position == 2) {
                    Toast.makeText(view.context, "من نحن", Toast.LENGTH_LONG).show()
                }
                if (position == 3) {
                    Toast.makeText(view.context, "مشاركة التطبيق", Toast.LENGTH_LONG).show()
                }
                if (position == 4) {
                    Toast.makeText(view.context, "تسجيل خروج", Toast.LENGTH_LONG).show()
                }

            }
        return view
    }
    companion object{
        fun newInstance() : fragmentUser{
            return fragmentUser()
        }
    }

}


