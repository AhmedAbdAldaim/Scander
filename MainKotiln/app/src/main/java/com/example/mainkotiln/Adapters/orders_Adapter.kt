
package com.example.mainkotiln.Adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.R

class orders_Adapter : RecyclerView.Adapter<orders_Adapter.ViewHolder>(){
    var Countr = 0

     private val order_status = arrayOf(
         "تم الاستلام", "في الطريق اليك" , "جاري التحضير" , "في الطريق اليك"
     )
     private val Date = arrayOf(
         "22 ديسمبر 2020", "2 مارس 2020 ", "16 ابريل 2020", "6 يونيو 2020"
     )

     inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var status : TextView
         var date : TextView

         init {

             status = itemView.findViewById(R.id.order_status)
             date = itemView.findViewById(R.id.Date)

         }


     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

      val v = LayoutInflater.from(parent.context).inflate(R.layout.custom_order,parent,false)
         return ViewHolder(v)
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         holder.status.text=order_status[position]
         holder.date.text=Date[position]


     }

     override fun getItemCount(): Int {
         return order_status.size
     }
}