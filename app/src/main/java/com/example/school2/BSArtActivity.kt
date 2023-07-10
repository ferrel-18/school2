package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BSArtActivity : AppCompatActivity() {

    lateinit var tutorbs1:TextView
    lateinit var tutorbs2:TextView
    lateinit var tutorbs3:TextView
    lateinit var tutorbs4:TextView
    lateinit var tutorbs5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bsart)

        tutorbs1=findViewById(R.id.tv_bs1)
        tutorbs1.setOnClickListener {
            val bs1=Intent(this,MainActivity::class.java)
            startActivity(bs1)
        }
        tutorbs2=findViewById(R.id.tv_bs2)
        tutorbs2.setOnClickListener {
            val bs2=Intent(this,MainActivity::class.java)
            startActivity(bs2)
        }
        tutorbs3=findViewById(R.id.tv_bs3)
        tutorbs3.setOnClickListener {
            val bs3=Intent(this,MainActivity::class.java)
            startActivity(bs3)
        }
        tutorbs4=findViewById(R.id.tv_bs4)
        tutorbs4.setOnClickListener {
            val bs4=Intent(this,MainActivity::class.java)
            startActivity(bs4)
        }
        tutorbs5=findViewById(R.id.tv_bs5)
        tutorbs5.setOnClickListener {
            val bs5=Intent(this,MainActivity::class.java)
            startActivity(bs5)
        }
    }
}