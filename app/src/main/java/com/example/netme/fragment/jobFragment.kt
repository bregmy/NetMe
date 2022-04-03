package com.example.netme.fragment

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.netme.R
import com.example.netme.databinding.ActivityMainBinding


/**
 * A simple [Fragment] subclass.
 * Use the [jobFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class jobFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_job, container, false)

    }


}