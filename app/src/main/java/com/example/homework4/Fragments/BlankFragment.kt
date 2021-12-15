package com.example.homework4.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.homework4.R

class BlankFragment : Fragment(R.layout.fragment_blank) {

    lateinit var myanswer : TextView
    lateinit var butt : Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myanswer = view.findViewById(R.id.et)
        butt = view.findViewById(R.id.butt)

        val navController = Navigation.findNavController(view)

        butt.setOnClickListener{

            val answer = myanswer.text.toString()

            if (answer.isEmpty()){
                return@setOnClickListener
            }

            val action = BlankFragmentDirections.actionBlankFragmentToBlankFragment2(answer)
            navController.navigate(action)

        }

    }

}