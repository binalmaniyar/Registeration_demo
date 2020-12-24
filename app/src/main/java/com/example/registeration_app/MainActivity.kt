package com.example.registeration_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnSubmit = findViewById<Button>(R.id.btnSubmit)



        btnSubmit.setOnClickListener {

            val fn = Fullname.text.toString()
            val un = Username.text.toString()
            val pwd = Password.text.toString()
            val eml = Email.text.toString()
            val pn = PhoneNo.text.toString()

            if(fn.isEmpty() || un.isEmpty() || pwd.isEmpty() || eml.isEmpty() || pn.isEmpty()) {
                Toast.makeText(this,"Field cannot be empty!!", Toast.LENGTH_SHORT).show()
            }

            else{
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("fullname",fn)
                intent.putExtra("username",un)
                intent.putExtra("password",pwd)
                intent.putExtra("email",eml)
                intent.putExtra("phoneNo",pn)

                startActivity(intent)

            }
        }
    }
}
