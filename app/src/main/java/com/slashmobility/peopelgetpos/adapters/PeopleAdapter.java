package com.slashmobility.peopelgetpos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

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
        holder.idPeople.setText(String.valueOf(peopleModelArrayList.get(position).getId()));
        holder.iduserdni.setText(String.valueOf(peopleModelArrayList.get(position).getCedula()));
        holder.idName.setText(peopleModelArrayList.get(position).getName());
        holder.idlastname.setText(peopleModelArrayList.get(position).getApellido());
        holder.idDirthdate.setText(peopleModelArrayList.get(position).getFecha_nacimiento());
    }

    @Override
    public int getItemCount() {
        return peopleModelArrayList.size();
    }

    public class PeopleAvilableViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.id_id)EditText idPeople;
        @BindView(R.id.iddni) EditText iduserdni;
        @BindView(R.id.idbirthdate) EditText idDirthdate;
        @BindView(R.id.idtextname) EditText idName;
        @BindView(R.id.idtextapellido) EditText idlastname;



        View itemView;
        public PeopleAvilableViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
            this.itemView = itemView;
        }
    }

}