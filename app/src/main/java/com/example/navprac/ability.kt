package com.example.navprac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.ability.*

class ability : Fragment(R.layout.ability) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
          val navController= findNavController()
          button3.setOnClickListener{
              val action=abilityDirections.actionAbility2ToReynaabilityfrag2()
              navController.navigate(action)
          }
        button4.setOnClickListener{
            val action=abilityDirections.actionAbility2ToJettabilityfrag2()
            navController.navigate(action)
        }
        button5.setOnClickListener{
            val action=abilityDirections.actionAbility2ToNeonabilityfrag2()
            navController.navigate(action)
        }
        button6.setOnClickListener{
            val action=abilityDirections.actionAbility2ToSovaabilityfrag2()
            navController.navigate(action)
        }



    }
}