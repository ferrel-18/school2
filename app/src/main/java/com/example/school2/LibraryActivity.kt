package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LibraryActivity : AppCompatActivity() {


    lateinit var tutorlib1: TextView
    lateinit var tutorlib2: TextView
    lateinit var tutorlib3: TextView
    lateinit var tutorlib4: TextView
    lateinit var tutorlib5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)


        tutorlib1=findViewById(R.id.tv_lib1)
        tutorlib1.setOnClickListener {
            val lib1= Intent(this,MainActivity::class.java)
            startActivity(lib1)
        }
        tutorlib2=findViewById(R.id.tv_lib2)
        tutorlib2.setOnClickListener {
            val lib2= Intent(this,MainActivity::class.java)
            startActivity(lib2)
        }
        tutorlib3=findViewById(R.id.tv_lib3)
        tutorlib3.setOnClickListener {
            val lib3= Intent(this,MainActivity::class.java)
            startActivity(lib3)
        }
        tutorlib4=findViewById(R.id.tv_lib4)
        tutorlib4.setOnClickListener {
            val lib4= Intent(this,MainActivity::class.java)
            startActivity(lib4)
        }
        tutorlib5=findViewById(R.id.tv_lib5)
        tutorlib5.setOnClickListener {
            val lib5= Intent(this,MainActivity::class.java)
            startActivity(lib5)
        }
    }
}