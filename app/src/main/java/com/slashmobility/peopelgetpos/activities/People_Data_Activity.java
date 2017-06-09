package com.slashmobility.peopelgetpos.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.slashmobility.peopelgetpos.R;

import static com.slashmobility.peopelgetpos.R.layout.activity_people_data;

public class People_Data_Activity extends AppCompatActivity {

    TextView mViewId;
    TextView mViewCi;
    TextView mViewName;
    TextView mViewDate;
    TextView mViewLn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_people_data);

        Bundle datos = getIntent().getExtras();
        mViewId = (TextView)findViewById(R.id.viewId);
        mViewId.setText(datos.getString("viewIdKey"));
        mViewName = (TextView)findViewById(R.id.viewName);
        mViewName.setText(datos.getString("viewNameKey"));

     /*   if(datos!=null){ viewNameKey

            viewId = (TextView)findViewById(R.id.viewId);
            viewname = (TextView)findViewById(R.id.viewName);
            viewLn = (TextView)findViewById(R.id.viewLn);
            viewCi = (TextView)findViewById(R.id.viewCi);
            viewDate = (TextView)findViewById(R.id.viewDate);

            viewId.setText(datos.getString("viewId"));
            viewname.setText(datos.getString("viewname"));
            viewLn.setText(datos.getString("viewLn"));
            viewCi.setText(datos.getString("viewCi"));
            viewDate.setText(datos.getString("viewDate"));
            viewId.setText(datos.getString("viewId"));

        }
*/

    }
}
