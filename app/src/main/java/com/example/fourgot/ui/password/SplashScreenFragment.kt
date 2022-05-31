package com.example.fourgot.ui.password

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fourgot.R
import kotlinx.android.synthetic.main.fragment_password.*
import kotlinx.android.synthetic.main.fragment_splash_screen.*


class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_splashScreen_id.setOnClickListener{
            findNavController().navigate(R.id.passwordListFragment)
        }
    }

}


