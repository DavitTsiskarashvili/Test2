package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.homework7.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            val check = binding.cbCheckBox.isChecked
            val inflater = LayoutInflater.from(this)

            if (check) {
                val addNumeric = inflater.inflate(R.layout.edittext_number, binding.root, false)
                binding.mainLayout.addView(addNumeric)
            } else {
                val addText = inflater.inflate(R.layout.edittext_text, binding.root, false)
                binding.mainLayout.addView(addText)
            }
        }
    }
}

