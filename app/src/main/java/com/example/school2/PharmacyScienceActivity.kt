package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PharmacyScienceActivity : AppCompatActivity() {

    lateinit var tutorps1: TextView
    lateinit var tutorps2: TextView
    lateinit var tutorps3: TextView
    lateinit var tutorps4: TextView
    lateinit var tutorps5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pharmacy_science)


        tutorps1=findViewById(R.id.tv_ps1)
        tutorps1.setOnClickListener {
            val ps1= Intent(this,MainActivity::class.java)
            startActivity(ps1)
        }
        tutorps2=findViewById(R.id.tv_ps2)
        tutorps2.setOnClickListener {
            val ps2= Intent(this,MainActivity::class.java)
            startActivity(ps2)
        }
        tutorps3=findViewById(R.id.tv_ps3)
        tutorps3.setOnClickListener {
            val ps3= Intent(this,MainActivity::class.java)
            startActivity(ps3)
        }
        tutorps4=findViewById(R.id.tv_ps4)
        tutorps4.setOnClickListener {
            val ps4= Intent(this,MainActivity::class.java)
            startActivity(ps4)
        }
        tutorps5=findViewById(R.id.tv_ps5)
        tutorps5.setOnClickListener {
            val ps5= Intent(this,MainActivity::class.java)
            startActivity(ps5)
        }
    }
}