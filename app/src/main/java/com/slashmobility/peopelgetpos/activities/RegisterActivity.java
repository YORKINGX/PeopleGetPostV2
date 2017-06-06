package com.slashmobility.peopelgetpos.activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.slashmobility.peopelgetpos.model.PeopleModel;
import com.slashmobility.peopelgetpos.utils.Utils;
import com.slashmobility.peopelgetpos.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.slashmobility.peopelgetpos.utils.Utils;

import static com.slashmobility.peopelgetpos.R.layout.activity_register;

public class RegisterActivity extends BaseActivity {

    @BindView(R.id.textId)
    EditText getTextId;
    @BindView(R.id.textDni)
    EditText mgetTextDni;
    @BindView(R.id.textBirthdate)
    EditText getTextBirthdate;
    @BindView(R.id.textName)
    EditText getTextName;
    @BindView(R.id.textLasName)
    EditText getLastName;
    @BindView(R.id.btnDone)
    Button mbtnDone;
    @BindView(R.id.btnCancel)
    Button mbtnCancel;

    PeopleModel peopleModel = new PeopleModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_register);
        ButterKnife.bind(this);

        //   configViews();
        // initListeners();


    }
}
