package com.example.lawyer_case_allocation_app.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lawyer_case_allocation_app.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Runnable

class SplashScreen : Fragment() {

    private lateinit var auth: FirebaseAuth
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = FirebaseAuth.getInstance()
        navController = Navigation.findNavController(view)

        Handler(Looper.myLooper()!!).postDelayed(Runnable {
            if(auth.currentUser != null){
                navController.navigate(R.id.action_splashScreen_to_homeScreenFragment)
            }else{
                navController.navigate(R.id.action_splashScreen_to_signInFragment)
            }
        }, 2000)
    }
}