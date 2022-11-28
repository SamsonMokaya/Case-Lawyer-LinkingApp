package com.example.wakiliapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wakiliapp.databinding.ActivityLawyersBinding

class lawyersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLawyersBinding
    private lateinit var userArrayList : ArrayList<Lawyer>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLawyersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.person1,R.drawable.person2,R.drawable.person1,R.drawable.person2,
            R.drawable.person1,R.drawable.person2,R.drawable.person1,R.drawable.person2,
        )

        val name= arrayOf(
            "Samson Mokaya", "Charity Makhanu", "Salomon Kulondwa", "Constance Kithei",
            "Samson Mokaya", "Charity Makhanu", "Salomon Kulondwa", "Constance Kithei",
        )

        val email = arrayOf(
            "samson@gmail.com","charity@gmail.com","salomon@gmail.com","constance@gmail.com",
            "samson@gmail.com","charity@gmail.com","salomon@gmail.com","constance@gmail.com"
        )

        val phoneNo = arrayOf(
            "+254794251657","+254794251657","+254794251657","+254794251657",
            "+254794251657","+254794251657","+254794251657","+254794251657",
        )

        val country = arrayOf(
            "Kenya","Dubai","Democratic Republic of Congo","Uganda",
            "Kenya","Dubai","Democratic Republic of Congo","Uganda",
        )

        userArrayList = ArrayList()
            for(i in name.indices){
                val lawyer = Lawyer(name[i], email[i], phoneNo[i], country[i], imageId[i])
                userArrayList.add(lawyer)
            }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone=phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

           // val i = Intent
        }

    }
}