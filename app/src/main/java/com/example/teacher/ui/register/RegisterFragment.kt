package com.example.teacher.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.teacher.databinding.FragmentRegisterBinding
import com.example.teacher.model.Teacher
import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.database


class RegisterFragment : Fragment() {
    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var reference: DatabaseReference
    private val binding by lazy { FragmentRegisterBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        firebaseDatabase = Firebase.database
        reference = firebaseDatabase.getReference("users")

        binding.apply {
            btnRegister.setOnClickListener {
                val gender = when (rgGender.checkedRadioButtonId) {
                    rbMale.id -> "Erkak"
                    rbFemale.id -> "Ayol"
                    else -> "Noma'lum"
                }
                val teacher = Teacher(
                    fish = etFISH.text.toString(),
                    fuqarolik = etFuqarolik.text.toString(),
                    seriya_passport = etSeriya.text.toString(),
                    jshshr = etJSHSHR.text.toString(),
                    email = etEmailAdress.text.toString(),
                    number = etNumber.text.toString(),
                    birthday = etBirthday.text.toString(),
                    jinsi = gender,
                    tugilgan_davlat = etCountry.text.toString(),
                    tugilgan_viloyat = etViloyat.text.toString(),
                    tugilgan_tuman = etShahar.text.toString(),
                    yashash_viloyat = etViloyatUzb.text.toString(),
                    yashash_tuman = etShaharUzb.text.toString(),
                    yashash_mfy = etMFY.text.toString(),
                    yashash_kocha = etKocha.text.toString(),
                    yashash_uy = etUy.text.toString(),
                    malumot_davlat = etDavlatOquvYurt.text.toString(),
                    oquv_yurt_nomi = etOquvYurt.text.toString(),
                    mutaxasisligi = etMutaxasisligi.text.toString(),
                    ilmiy_daraja = etIlmiyDaraja.text.toString()
                )
                reference.child(teacher.seriya_passport).setValue(teacher).addOnSuccessListener {
                    Toast.makeText(
                        requireContext(),
                        "Muvaffaqiyatli ro'yxatdan o'tdingiz",
                        Toast.LENGTH_SHORT
                    ).show()
                    // item clear
                    etFISH.text?.clear()
                    etFuqarolik.text?.clear()
                    etSeriya.text?.clear()
                    etJSHSHR.text?.clear()
                    etEmailAdress.text?.clear()
                    etNumber.text?.clear()
                    rgGender.clearCheck()
                    etBirthday.text?.clear()
                    etCountry.text?.clear()
                    etViloyat.text?.clear()
                    etShahar.text?.clear()
                    etViloyatUzb.text?.clear()
                    etShaharUzb.text?.clear()
                    etMFY.text?.clear()
                    etKocha.text?.clear()
                    etUy.text?.clear()
                    etDavlatOquvYurt.text?.clear()
                    etOquvYurt.text?.clear()
                    etMutaxasisligi.text?.clear()
                    etIlmiyDaraja.text?.clear()
                }.addOnFailureListener {
                    Toast.makeText(
                        requireContext(),
                        "Ro'yxatdan o'tishda xatolik yuz berdi",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }


        return binding.root
    }
}