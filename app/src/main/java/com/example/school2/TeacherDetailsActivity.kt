package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class TeacherDetailsActivity : AppCompatActivity() {
    lateinit var TDTitle:TextView
    lateinit var btn_back:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_details)

        val arrayAdapter:ArrayAdapter<*>
        val  users= arrayOf(
            TeacherDetails("Erick Were","Westlands","13yrs","07248107000","1500"),
            TeacherDetails1("Favel Maloba","Nairobi","15yrs","07247467000","2000"),
            TeacherDetails2("Omanyala Opindi","Kisumu","16yrs","07564107000","700"),
            TeacherDetails3("Kylian Otiende","Kakamega","14yrs","07738107000","1200"),
            TeacherDetails4("Ombiti Otoyo","Machakos","10yrs","0724816435","2500"))

        val mListView=findViewById<ListView>(R.id.listviewTDetails)
        arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,users)
        mListView.adapter=arrayAdapter



        TDTitle=findViewById(R.id.tvViewTDtitle)
        btn_back=findViewById(R.id.buttonDDBack)
        btn_back.setOnClickListener {








            val back =Intent(this,FindTutorActivity::class.java)
            startActivity(back)
        }

    }
    private fun TeacherDetails(Tutors_Name:String,Address:String,Experience:String,MobileNo:String,Fees:String){}
    private fun TeacherDetails1(Tutors_Name:String,Address:String,Experience:String,MobileNo:String,Fees:String){}
    private fun TeacherDetails2(Tutors_Name:String,Address:String,Experience:String,MobileNo:String,Fees:String){}
    private fun TeacherDetails3(Tutors_Name:String,Address:String,Experience:String,MobileNo:String,Fees:String){}
    private fun TeacherDetails4(Tutors_Name:String,Address:String,Experience:String,MobileNo:String,Fees:String){}
}