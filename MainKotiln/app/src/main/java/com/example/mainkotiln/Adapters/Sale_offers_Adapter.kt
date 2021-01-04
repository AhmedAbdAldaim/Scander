
package com.example.mainkotiln.Adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.R

class Sale_offers_Adapter : RecyclerView.Adapter<Sale_offers_Adapter.ViewHolder>(){
    var Countr = 0
     private val image_product = intArrayOf(
         R.drawable.doretouos,
         R.drawable.swiet,
         R.drawable.gift,
         R.drawable.big_dort,
         R.drawable.dotr
     )
     private val name_product = arrayOf(
         " دويتويس ", "حلويات", "هدايا", "دوريتويس كبير", "ليون"
     )
     private val price = arrayOf(
         "1250 ج.س ", "1030 ج.س ", "440 ج.س", "300 ج.س", "100 ج.س"
     )
     private val list_price = arrayOf(
         "3200 ج.س ", "150 ج.س ", "445 ج.س", "330 ج.س", "120 ج.س"
     )

     inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       var image: ImageView
         var plus: ImageView
         var mins :ImageView
        var product : TextView
         var price : TextView
         var list_price : TextView
         var count: TextView
         init {
             image = itemView.findViewById(R.id.img)
             plus = itemView.findViewById(R.id.plius)
             mins = itemView.findViewById(R.id.mins)
             product = itemView.findViewById(R.id.txt)
             price = itemView.findViewById(R.id.price)
             list_price = itemView.findViewById(R.id.list_price)
             count = itemView.findViewById(R.id.count)
         }


     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

      val v = LayoutInflater.from(parent.context).inflate(R.layout.custom_sale_offers,parent,false)
         return ViewHolder(v)
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         holder.product.text=name_product[position]
         holder.price.text=price[position]
         holder.list_price.text=  list_price[position]

         holder.image.setImageResource(image_product[position])
         holder.plus.setOnClickListener{View ->
             Countr ++
             holder.count.text= ""+Countr
         }
         holder.mins.setOnClickListener{View ->
             if (Countr <= 0)
                 Countr = 0
             else
                 Countr --
             holder.count.text= ""+Countr
         }
     }

     override fun getItemCount(): Int {
         return image_product.size
     }
}