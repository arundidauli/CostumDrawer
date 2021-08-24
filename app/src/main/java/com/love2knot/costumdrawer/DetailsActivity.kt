package com.love2knot.costumdrawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.love2knot.costumdrawer.fragment.AboutFragment
import com.love2knot.costumdrawer.fragment.ReviewFragment
import com.love2knot.costumdrawer.fragment.ServicesFragment
import com.love2knot.costumdrawer.ui.adapter.ViewPagerAdapter
import com.love2knot.costumdrawer.ui.gallery.GalleryFragment

class DetailsActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        viewPager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tab_layout)
        setAdapters()
    }

    private fun setAdapters() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(AboutFragment(), "About")
        adapter.addFragment(ServicesFragment(), "Services")
        adapter.addFragment(GalleryFragment(), "Gallery")
        adapter.addFragment(ReviewFragment(), "Review")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }

}