package com.example.ecotrack

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecotrack.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
            finish()
        }
    }
}