package com.example.homework9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework9.databinding.ActivityMainBinding
import com.example.homework9.databinding.CategoryBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingCategories: CategoryBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var productAdapter: ProductAdapter


    private val categoryList = mutableListOf<Categories>()
    private val productList = mutableListOf<Products>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        bindingCategories = CategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initCategoryRecyclerView()
        initProductRecyclerView()


        bindingCategories.btnAll.setOnClickListener()

        bindingCategories.btnParty.setOnClickListener()

        bindingCategories.btnBeach.setOnClickListener()

        bindingCategories.btnCategory1.setOnClickListener()

        bindingCategories.btnbtnCategory2.setOnClickListener()

        bindingCategories.btnCategory3.setOnClickListener()
    }

    private fun initCategoryRecyclerView() {
        setDataCategoryList()
        categoryAdapter = CategoryAdapter(categoryList)
        binding.rvCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true)
        binding.rvCategory.adapter = categoryAdapter
    }

    private fun initProductRecyclerView() {
        setDataProductList()
        productAdapter = ProductAdapter(productList)
        binding.rvProducts.layoutManager = GridLayoutManager(this, 2)
        binding.rvProducts.adapter = productAdapter
    }


    private fun setDataCategoryList() {
        categoryList.add(
            Categories(
                id = getString(R.string.btnId_all),
                text = getString(R.string.btnText_all),
                color = getColor(R.color.green)
            )
        )

        categoryList.add(
            Categories(
                id = getString(R.string.btnId_party),
                text = getString(R.string.btnText_party),
                color = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Categories(
                id = getString(R.string.btnId_beach),
                text = getString(R.string.btnText_beach),
                color = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Categories(
                id = getString(R.string.btnId_category1),
                text = getString(R.string.btnText_category1),
                color = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Categories(
                id = getString(R.string.btnId_category2),
                text = getString(R.string.btnText_category2),
                color = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Categories(
                id = getString(R.string.btnId_category3),
                text = getString(R.string.btnText_category3),
                color = getColor(R.color.grey)
            )
        )

    }

    private fun setDataProductList() {
        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_party),
                image = R.drawable.product1,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_party),
                image = R.drawable.product2,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_beach),
                image = R.drawable.product3,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_beach),
                image = R.drawable.product4,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_camping),
                image = R.drawable.product1,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_camping),
                image = R.drawable.product2,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_1),
                image = R.drawable.product3,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_2),
                image = R.drawable.product4,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Products(
                allCategory = getString(R.string.category_all),
                categoryType = getString(R.string.category_3),
                image = R.drawable.product1,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

    }




}

