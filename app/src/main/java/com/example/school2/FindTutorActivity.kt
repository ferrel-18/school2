package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FindTutorActivity : AppCompatActivity() {
    lateinit var crd_back:CardView
    lateinit var crdLibteach:CardView
    lateinit var crdPharmScieteach:CardView
    lateinit var crdLawInterteach:CardView
    lateinit var crdBSARTteach:CardView
    lateinit var crdHometeach:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_tutor)

        crd_back=findViewById(R.id.cardBack)
        crd_back.setOnClickListener {
            val goback=Intent(this,MainActivity::class.java)
            startActivity(goback)
        }
        crdHometeach=findViewById(R.id.cardHomeSchoolTutors)
        crdHometeach.setOnClickListener {
            val hometeach=Intent(this,TeacherDetailsActivity::class.java)
            startActivity(hometeach)
        }
        crdLibteach=findViewById(R.id.cardLib_techTutors)
        crdLibteach.setOnClickListener {
            val library=Intent(this,TeacherDetailsActivity::class.java)
            startActivity(library)
        }
        crdPharmScieteach=findViewById(R.id.cardMed_scierelated)
        crdPharmScieteach.setOnClickListener {
            val pharmacy=Intent(this,TeacherDetailsActivity::class.java)
            startActivity(pharmacy)
        }
        crdLawInterteach=findViewById(R.id.cardLaw_interrela)
        crdLawInterteach.setOnClickListener {
            val  law=Intent(this,TeacherDetailsActivity::class.java)
            startActivity(law)
        }
        crdBSARTteach=findViewById(R.id.cardBusiness_arts_economic)
        crdBSARTteach.setOnClickListener {
            val BsArt=Intent(this,TeacherDetailsActivity::class.java)
            startActivity(BsArt)
        }
    }
}