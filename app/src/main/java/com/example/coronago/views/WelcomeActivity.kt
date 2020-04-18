package com.example.coronago.views

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.coronago.R
import com.example.coronago.views.FragmentViewPager.Companion.newInstance
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    private val totalPages = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        setupViewPager()
    }

    private fun setupViewPager() {
        pager.adapter = MyPagerAdapter(supportFragmentManager)
        tv_prev.setOnClickListener { prevNextListener(PrevNext.PREVIOUS) }
        tv_next.setOnClickListener { prevNextListener(PrevNext.NEXT)}
    }

    private fun prevNextListener(action : PrevNext){
        if (action == PrevNext.PREVIOUS) {
            if (pager.currentItem != 0)
                pager.currentItem = pager.currentItem - 1
        }
        else if (action == PrevNext.NEXT)
            if (pager.currentItem != totalPages)
                pager.currentItem = pager.currentItem + 1
    }
    private inner class MyPagerAdapter(fm: FragmentManager?) :
        FragmentPagerAdapter(fm!!) {
        override fun getItem(pos: Int): FragmentViewPager {
            return when (pos) {
                0 -> newInstance("page 1", R.drawable.icon_corona)
                1 -> newInstance("page 2", R.drawable.icon_corona)
                2 -> newInstance("page 3", R.drawable.icon_corona)
                else -> newInstance("page4", R.drawable.icon_corona)
            }
        }

        override fun getCount(): Int {
            return totalPages
        }
    }

    enum class PrevNext {
        PREVIOUS, NEXT
    }
}