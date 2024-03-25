package com.example.teacher.model

import java.io.Serializable

class Teacher : Serializable {
    var fish: String = ""
    var fuqarolik: String = ""
    var seriya_passport: String = ""
    var jshshr: String = ""
    var email: String = ""
    var number: String = ""
    var birthday: String = ""
    var jinsi: String = ""
    var tugilgan_davlat: String = ""
    var tugilgan_viloyat: String = ""
    var tugilgan_tuman: String = ""
    var yashash_viloyat: String = ""
    var yashash_tuman: String = ""
    var yashash_mfy: String = ""
    var yashash_kocha: String = ""
    var yashash_uy: String = ""
    var malumot_davlat: String = ""
    var oquv_yurt_nomi: String = ""
    var mutaxasisligi: String = ""
    var ilmiy_daraja: String = ""

    constructor()
    constructor(
        fish: String,
        fuqarolik: String,
        seriya_passport: String,
        jshshr: String,
        email: String,
        number: String,
        birthday: String,
        jinsi: String,
        tugilgan_davlat: String,
        tugilgan_viloyat: String,
        tugilgan_tuman: String,
        yashash_viloyat: String,
        yashash_tuman: String,
        yashash_mfy: String,
        yashash_kocha: String,
        yashash_uy: String,
        malumot_davlat: String,
        oquv_yurt_nomi: String,
        mutaxasisligi: String,
        ilmiy_daraja: String
    ) {
        this.fish = fish
        this.fuqarolik = fuqarolik
        this.seriya_passport = seriya_passport
        this.jshshr = jshshr
        this.email = email
        this.number = number
        this.birthday = birthday
        this.jinsi = jinsi
        this.tugilgan_davlat = tugilgan_davlat
        this.tugilgan_viloyat = tugilgan_viloyat
        this.tugilgan_tuman = tugilgan_tuman
        this.yashash_viloyat = yashash_viloyat
        this.yashash_tuman = yashash_tuman
        this.yashash_mfy = yashash_mfy
        this.yashash_kocha = yashash_kocha
        this.yashash_uy = yashash_uy
        this.malumot_davlat = malumot_davlat
        this.oquv_yurt_nomi = oquv_yurt_nomi
        this.mutaxasisligi = mutaxasisligi
        this.ilmiy_daraja = ilmiy_daraja
    }

    override fun toString(): String {
        return super.toString()
    }
}
