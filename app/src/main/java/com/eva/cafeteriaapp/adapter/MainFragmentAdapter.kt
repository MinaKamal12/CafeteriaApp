package com.example.task_3

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemBinding
import java.util.*

class Adapter(private var listItem: ArrayList<Note>): RecyclerView.Adapter<Adapter.Holder>() {

    private lateinit var binding: ItemBinding


    class Holder(val binding: ItemBinding): RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: Holder, index: Int) {
        val item = listItem[index]
        holder.binding.apply {
            itemMealName.text = item.Title
            itemMealDescription.text = item.Description


            itemDelete.setOnClickListener {
                listItem.removeAt(index)
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int = listItem.size


}