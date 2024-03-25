package com.example.teacher.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teacher.databinding.ItemTeacherBinding
import com.example.teacher.model.Teacher
import com.example.teacher.model.TeacherProfil

class RvAdapterTeacher(val list: ArrayList<TeacherProfil>) : RecyclerView.Adapter<RvAdapterTeacher.VH>() {
    inner class VH(private val binding: ItemTeacherBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(teacher: TeacherProfil) {
            binding.tvName.text = teacher.name
            binding.tvPassport.text = teacher.passport_seriya
            binding.tvNumber.text = teacher.number
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemTeacherBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(list[position])
    }
}