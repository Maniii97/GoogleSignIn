package com.example.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Activity2 : AppCompatActivity() {
    lateinit var name : String
    lateinit var email : String
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val user = Firebase.auth.currentUser
        user?.let {
             name = it.displayName.toString()
             email = it.email.toString()
        }
        val tv = findViewById<TextView>(R.id.tv)
        val text = "Your Name : $name \n" +
                "Your Email : $email"
        tv.setText(text)
    }
}