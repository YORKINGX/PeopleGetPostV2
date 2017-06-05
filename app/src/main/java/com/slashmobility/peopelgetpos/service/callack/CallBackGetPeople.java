package com.slashmobility.peopelgetpos.service.callack;

import com.google.gson.JsonObject;
import com.slashmobility.peopelgetpos.model.PeopleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 04/06/2017.
 */

public interface CallBackGetPeople {

    void onSuccess(JsonObject ListPeople);
    void onError(String msgError, int indError);
}
