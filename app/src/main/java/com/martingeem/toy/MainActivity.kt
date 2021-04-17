package com.martingeem.toy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        viewPager.apply {
            adapter = MainPagerAdapter(this@MainActivity)
            offscreenPageLimit = 1
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }
    }
}