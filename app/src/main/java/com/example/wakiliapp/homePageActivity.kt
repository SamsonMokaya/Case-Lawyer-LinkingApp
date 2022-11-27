package com.example.wakiliapp

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
                    R.id.home -> {Toast.makeText(this@homePageActivity,"Home Selected", Toast.LENGTH_SHORT).show()}
                    R.id.settings -> {Toast.makeText(this@homePageActivity,"Settings Selected", Toast.LENGTH_SHORT).show()}
                    R.id.profile -> Toast.makeText(this@homePageActivity,"profile Selected", Toast.LENGTH_SHORT).show()
                    R.id.cases -> Toast.makeText(this@homePageActivity,"Cases Selected", Toast.LENGTH_SHORT).show()
                    R.id.profile -> Toast.makeText(this@homePageActivity,"Profile Selected", Toast.LENGTH_SHORT).show()
                    R.id.history -> Toast.makeText(this@homePageActivity,"History Selected", Toast.LENGTH_SHORT).show()
                    R.id.rateus -> Toast.makeText(this@homePageActivity,"RateUs Selected", Toast.LENGTH_SHORT).show()
                    R.id.share -> Toast.makeText(this@homePageActivity,"Share Selected", Toast.LENGTH_SHORT).show()
                }
                true
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}