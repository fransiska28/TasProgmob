package com.tasprogmob;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface DataDosenServicee {
    @GET("/api/progmob/dosen/{nim_progmob}")
    Call<List<DataDosenn>> getDosenAll(@Path("nim_progmob")String nimProgmob);
    Call<List<DataDosenn>> insertDosen(@Path("nim_progmob")String nimProgmob);
    @FormUrlEncoded
    @POST("/api/progmob/dosen/(nim_progmob")
    Call<DefaultResult> insertDosen(@Field("nama") String nama,
                                    @Field("nidn") String nidn,
                                    @Field("alamat") String alamat,
                                    @Field("email") String email,
                                    @Field("gelar") String gelar,
                                    @Field("foto") String foto,
                                    @Field("nim_progmob") String nim_progmob);

    @POST("/api/progmob/dosen/updateDosen")
    Call<DefaultResult> updateDosen(@Field("id")String id,
                                    @Field("nama") String nama,
                                    @Field("nidn") String nidn,
                                    @Field("alamat") String alamat,
                                    @Field("email") String email,
                                    @Field("foto") String foto,
                                    @Field("nim_progmob") String nim_progmob);

    Call<DefaultResult> deleteDosen(@Field("id")String id,
                                    @Field("nim_progmob") String nim_progmob);

    Call<DefaultResult> insertDosenWithPhoto (@Field("nama")String nama,
                                              @Field("nidn") String nidn,
                                              @Field("alamat") String alamat,
                                              @Field("email") String email,
                                              @Field("gelar") String gelar,
                                              @Field("foto") String foto,
                                              @Field("nim_progmob") String nim_progmob);

}
