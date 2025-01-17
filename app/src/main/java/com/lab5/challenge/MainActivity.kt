package com.lab5.challenge

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.lab5.challenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val correctEmail = "admin@mail.com"
        val correctPassword = "admin"

        binding.btnLogin.setOnClickListener{
            val email = binding.tietEmail.text.toString()
            val password = binding.tietPassword.text.toString()

            if(email == correctEmail && password == correctPassword){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast
                    .makeText(this,
                        "Username or Password is incorrect",
                        Toast.LENGTH_SHORT)
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