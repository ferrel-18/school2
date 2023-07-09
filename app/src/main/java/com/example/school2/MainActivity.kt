package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    lateinit var myCardView:CardView
    lateinit var myFindTeach:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myCardView=findViewById(R.id.CardLogout)
        myCardView.setOnClickListener {
            val exit=Intent(this,MainActivity::class.java)
            startActivity(exit)



        }


    }
}