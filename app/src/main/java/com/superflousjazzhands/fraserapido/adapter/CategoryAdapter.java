package com.superflousjazzhands.fraserapido.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.superflousjazzhands.fraserapido.FraseRapidoApplication;
import com.superflousjazzhands.fraserapido.R;
import com.superflousjazzhands.fraserapido.api.DataSource;
import com.superflousjazzhands.fraserapido.api.model.Category;

/**
 * Created by antoniocarella on 11/12/15.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_cell, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position){
        DataSource dataSource = FraseRapidoApplication.getSharedDataSource();
        viewHolder.update(dataSource.getCategories().get(position));
    }

    @Override
    public int getItemCount(){
        return FraseRapidoApplication.getSharedDataSource().getCategories().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;

        public ViewHolder(View view){
            super(view);
            textView = (TextView) view.findViewById(R.id.category_tv);
        }

        public void update(Category category){
            textView.setText(category.getName());
        }
    }
}
