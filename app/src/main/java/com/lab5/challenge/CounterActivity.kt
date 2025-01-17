package com.lab5.challenge

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.lab5.challenge.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCounterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var number = intent?.getIntExtra("number", 0)
        binding.tietNumber.setText(number.toString())

        binding.btnIncrement.setOnClickListener {
            val currentNumber = binding.tietNumber.text.toString().toIntOrNull() ?: 0
            binding.tietNumber.setText((currentNumber + 1).toString())
        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}