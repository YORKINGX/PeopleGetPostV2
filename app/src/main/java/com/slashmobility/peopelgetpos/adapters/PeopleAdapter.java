package com.slashmobility.peopelgetpos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.slashmobility.peopelgetpos.R;
import com.slashmobility.peopelgetpos.model.PeopleModel;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrador on 03/06/2017.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PersonAvilableViewHolder> {

    Context mContext;
    ArrayList<PeopleModel> peopleModelArrayList;

    public PeopleAdapter(Context mContext, ArrayList<PeopleModel> peopleModelArrayList) {
        this.mContext = mContext;
        this.peopleModelArrayList = peopleModelArrayList;
    }

    public PeopleAdapter() {
    }

    @Override
    public PersonAvilableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view_people = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_person_adapter, parent, false);
        PeopleAdapter.PersonAvilableViewHolder people_vh = new PeopleAdapter.PersonAvilableViewHolder(view_people);
        return people_vh;

    }

    @Override
    public void onBindViewHolder(PersonAvilableViewHolder holder, final int position) {
        holder.idPeople.setText(String.valueOf(peopleModelArrayList.get(position).getId()));
        holder.iduserdni.setText(String.valueOf(peopleModelArrayList.get(position).getCedula()));
        holder.idName.setText(peopleModelArrayList.get(position).getName());
        holder.idlastname.setText(peopleModelArrayList.get(position).getApellido());
        holder.idDirthdate.setText(peopleModelArrayList.get(position).getFecha_nacimiento());
    //    Picasso.with(mContext).load("https://logodownload.org/wp-content/uploads/2015/04/Whatsapp-logo-vetor-2.png").into(holder.midImage);
      /*  holder.midImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, Segundo_Activity.class);
                intent.putExtra("parametro", String.valueOf(position));
                mContext.startActivity(intent);


            }
        });*/
    }

    @Override
    public int getItemCount() {
        return peopleModelArrayList.size();
    }

    public class PersonAvilableViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.id_id)EditText idPeople;
        @BindView(R.id.iddni) EditText iduserdni;
        @BindView(R.id.idbirthdate) EditText idDirthdate;
        @BindView(R.id.idtextname) EditText idName;
        @BindView(R.id.idtextapellido) EditText idlastname;



        View itemView;
        public PersonAvilableViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
            this.itemView = itemView;
        }
    }



}
