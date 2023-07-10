package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LawInterelatedActivity : AppCompatActivity() {

    lateinit var tutorlis1: TextView
    lateinit var tutorlis2: TextView
    lateinit var tutorlis3: TextView
    lateinit var tutorlis4: TextView
    lateinit var tutorlis5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_law_interelated)

        tutorlis1=findViewById(R.id.tv_lis1)
        tutorlis1.setOnClickListener {
            val lis1= Intent(this,MainActivity::class.java)
            startActivity(lis1)
        }
        tutorlis2=findViewById(R.id.tv_lis2)
        tutorlis2.setOnClickListener {
            val lis2= Intent(this,MainActivity::class.java)
            startActivity(lis2)
        }
        tutorlis3=findViewById(R.id.tv_lis3)
        tutorlis3.setOnClickListener {
            val lis3= Intent(this,MainActivity::class.java)
            startActivity(lis3)
        }
        tutorlis4=findViewById(R.id.tv_lis4)
        tutorlis4.setOnClickListener {
            val lis4= Intent(this,MainActivity::class.java)
            startActivity(lis4)
        }
        tutorlis5=findViewById(R.id.tv_lis5)
        tutorlis5.setOnClickListener {
            val lis5= Intent(this,MainActivity::class.java)
            startActivity(lis5)
        }
    }
}