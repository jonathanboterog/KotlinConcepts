package com.jbotero.kotlinconcepts.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jbotero.kotlinconcepts.R

class Home2Fragment : Fragment() {

    private lateinit var homeViewModel: Home2ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(Home2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home2, container, false)
        val textView: TextView = root.findViewById(R.id.text_home2)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}