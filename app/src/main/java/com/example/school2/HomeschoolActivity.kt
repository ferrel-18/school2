package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeschoolActivity : AppCompatActivity() {
    lateinit var tutorhs1: TextView
    lateinit var tutorhs2: TextView
    lateinit var tutorhs3: TextView
    lateinit var tutorhs4: TextView
    lateinit var tutorhs5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeschool)


        tutorhs1=findViewById(R.id.tv_hs1)
        tutorhs1.setOnClickListener {
            val hs1= Intent(this,MainActivity::class.java)
            startActivity(hs1)
        }
        tutorhs2=findViewById(R.id.tv_hs2)
        tutorhs2.setOnClickListener {
            val hs2= Intent(this,MainActivity::class.java)
            startActivity(hs2)
        }
        tutorhs3=findViewById(R.id.tv_hs3)
        tutorhs3.setOnClickListener {
            val hs3= Intent(this,MainActivity::class.java)
            startActivity(hs3)
        }
        tutorhs4=findViewById(R.id.tv_hs4)
        tutorhs4.setOnClickListener {
            val hs4= Intent(this,MainActivity::class.java)
            startActivity(hs4)
        }
        tutorhs5=findViewById(R.id.tv_hs5)
        tutorhs5.setOnClickListener {
            val hs5= Intent(this,MainActivity::class.java)
            startActivity(hs5)
        }
    }
}