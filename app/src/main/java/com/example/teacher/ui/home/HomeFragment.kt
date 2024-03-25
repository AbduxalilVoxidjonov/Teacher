package com.example.teacher.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.teacher.adapter.RvAdapterTeacher
import com.example.teacher.databinding.FragmentHomeBinding
import com.example.teacher.model.Teacher
import com.example.teacher.model.TeacherProfil
import com.google.firebase.Firebase
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.database
import com.google.firebase.database.getValue

class HomeFragment : Fragment() {
    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var reference: DatabaseReference
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<TeacherProfil>
    private lateinit var rvAdapterTeacher: RvAdapterTeacher
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        firebaseDatabase = Firebase.database
        reference = firebaseDatabase.getReference("users")
        list = ArrayList()

        rvAdapterTeacher = RvAdapterTeacher(list)
        binding.rvTeacher.adapter = rvAdapterTeacher

        reference.addValueEventListener(object : ValueEventListener {
            @SuppressLint("NotifyDataSetChanged")
            override fun onDataChange(snapshot: DataSnapshot) {
                list.clear()
                val children = snapshot.children
                children.forEach {
                    val user = it.getValue(Teacher::class.java)
                    if (user != null) {
                        list.add(
                            TeacherProfil(
                                name = "FISH: " + user.fish,
                                passport_seriya = "Passport raqam: " + user.seriya_passport,
                                number = "Telefon raqam: " + user.number
                            )
                        )
                    }
                    rvAdapterTeacher.notifyDataSetChanged()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
            }
        })

        return binding.root
    }

}