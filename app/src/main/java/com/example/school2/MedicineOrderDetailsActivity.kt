package com.example.school2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MedicineOrderDetailsActivity : AppCompatActivity() {
    lateinit var edt_name: EditText
    lateinit var edt_address: EditText
    lateinit var edt_phone: EditText
    lateinit var edt_email: EditText
    lateinit var btn_submit: EditText
    lateinit var edt_medname: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine_order_details)
        edt_name=findViewById(R.id.edt_fullname)
        edt_address=findViewById(R.id.edt_address)
        edt_phone=findViewById(R.id.edt_phone_no)
        edt_email=findViewById(R.id.edt_email)
        btn_submit=findViewById(R.id.btn_submit)
        edt_medname=findViewById(R.id.edt_medicinename)
        btn_submit.setOnClickListener {
            val submit= Intent(this,MainActivity::class.java)
            startActivity(submit)
        }
    }
}