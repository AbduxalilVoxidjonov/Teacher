package com.example.teacher.ui.group

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teacher.databinding.FragmentGroupBinding

class GroupFagment: Fragment(){
    private val binding by lazy { FragmentGroupBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {




        return binding.root
    }
}