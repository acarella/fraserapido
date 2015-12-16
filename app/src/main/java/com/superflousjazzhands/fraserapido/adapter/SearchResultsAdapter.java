package com.superflousjazzhands.fraserapido.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.superflousjazzhands.fraserapido.FraseRapidoApplication;
import com.superflousjazzhands.fraserapido.R;
import com.superflousjazzhands.fraserapido.api.DataSource;
import com.superflousjazzhands.fraserapido.api.model.Frase;

import java.util.ArrayList;

/**
 * Created by antoniocarella on 11/10/15.
 */
public class SearchResultsAdapter extends RecyclerView.Adapter<SearchResultsAdapter.ViewHolder> {
    private ArrayList<Frase> mDataset;

    public SearchResultsAdapter(ArrayList<Frase> dataSet){
        mDataset = dataSet;
    }

    @Override
    public SearchResultsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.frase_cell_layout, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position){
        DataSource dataSource = FraseRapidoApplication.getSharedDataSource();
        viewHolder.update(dataSource.getFrases().get(position));
    }

    @Override
    public int getItemCount(){
        return FraseRapidoApplication.getSharedDataSource().getFrases().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageButton imageButton;

        public ViewHolder(View view) {

            super(view);
            textView = (TextView) view.findViewById(R.id.frase_tv);
            imageButton = (ImageButton) view.findViewById(R.id.frase_star_button);

        }

        public void update(Frase frase){
            textView.setText(frase.getPortugueseFrase());

        }
    }
}
