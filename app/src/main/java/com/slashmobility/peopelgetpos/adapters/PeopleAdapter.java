package com.slashmobility.peopelgetpos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.slashmobility.peopelgetpos.R;
import com.slashmobility.peopelgetpos.model.PeopleModel;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrador on 03/06/2017.
 */

public class PeopleAdapter  extends RecyclerView.Adapter<PeopleAdapter.PeopleAvilableViewHolder> {

    Context mContext;
    ArrayList<PeopleModel> peopleModelArrayList;

    public PeopleAdapter(Context mContext, ArrayList<PeopleModel> peopleModelArrayList) {
        this.mContext = mContext;
        this.peopleModelArrayList = peopleModelArrayList;
    }

    public PeopleAdapter() {
    }

    @Override
    public PeopleAvilableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
           View view_people = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_person_adapter,parent,false);
           PeopleAdapter.PeopleAvilableViewHolder vh_person = new PeopleAdapter.PeopleAvilableViewHolder(view_people);
           return vh_person;
    }

    @Override
    public void onBindViewHolder(PeopleAvilableViewHolder holder, int position) {


        holder.viewId.setText(String.valueOf(peopleModelArrayList.get(position).getId()));
        holder.viewCi.setText(String.valueOf(peopleModelArrayList.get(position).getCedula()));
        holder.viewname.setText(peopleModelArrayList.get(position).getName());
        holder.viewLn.setText(peopleModelArrayList.get(position).getApellido());
        holder.viewDate.setText(peopleModelArrayList.get(position).getFecha_nacimiento());
    }

    @Override
    public int getItemCount() {
        return peopleModelArrayList.size();
    }

    public class PeopleAvilableViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.viewId)TextView viewId;
        @BindView(R.id.viewCi) TextView viewCi;
        @BindView(R.id.viewname) TextView viewname;
        @BindView(R.id.viewDate) TextView viewDate;
        @BindView(R.id.viewLn) TextView viewLn;



        View itemView;
        public PeopleAvilableViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
            this.itemView = itemView;
        }
    }

}