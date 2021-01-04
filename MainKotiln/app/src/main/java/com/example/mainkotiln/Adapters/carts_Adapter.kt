
package com.example.mainkotiln.Adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.R

class carts_Adapter : RecyclerView.Adapter<carts_Adapter.ViewHolder>(){
    var Countr = 0
     private val image_product = intArrayOf(
         R.drawable.doretouos,
         R.drawable.dotr,
         R.drawable.gift,
         R.drawable.big_dort,
         R.drawable.doretouos,
         R.drawable.doretouos
     )
     private val name_product = arrayOf(
         "دوريتويس"," ليون ", "ساعة ذهبية", "دوريتويس كبير", "دوريتويس", "دوريتويس"
     )
     private val price = arrayOf(
         "150 ج.س ", "130 ج.س ", "350 ج.س", "1600 ج.س","150 ج.س", "150 ج.س"
     )

     inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       var image: ImageView
         var plus: ImageView
         var minus :ImageView
        var product : TextView
         var price : TextView
         var count: TextView
         init {
             image = itemView.findViewById(R.id.product_image)
             plus = itemView.findViewById(R.id.plus)
             minus = itemView.findViewById(R.id.minus)
             product = itemView.findViewById(R.id.product)
             price = itemView.findViewById(R.id.price)
             count = itemView.findViewById(R.id.count)
         }


     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

      val v = LayoutInflater.from(parent.context).inflate(R.layout.custom_carts,parent,false)
         return ViewHolder(v)
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         holder.product.text=name_product[position]
         holder.price.text=price[position]
         holder.image.setImageResource(image_product[position])
         holder.plus.setOnClickListener{View ->
             Countr ++
             holder.count.text= ""+Countr
         }
         holder.minus.setOnClickListener{View ->
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