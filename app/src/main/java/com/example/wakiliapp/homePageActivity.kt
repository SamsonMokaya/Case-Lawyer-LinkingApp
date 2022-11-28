package com.example.wakiliapp

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.wakiliapp.databinding.ActivityHomePageBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


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
                    R.id.lawyers -> {menuNavigator("lawyers")}
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

        val mAuth = FirebaseAuth.getInstance();
        val currentUser: FirebaseUser? = mAuth.getCurrentUser()
        if (currentUser != null) {
           var welcomeText=findViewById<TextView>(R.id.welcomeText)
            welcomeText.setText("Welcome back ${currentUser.displayName?:"Samson"}")
        }

        binding.registerCase.setOnClickListener{
            val intent = Intent(this, registerCaseActivity::class.java)
            startActivity(intent)
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
<<<<<<< HEAD
=======
        if(name == "home"){
            val intent = Intent(this, homePageActivity::class.java)
            startActivity(intent)
        }
//        else{
//            val intent = Intent(this, homePageActivity::class.java)
//            startActivity(intent)
//        }
>>>>>>> 9c4f813f6e4e8be3365516305cc52cec1a73949f
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}