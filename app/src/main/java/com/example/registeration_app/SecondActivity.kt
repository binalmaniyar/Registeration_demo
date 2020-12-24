package com.example.registeration_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        if(bundle!=null)
        {
            val fn1 = bundle.get("fullname").toString()
            val un1 = bundle.get("username").toString()
            val pwd1 = bundle.get("password").toString()
            val eml1 = bundle.get("email").toString()
            val phn1 = bundle.get("phoneNo").toString()

            fn.text = fn1
            un.text = un1
            pwd.text = pwd1
            eml.text = eml1
            phn.text = phn1
        }
    }
}
