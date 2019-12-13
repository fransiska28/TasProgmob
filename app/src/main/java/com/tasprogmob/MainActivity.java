package com.tasprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    DataDosenServicee servicee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        servicee = RetrofitClient.getRetrofitInstance()
                .create(DataDosenServicee.class);
        getAllDosen();
        insertDosen();
    }
    private boolean checkPermission()
    {
        int result = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    private void getAllDosen() {
        Call<List<DataDosenn>> call = servicee.getDosenAll("1");
        call.enqueue(new Callback<List<DataDosenn>>() {
            @Override
            public void onResponse(Call<List<DataDosenn>> call, Response<List<DataDosenn>> response) {
                for (DataDosenn dataDosenn : response.body()) {
                    // System.out.println("Nama : "+dataDosen.getNama());
                    // System.out.println("Nidn : "+dataDosen.getNidn());
                }
            }

            @Override
            public void onFailure(Call<List<DataDosenn>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something wrong...",
                        Toast.LENGTH_LONG).show();
                System.out.println(t.getMessage());
            }

        });
    }

    private void insertDosen(){
        Call<DefaultResult> call = servicee.insertDosen("argo", "0516118902","godean",
                "argo@staff.ukdw.ac.id", "S.T., M.Eng", "7216002-2019-11-02.jpg", "72170158");
        call.enqueue(new Callback<DefaultResult>() {
            @Override
            public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                System.out.println(response.body().getStatus());
            }

    private void updateDosen() {

    }
}
