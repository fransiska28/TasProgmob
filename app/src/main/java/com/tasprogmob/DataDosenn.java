package com.tasprogmob;

import com.google.gson.annotations.SerializedName;

public class DataDosenn {

    @SerializedName("id")
    private  int id;

    @SerializedName("nama")
    private String nama;

    @SerializedName("nidn")
    private String nidn;

    @SerializedName("alamat")
    private String alamat;

    @SerializedName("gelar")
    private String gelar;

    @SerializedName("foto")
    private String foto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
