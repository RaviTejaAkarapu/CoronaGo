package com.example.coronago.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coronago.R
import com.example.coronago.adapters.CoronaCasesAdapter
import com.example.coronago.dummydata.DummyModel
import com.example.coronago.dummydata.DummyDataProvider
import com.example.coronago.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var dummyModelList: List<DummyModel>
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var mAdapter: CoronaCasesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel =
            ViewModelProviders.of(this).get<MainActivityViewModel>(MainActivityViewModel::class.java)
        setContentView(R.layout.activity_main)
        setData()
    }

    private fun setData() {

        //TODO need to populate total counts & other dynamic fields

        dummyModelList = viewModel.loadData(0)
        mAdapter = CoronaCasesAdapter(dummyModelList)
        val mLayoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(applicationContext)
        rv_details.layoutManager = mLayoutManager
        rv_details.itemAnimator = DefaultItemAnimator()
        rv_details.adapter = mAdapter

        mAdapter.notifyDataSetChanged()
    }


}
