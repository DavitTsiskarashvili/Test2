package com.example.homework9

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework9.databinding.CategoryBinding

class CategoryAdapter(private var categoryList: MutableList<Categories>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private lateinit var binding: CategoryBinding


    inner class CategoryViewHolder(private val binding: CategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(
        CategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        binding.apply {
            btnAll.text = categoryList[position].text
            btnAll.text = categoryList[position].color

        }
    }
}


