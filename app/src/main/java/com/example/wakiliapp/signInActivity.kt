package com.example.wakiliapp

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wakiliapp.databinding.ActivitySignInBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider


class signInActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        firebaseAuth = FirebaseAuth.getInstance()

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView5.setOnClickListener{
            val intent = Intent(this, signUpActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener{
            val email = binding.email.text.toString()
            val pass= binding.passwordTI.text.toString()

        //    if(email.isNotEmpty() or pass.isNotEmpty()){
//                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener{
//                    if(it.isSuccessful){
                        val intent = Intent(this,homePageActivity::class.java)
                        startActivity(intent)
//                    }else{
//                        Toast.makeText(this,"Incorrect username or password", Toast.LENGTH_SHORT).show()
//                    }
//                }
//            }else{
//                Toast.makeText(this,"Empty fields are prohibited", Toast.LENGTH_SHORT).show()
//            }
        }


    }
}