package com.slashmobility.peopelgetpos.activities;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.slashmobility.peopelgetpos.R;
import com.slashmobility.peopelgetpos.adapters.PeopleAdapter;
import com.slashmobility.peopelgetpos.model.PeopleModel;
import com.slashmobility.peopelgetpos.service.ServiceManager;
import com.slashmobility.peopelgetpos.service.callack.CallBackGetPeople;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    RecyclerView view_reciler;
    ArrayList<PeopleModel> arrayListPeople = new ArrayList<PeopleModel>();


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

              JsonObject jsonObject = ListPeople;
              Gson gson = new Gson();
              for (Map.Entry<String,JsonElement> entry : jsonObject.entrySet()){
                  PeopleModel peopleModel = new PeopleModel();
                  peopleModel = gson.fromJson(entry.getValue(), PeopleModel.class);
                  arrayListPeople.add(peopleModel);

              }
              PeopleAdapter mAdapterPeople = new PeopleAdapter(MainActivity.this,arrayListPeople);
              view_reciler.setAdapter(mAdapterPeople);
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
