package com.example.ecotrack

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecotrack.databinding.ActivitySignupBinding


class Signup : AppCompatActivity() {
    private val binding : ActivitySignupBinding by lazy{
        ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }
}