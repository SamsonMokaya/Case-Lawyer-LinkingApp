package com.example.lawyer_case_allocation_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lawyer_case_allocation_app.R
import com.example.lawyer_case_allocation_app.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }


    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
        binding.button.setOnClickListener{
            Toast.makeText(context, "Signed in successfully", Toast.LENGTH_SHORT).show()
            navControl.navigate(R.id.action_signInFragment_to_homeScreenFragment)
        }

        binding.textView5.setOnClickListener{
            navControl.navigate(R.id.action_signInFragment_to_signUpFragment)
        }

    }


}