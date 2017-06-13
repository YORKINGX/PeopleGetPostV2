package com.slashmobility.peopelgetpos.activities;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
   private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(toolbar);

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

    @Override
    public boolean  onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_example_activity,menu);
        return  true;


    }

    public void ejecutar_class_inf(View v){

         Intent intenInf = new Intent(this,RegisterActivity.class);
         startActivity(intenInf);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem option_item) {

        int opcionMenu = option_item.getItemId();

        if (opcionMenu == R.id.idInfo)
        {
            return  true;

        }

        if(opcionMenu == R.id.idConf){

           ejecutar_class_inf(null);
            return true;
        }

        return super.onOptionsItemSelected(option_item);

    }
}
