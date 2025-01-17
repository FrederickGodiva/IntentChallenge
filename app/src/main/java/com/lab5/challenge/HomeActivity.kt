package com.lab5.challenge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.lab5.challenge.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnScrollImage.setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }

        binding.btnOpenYoutube.setOnClickListener {
            val uri = "https://youtu.be/kPa7bsKwL-c?si=EmgywAOzYA4YDHQo"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            startActivity(intent)
        }

        binding.btnCall911.setOnClickListener {
            val uri = "tel:082161992138"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(uri))
            startActivity(intent)
        }

        binding.btnCalculate.setOnClickListener {
            val numberString = binding.tietNumber.text.toString()

            if(numberString.isNotEmpty()) {
                val number = numberString.toInt()
                val intent = Intent(this, CounterActivity::class.java)
                intent.putExtra("number", number)
                startActivity(intent)
            } else {
                Toast
                    .makeText(this, "Please enter a number", Toast.LENGTH_SHORT)
                    .show()
            }
        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}