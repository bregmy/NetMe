package com.example.netme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.netme.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class EmployerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employer)

        val fragmentManager: FragmentManager = supportFragmentManager




        findViewById<BottomNavigationView>(R.id.bottom_navigation1).setOnItemSelectedListener { item ->
            var fragmentToShow: Fragment? = null

            when(item.itemId) {


                R.id.profile1-> {
                    fragmentToShow= EmJobFragment()

                }

                R.id.job1 -> {

                    fragmentToShow=EmpFragment()
                }


            }
            if (fragmentToShow != null) {
                fragmentManager.beginTransaction().replace(R.id.flsContainer, fragmentToShow).commit()
            }
            true
        }

        findViewById<BottomNavigationView>(R.id.bottom_navigation1).setSelectedItemId(R.id.job1)

        //  queryPosts()
    }


}
