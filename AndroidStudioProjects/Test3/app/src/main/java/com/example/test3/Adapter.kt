package com.example.test3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test3.databinding.FooterBinding

class Adapter (private var itemList: MutableList <Item>) :
        RecyclerView.Adapter<Adapter.ItemViewHolder>(){

     inner class ItemViewHolder (val binding: FooterBinding) :
             RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder (
        FooterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )

    override fun getItemCount() = itemList.size


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    holder.binding.apply {

        val item = itemList[position]
        ivUser.SetImageResource(item.icon)
        etDescription.text = item.text
        btnClick.text = item.btnIcon
    }

    }

    }







        }
