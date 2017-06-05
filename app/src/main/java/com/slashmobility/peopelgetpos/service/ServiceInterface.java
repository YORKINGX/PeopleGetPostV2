package com.slashmobility.peopelgetpos.service;

import com.google.gson.JsonObject;
import com.slashmobility.peopelgetpos.model.PeopleModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrador on 03/06/2017.
 */

public interface ServiceInterface {


    @GET("usuario.json")
    Call<JsonObject> getPeopleList();
/*
    @POST("usuario.json")
    Call<JsonObject> createPeople(@Body PeopleModel person);*/


}

