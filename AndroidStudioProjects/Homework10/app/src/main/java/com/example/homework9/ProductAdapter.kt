package com.example.homework9

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework9.databinding.ProductBinding

class ProductAdapter(private var productList: MutableList<Products>) :
    RecyclerView.Adapter<ProductAdapter.CategoryViewHolder>() {

    private lateinit var binding: ProductBinding


    inner class CategoryViewHolder(private val binding: ProductBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(
        ProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = productList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        binding.apply {
            ivImage.setImageResource(productList.image)
            tvDescription.text = productList[position].description
            tvPrice.text = productList[position].price
        }
    }
}


