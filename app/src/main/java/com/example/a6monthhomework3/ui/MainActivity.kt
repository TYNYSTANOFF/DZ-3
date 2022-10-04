package com.example.a6monthhomework3.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.a6monthhomework3.databinding.ActivityMainBinding
import com.example.a6monthhomework3.ui.first.FirstAdapter

class MainActivity : FragmentActivity() {
    private lateinit var adapter: FirstAdapter
    private lateinit var viewPager : ViewPager2
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = FirstAdapter(this)
        viewPager = binding.pager
        viewPager.adapter = adapter
    }
}