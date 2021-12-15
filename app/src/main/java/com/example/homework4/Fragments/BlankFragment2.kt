package com.example.homework4.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.homework4.R


class BlankFragment2 : Fragment(R.layout.fragment_blank2) {

    lateinit var answer : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        answer = view.findViewById(R.id.myanswer)
        answer.text = BlankFragment2Args.fromBundle(requireArguments()).name.toString()





    }

}