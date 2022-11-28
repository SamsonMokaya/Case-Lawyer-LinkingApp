package com.example.wakiliapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wakiliapp.databinding.ActivityLawyerProfileBinding


class lawyerProfile : AppCompatActivity() {

    lateinit var binding: ActivityLawyerProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLawyerProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId", R.drawable.profile)

        binding.nameProfile.text = name
        binding.phoneProfile.text = phone
        binding.countryProfile.text = country
        binding.profileImage.setImageResource(imageId)
    }
}