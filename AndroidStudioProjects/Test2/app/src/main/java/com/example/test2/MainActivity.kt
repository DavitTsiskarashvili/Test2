package com.example.test2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)


        data class Anagram(var anagram: String)

        var list = mutableListOf<Any>()
        var anagramList1 = mutableListOf<Any>()


        var anagram = binding.etEnterAnagram.text.toString()

        var num = 0
        binding.btnSave.setOnClickListener {
            list.add(anagram)
        }

        binding.btnOutput.setOnClickListener {
            for (item in list) {
                if (anagram.toCharArray().sort() == anagram.toCharArray().sort() &&
                    anagram.length == anagram.length
                ) { anagramList1.add(item)
                    num++
                    binding.tvCountNumber.text = num.toString()}
                }
            }
        }
    }
