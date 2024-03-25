package com.example.teacher.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teacher.databinding.ItemHujjatRvBinding

class RvAdapterHujjat(val list: List<String>): RecyclerView.Adapter<RvAdapterHujjat.VH>(){
    inner class VH(private val binding: ItemHujjatRvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hujjat: String) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemHujjatRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(list[position])
    }
}