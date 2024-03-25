package com.example.teacher.ui.hujjat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teacher.R
import com.example.teacher.databinding.FragmentHujjatBinding


class HujjatFragment : Fragment() {


    private val binding by lazy {FragmentHujjatBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

}