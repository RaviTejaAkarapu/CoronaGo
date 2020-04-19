package com.example.coronago.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coronago.R
import com.example.coronago.adapters.CoronaCasesAdapter.CoronaCaseViewHolder
import com.example.coronago.dummydata.DummyModel

class CoronaCasesAdapter(private val caseList: List<DummyModel>, val itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<CoronaCaseViewHolder>() {

    inner class CoronaCaseViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        var place: TextView = view.findViewById<View>(R.id.placeName) as TextView
        var caseCount: TextView = view.findViewById<View>(R.id.caseCount) as TextView

        fun bind(coronaCase: DummyModel, clickListener: OnItemClickListener)
        {
            place.text = coronaCase.title
            caseCount.text = coronaCase.genre

            itemView.setOnClickListener {
                clickListener.onItemClicked(coronaCase)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoronaCaseViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.cases_item_element, parent, false)
        return CoronaCaseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CoronaCaseViewHolder, position: Int) {
        val coronaCase = caseList[position]
        holder.bind(coronaCase, itemClickListener)
    }

    override fun getItemCount(): Int {
        return caseList.size
    }

    interface OnItemClickListener{
        fun onItemClicked(coronaCase: DummyModel)
    }

}