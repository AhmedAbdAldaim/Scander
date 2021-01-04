
package com.example.mainkotiln.Adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mainkotiln.R

class details_Adapter : RecyclerView.Adapter<details_Adapter.ViewHolder>(){

     private val image_product = intArrayOf(
         R.drawable.doretouos,
         R.drawable.swiet,
         R.drawable.gift
     )
     private val name_product = arrayOf(
         "دوريتويس"," تويكس ", "ساعة ذهبية"
     )
    private val qantity_product = arrayOf(
        "2"," 5 ", "9"
    )
     private val price = arrayOf(
         "400 ج.س ", "200 ج.س ", "350 ج.س"
     )

     inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       var image: ImageView
        var product : TextView
         var price : TextView
         var count: TextView
         init {
             image = itemView.findViewById(R.id.product_image)
             product = itemView.findViewById(R.id.product)
             price = itemView.findViewById(R.id.price)
             count = itemView.findViewById(R.id.count)
         }


     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

      val v = LayoutInflater.from(parent.context).inflate(R.layout.custom_details,parent,false)
         return ViewHolder(v)
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         holder.product.text=name_product[position]
         holder.price.text=price[position]
         holder.count.text=qantity_product[position]
         holder.image.setImageResource(image_product[position])

     }

     override fun getItemCount(): Int {
         return image_product.size
     }
}