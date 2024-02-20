package com.example.teacher.ui.scientist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teacher.databinding.FragmentScientistBinding

class ScientistFagment: Fragment(){
    private val binding by lazy { FragmentScientistBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {




        return binding.root
    }
}