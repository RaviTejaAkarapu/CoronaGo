package com.example.coronago.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coronago.ApplicationContext
import com.example.coronago.R
import com.example.coronago.adapters.CoronaCasesAdapter
import com.example.coronago.di.ViewModelFactory
import com.example.coronago.di.component.AppComponent
import com.example.coronago.dummydata.DummyModel
import com.example.coronago.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() , CoronaCasesAdapter.OnItemClickListener {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: MainActivityViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
    }
    private lateinit var mAdapter: CoronaCasesAdapter
    private  var calledFrom: String? = null
    private  var clickedElement: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getIntentBundle()
        setData()
    }

    private fun getIntentBundle() {
            calledFrom = if (intent.hasExtra(CALLED_FROM)) intent.getStringExtra(CALLED_FROM) else null
            clickedElement = if (intent.hasExtra(ELEMENT_ID)) intent.getStringExtra(ELEMENT_ID) else null

    }

    private fun setData() {

        //TODO need to populate total counts & other dynamic fields

        viewModel.caseData.observe(this, Observer {
            mAdapter = CoronaCasesAdapter(it, this)
            val mLayoutManager: RecyclerView.LayoutManager =
                LinearLayoutManager(applicationContext)
            rv_details.layoutManager = mLayoutManager
            rv_details.itemAnimator = DefaultItemAnimator()
            rv_details.adapter = mAdapter

            mAdapter.notifyDataSetChanged()
        })
        viewModel.loadData(clickedElement)
    }

    override fun onItemClicked(coronaCase: DummyModel) {
        calledFrom?.let {
            if (it == FROM_WELCOMESCREEN) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(CALLED_FROM, FROM_MAINACTIVITY)
                intent.putExtra(ELEMENT_ID, coronaCase.year)
                startActivity(intent)
            }
        }

    }

    companion object{
        const val FROM_WELCOMESCREEN = "FROM_WELCOMESCREEN"
        const val FROM_MAINACTIVITY = "FROM_MAINACTIVITY"
        const val CALLED_FROM = "CALLED_FROM"
        const val ELEMENT_ID = "ELEMENT_ID"
    }
}
