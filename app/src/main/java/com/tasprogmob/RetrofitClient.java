package com.tasprogmob;

import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient retrofit;
    public static final String BASE_URL = "https://kpsi.fti.ukdw.ac.id/" ;

        //design patern singleton
        public static RetrofitClient getRetrofitInstance()
        {
            if (retrofit==null)
            {
                retrofit = new RetrofitClient.Build()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            }
            return retrofit;
        }
}
