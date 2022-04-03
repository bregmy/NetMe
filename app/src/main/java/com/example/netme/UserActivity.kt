package com.example.netme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.netme.fragment.ProfileFragments
import com.example.netme.fragment.jobFragment
import com.example.netme.fragment.resumeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.gson.Gson
import java.io.File

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user2)





        val fragmentManager: FragmentManager = supportFragmentManager




            findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener { item ->
                var fragmentToShow: Fragment? = null

                when(item.itemId) {
                    R.id.action_jobs-> {
                        fragmentToShow=jobFragment()



                    }
                    R.id.action_resume -> {
                        fragmentToShow= resumeFragment()


                    }
                    R.id.action_profile->{
                        fragmentToShow=ProfileFragments()
                    }

                }
                if (fragmentToShow != null) {
                  fragmentManager.beginTransaction().replace(R.id.flContainer, fragmentToShow).commit()
                        //.commit()
                }
                true
            }

            findViewById<BottomNavigationView>(R.id.bottom_navigation).setSelectedItemId(R.id.action_jobs)

            //  queryPosts()
        }



    }


