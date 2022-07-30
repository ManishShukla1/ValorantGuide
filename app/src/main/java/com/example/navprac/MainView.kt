package com.example.navprac

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.mainview.*

class MainView : Fragment(R.layout.mainview) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    val navController = findNavController()
        ab.setOnClickListener{
            val action = MainViewDirections.actionMainView2ToAbility2()
            navController.navigate(action)
        }

         ult.setOnClickListener {
             val action = MainViewDirections.actionMainView2ToUltimatefrag2()
             navController.navigate(action)
         }

        }
    }
