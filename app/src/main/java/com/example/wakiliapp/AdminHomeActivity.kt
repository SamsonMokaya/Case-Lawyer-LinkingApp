package com.example.wakiliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.wakiliapp.databinding.ActivityAdminHomeBinding
import com.example.wakiliapp.databinding.ActivityHomePageBinding

class AdminHomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityAdminHomeBinding
    lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            toggle = ActionBarDrawerToggle(
                this@AdminHomeActivity,
                drawerLayout,
                R.string.open,
                R.string.close
            )
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navViewAdmin.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        menuNavigator("home")
                    }
                    R.id.lawyers -> {
                        menuNavigator("lawyers")
                    }
                    R.id.settings -> {
                        menuNavigator("settings")
                    }
                    R.id.profile -> {
                        menuNavigator(name = "profile")
                    }
                    R.id.cases -> menuNavigator("cases")
                    R.id.profile -> menuNavigator("profile")
                    R.id.history -> menuNavigator("history")
                    R.id.rateus -> menuNavigator("rateus")
                    R.id.share -> menuNavigator("share")
                }
                true
            }
        }
    }

    fun menuNavigator(name: String){

        if(name == "profile"){
            val intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
        }
        if(name == "lawyers"){
            val intent = Intent(this, lawyersActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }

}