package com.example.wakiliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import com.example.wakiliapp.databinding.ActivityHomePageBinding

class homePageActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomePageBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            toggle = ActionBarDrawerToggle(this@homePageActivity,drawerLayout, R.string.open,R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId){
                    R.id.home -> {menuNavigator("home")}
                    R.id.settings -> {menuNavigator("settings")}
                    R.id.profile -> {menuNavigator(name = "profile") }
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
        else{
            val intent = Intent(this, homePageActivity::class.java)
            startActivity(intent)
        }
    }


//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        var id = item.itemId
//
//
//        if(toggle.onOptionsItemSelected(item)){
//
//            if(item.itemId == R.id.profile){
//                val intent = Intent(this, profileActivity::class.java)
//                startActivity(intent)
//
//                return true
//            }
//            true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}