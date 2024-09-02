package com.example.tabapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 4 // Number of tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabFragment1()
            1 -> TabFragment2()
            2 -> TabFragment3()
            3 -> TabFragment4()
            else -> {TabFragment1()}
        }
    }
}