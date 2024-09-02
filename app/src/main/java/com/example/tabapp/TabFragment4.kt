package com.example.tabapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TabFragment4 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tab4, container, false)
        val textView = view.findViewById<TextView>(R.id.textView4)
        textView.text = "Content for Tab 4"
        return view
    }
}