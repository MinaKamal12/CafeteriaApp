package com.eva.cafeteriaapp.Adapter

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eva.cafeteriaapp.R

class ItemCheckOutAdapter (


    private val itemList: List<ClipData.Item>): RecyclerView.Adapter<ItemCheckOutAdapter.ItemAdapterHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapterHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)

            return ItemAdapterHolder(itemView)
        }

        override fun onBindViewHolder(holder: ItemAdapterHolder, position: Int) {

//            val currentItem = itemList[position]
//            holder.FoodImage.setImageResource(currentItem.imageResoure)
//            holder.MealName.text=currentItem.name
//            holder.MealsNumber.text=currentItem.Description
//            holder.ItemPrice.text=currentItem.price



        }

        override fun getItemCount(): Int {
            TODO("Not yet implemented")
        }



        class ItemAdapterHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val FoodImage: ImageView = itemView.findViewById(R.id.item_image)
            val MealName: TextView = itemView.findViewById(R.id.item_meal_name)

            val MealsNumber: TextView = itemView.findViewById(R.id.MealsNumber)
            val ItemPrice: TextView = itemView.findViewById(R.id.item_price)

        }




    }


