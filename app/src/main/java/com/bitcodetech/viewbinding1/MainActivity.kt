package com.bitcodetech.viewbinding1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bitcodetech.viewbinding1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        binding.btnSetInfo.setOnClickListener {
            binding.txtInfo.text = "${binding.edtCompany.text.toString()}: ${binding.edtInfo.text.toString()}"
        }
    }
}