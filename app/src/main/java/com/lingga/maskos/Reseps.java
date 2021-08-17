package com.lingga.maskos;

public class Reseps {
    
    private String NamaResep;
    private String BahanResep;
    private String JudulMetodeResep;
    private String PembuatanResep;
    private int Thumbnail;

    public Reseps(String namaResep, String bahanResep, String judulMetodeResep, String pembuatanResep, int thumbnail) {

        NamaResep = namaResep;
        BahanResep = bahanResep;
        JudulMetodeResep = judulMetodeResep;
        PembuatanResep = pembuatanResep;
        Thumbnail = thumbnail;

    }


    public String getNamaResep() {

        return NamaResep;
    }

    public String getBahanResep() {

        return BahanResep;
    }

    public String getJudulMetodeResep() {

        return JudulMetodeResep;
    }

    public String getPembuatanResep() {

        return PembuatanResep;
    }

    public int getThumbnail() {

        return Thumbnail;
    }

}
