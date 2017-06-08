package com.slashmobility.peopelgetpos.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.slashmobility.peopelgetpos.R;

public class People_Data_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_data);
        String id;
        Bundle datos = this.getIntent().getExtras();

      //  Intent intent = getIntent();
        if(datos!=null){

            id  = datos.getString(String.valueOf("viewId"));
           // Toast.makeText(this, "Diste Click en la posiciòn:" + message, Toast.LENGTH_SHORT).show();

        }


    }
}
