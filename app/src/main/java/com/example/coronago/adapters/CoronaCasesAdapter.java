package com.example.coronago.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.coronago.R;
import com.example.coronago.dummydata.DummyModel;
import java.util.List;

public class CoronaCasesAdapter extends RecyclerView.Adapter<CoronaCasesAdapter.CoronaCaseViewHolder> {

    private List<DummyModel> caseList;

    public class CoronaCaseViewHolder extends RecyclerView.ViewHolder {
        public TextView place, caseCount;

        public CoronaCaseViewHolder(View view) {
            super(view);
            place = (TextView) view.findViewById(R.id.placeName);
            caseCount = (TextView) view.findViewById(R.id.caseCount);
        }
    }


    public CoronaCasesAdapter(List<DummyModel> caseList) {
        this.caseList = caseList;
    }

    @Override
    public CoronaCaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cases_item_element, parent, false);

        return new CoronaCaseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CoronaCaseViewHolder holder, int position) {
        DummyModel caseModel = caseList.get(position);
        holder.place.setText(caseModel.getTitle());
        holder.caseCount.setText(caseModel.getGenre());
    }

    @Override
    public int getItemCount() {
        return caseList.size();
    }
}
