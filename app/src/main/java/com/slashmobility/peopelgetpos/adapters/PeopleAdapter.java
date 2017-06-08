package com.slashmobility.peopelgetpos.adapters;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.slashmobility.peopelgetpos.R;
import com.slashmobility.peopelgetpos.activities.MainActivity;
import com.slashmobility.peopelgetpos.activities.People_Data_Activity;
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
    public void onBindViewHolder(PeopleAvilableViewHolder holder, final int position) {
        holder.viewId.setText(String.valueOf(peopleModelArrayList.get(position).getId()));
        holder.viewCi.setText(String.valueOf(peopleModelArrayList.get(position).getCedula()));
        holder.viewname.setText(peopleModelArrayList.get(position).getName());
        holder.viewLn.setText(peopleModelArrayList.get(position).getApellido());
        holder.viewDate.setText(peopleModelArrayList.get(position).getFecha_nacimiento());

        holder.viewname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle =new Bundle();
             //   bundle.putString("viewId",String.valueOf(peopleModelArrayList.get(position).getId()));
             //   bundle.putString("viewCi",String.valueOf(peopleModelArrayList.get(position).getCedula()));
                bundle.putString("viewName",peopleModelArrayList.get(position).getName());
                bundle.putString("viewLn",peopleModelArrayList.get(position).getApellido());
                bundle.putString("vieDate",peopleModelArrayList.get(position).getFecha_nacimiento());

                ((MainActivity) mContext).openActivity(People_Data_Activity.class,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return peopleModelArrayList.size();
    }

    public class PeopleAvilableViewHolder extends RecyclerView.ViewHolder {

        /*@BindView(R.id.viewId)TextView viewId;
        @BindView(R.id.viewCi) TextView viewCi;
        @BindView(R.id.viewname) TextView viewname;
        @BindView(R.id.viewDate) TextView viewDate;
        @BindView(R.id.viewLn) TextView viewLn;*/

        TextView viewId;
        TextView viewCi;
        TextView viewname;
        TextView viewDate;
        TextView viewLn;



        View itemView;
        public PeopleAvilableViewHolder(View itemView) {

           super(itemView);
           // ButterKnife.bind(this, itemView);
           this.itemView = itemView;
            viewId =(TextView) itemView.findViewById(R.id.viewId);
            viewCi =(TextView) itemView.findViewById(R.id.viewCi);
            viewname =(TextView) itemView.findViewById(R.id.viewname);
            viewDate =(TextView) itemView.findViewById(R.id.viewDate);
            viewLn =(TextView) itemView.findViewById(R.id.viewLn);

        }
    }

}