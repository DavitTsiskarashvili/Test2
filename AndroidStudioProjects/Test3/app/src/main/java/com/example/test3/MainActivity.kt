package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    private val itemList = mutableListOf<Item>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initItemRecyclerView()
    }


    private fun initItemRecyclerView() {
        setDataItemList()
        adapter = Adapter(itemList)
        binding.rvFooter.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }


    private fun setDataItemList(){
        itemList.add(
            Item(
                icon = getString(R.mipmap.),
                text = getString(R.string.edit_profile),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.),
                text = getString(R.string.Address),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.ic_notification),
                text = getString(R.string.Notification),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.ic_payment),
                text = getString(R.string.Security),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.),
                text = getString(R.string.Language),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.ic_darkmode),
                text = getString(R.string.Dark_Mode),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.ic_privacypolicy_round),
                text = getString(R.string.Privacy_Policy),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.ic_helpcenter)
                text = getString(R.string.Help_Center),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.),
                text = getString(R.string.Invite_Friends),
                btnIcon =
            )
        )

        itemList.add(
            Item(
                icon = getString(R.mipmap.),
                text = getString(R.string.Logout),
                btnIcon =
            )
        )

    }






}