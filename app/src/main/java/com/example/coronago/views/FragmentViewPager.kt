package com.example.coronago.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.coronago.R
import kotlinx.android.synthetic.main.fragment_view_pager.*

class FragmentViewPager : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_view_pager, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            title.text = it.getString("text")
            image.setBackgroundResource(it.getInt("img"))
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(text: String?, image: Int): FragmentViewPager {
            val f = FragmentViewPager()
            val b = Bundle()
            b.putString("text", text)
            b.putInt("img", image)
            f.arguments = b
            return f
        }
    }
}