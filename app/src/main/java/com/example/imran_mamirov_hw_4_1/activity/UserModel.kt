package com.example.imran_mamirov_hw_4_1.activity

import java.io.Serializable


data class UserModel(
    val name: String,
    val email: String,
    val password: String,
) : Serializable