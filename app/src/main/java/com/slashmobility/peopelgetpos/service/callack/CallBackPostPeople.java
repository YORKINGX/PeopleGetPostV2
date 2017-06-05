package com.slashmobility.peopelgetpos.service.callack;

import com.google.gson.JsonObject;

/**
 * Created by Administrador on 03/06/2017.
 */

public interface CallBackPostPeople {
    void onSuccess(JsonObject jsonObject);
    void onError(String msgError, int indError);
}
