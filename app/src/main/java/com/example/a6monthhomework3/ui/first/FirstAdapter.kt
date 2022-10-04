package com.example.a6monthhomework3.ui.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.a6monthhomework3.KEY

class FirstAdapter (fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
       val fragment = FirstFragment()
        fragment.arguments = Bundle().apply {
            putInt(KEY, position +1)
        }
        return fragment
    }

}