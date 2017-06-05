package com.slashmobility.peopelgetpos.service;

import android.util.Log;

import com.google.gson.JsonObject;
import com.slashmobility.peopelgetpos.model.PeopleModel;
import com.slashmobility.peopelgetpos.service.callack.CallBackGetPeople;
import com.slashmobility.peopelgetpos.service.callack.CallBackPostPeople;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrador on 03/06/2017.
 */

public class ServiceManager {

    public static void getPeople(final CallBackGetPeople callBackGetPeople) {

        ServiceInterface serviceInterface = ServiceHelper.getInstance();
        //final ArrayList<PeopleModel> arrayListPeople =  new ArrayList<PeopleModel>();
        final JsonObject[] jsonObjectListPeople = {new JsonObject()};

        serviceInterface.getPeopleList().enqueue(new Callback<JsonObject>() {

          @Override
          public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
              if (response.body() != null && response.body().size() > 0) {
                  callBackGetPeople.onSuccess(response.body());
              }

          }
           @Override
          public void onFailure(Call<JsonObject> call, Throwable t) {

               callBackGetPeople.onError("Error en al invocar al Servicio", 1);

           }
        });}



    /*    serviceInterface.getPeopleList().enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<List<PeopleModel>> call, Response<List<PeopleModel>> listResponse) {

                if (listResponse.body() != null && listResponse.body().size() > 0) {
                    callBackGetPeople.onSuccess(listResponse.body());
                }
            }

            @Override
            public void onFailure(Call<List<PeopleModel>> call, Throwable t) {

                callBackGetPeople.onError("Error en al invocar al Servicio", 1);
            }
        });
    }

*/


        //final CallBackUserModelDataList callBackUserModel
  //  }

/*    public static void createPerson(PeopleModel people, final CallBackPostPeople callBackPostPeople)
    {
        Log.d("Servocmanager","aqui entro en CreatePerson");
        ServiceInterface serviceInterface = ServiceHelper.getInstance();
        final JsonObject[] jsonObject = {new JsonObject()};
        serviceInterface.createPeople(people).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                jsonObject[0] = response.body();
                callBackPostPeople.onSuccess(jsonObject[0]);
                Log.d("Servocmanager","entro en el response de createperson");
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

                callBackPostPeople.onError("Error al Crear", 5);
                Log.e("Servocmanager","fallo");
            }
        });




        //final CallBackUserModelDataList callBackUserModel
    }
    */
}
