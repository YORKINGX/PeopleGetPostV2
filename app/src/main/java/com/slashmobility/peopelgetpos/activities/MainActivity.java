package com.slashmobility.peopelgetpos.activities;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.slashmobility.peopelgetpos.R;
import com.slashmobility.peopelgetpos.adapters.PeopleAdapter;
import com.slashmobility.peopelgetpos.model.PeopleModel;
import com.slashmobility.peopelgetpos.service.ServiceManager;
import com.slashmobility.peopelgetpos.service.callack.CallBackGetPeople;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView view_reciler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_reciler =(RecyclerView) findViewById(R.id.people_recycler);
        LinearLayoutManager my_lienarlayout = new LinearLayoutManager(this);
        my_lienarlayout.setOrientation(LinearLayoutManager.VERTICAL);
        view_reciler.setLayoutManager(my_lienarlayout);

        ServiceManager.getPeople(new CallBackGetPeople() {
            @Override
            public void onSuccess(JsonObject ListPeople) {


            }

            @Override
            public void onError(String msgError, int indError) {

                Toast.makeText(MainActivity.this,msgError,Toast.LENGTH_LONG).show();
            }
        });

    /*   ServiceManager.getPeople(new CallBackGetPeople() {
           @Override
           public void onSuccess(List<PeopleModel> ListPeople) {
               PeopleAdapter peopleAdapter = new PeopleAdapter(getApplicationContext(),ListPeople);
               view_reciler.setAdapter(peopleAdapter);
           }

           @Override
           public void onError(String msgError, int indError) {
               Toast.makeText(MainActivity.this,msgError,Toast.LENGTH_LONG).show();

           }
       });*/


    }
}
