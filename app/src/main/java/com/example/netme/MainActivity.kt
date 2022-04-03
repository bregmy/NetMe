package com.example.netme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.gson.Gson
import java.io.File


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button= findViewById<Button>(R.id.User)
        button.setOnClickListener{
            val intent= Intent(this@MainActivity, UserActivity::class.java)
            startActivity(intent)
        }


        val button2= findViewById<Button>(R.id.employer)
        button2.setOnClickListener{
            val intent= Intent(this@MainActivity, EmployerActivity::class.java)
            startActivity(intent)
        }




    }


}