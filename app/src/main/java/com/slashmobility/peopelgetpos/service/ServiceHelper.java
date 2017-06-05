package com.slashmobility.peopelgetpos.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.slashmobility.peopelgetpos.service.constans.ClassConstans;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrador on 03/06/2017.
 */

public class ServiceHelper {
    private ServiceInterface serviceInterface;
    private Retrofit mRetrofit;
    public static ServiceHelper mInstance;

    public ServiceHelper() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(ClassConstans.URL_ENDPOINT)
                .build();
        serviceInterface = mRetrofit.create(ServiceInterface.class);

    }


    public static ServiceInterface getInstance(){
        if(mInstance == null)
            mInstance = new ServiceHelper();
        return mInstance.serviceInterface;
    }
}
