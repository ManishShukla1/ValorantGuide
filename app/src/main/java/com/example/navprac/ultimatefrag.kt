package com.example.navprac

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.ability.*
import kotlinx.android.synthetic.main.ultimate.*

class ultimatefrag : Fragment(R.layout.ultimate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    val navController=findNavController()
        button7.setOnClickListener{
            val action = ultimatefragDirections.actionUltimatefrag2ToReynaultifrag2()
            navController.navigate(action)
        }
        button8.setOnClickListener{
            val action = ultimatefragDirections.actionUltimatefrag2ToJettultifrag2()
            navController.navigate(action)
        }
        button9.setOnClickListener{
            val action = ultimatefragDirections.actionUltimatefrag2ToNeonultifrag2()
            navController.navigate(action)
        }
        button10.setOnClickListener{
            val action = ultimatefragDirections.actionUltimatefrag2ToSovaultfrag2()
            navController.navigate(action)
        }
    }
}