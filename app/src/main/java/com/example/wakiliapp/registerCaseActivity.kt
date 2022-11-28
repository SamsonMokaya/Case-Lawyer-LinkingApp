package com.example.wakiliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.wakiliapp.databinding.ActivityRegisterCaseBinding

class registerCaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterCaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterCaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val categories = listOf("Family", "Land", "Crime")
        val adapter = ArrayAdapter(this, R.layout.list_item_case_category, categories)
        binding.dropdownMenu.setAdapter(adapter)

        val subcategories = listOf("Family", "Divorce", "Crime")
        val adapter2 = ArrayAdapter(this, R.layout.list_item_case_category, subcategories)
        binding.dropdownMenu2.setAdapter(adapter2)

        val lawyers = listOf("Samson Mokaya", "Charity Makhanu", "Constance Kithei", "Salomon Metre")
        val adapter3 = ArrayAdapter(this, R.layout.list_item_case_category, lawyers)
        binding.dropdownMenu3.setAdapter(adapter3)

        binding.registerCase.setOnClickListener{
            val intent = Intent(this, homePageActivity::class.java)
            startActivity(intent)
        }


    }
}