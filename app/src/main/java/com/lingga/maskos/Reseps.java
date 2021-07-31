package com.lingga.maskos;

public class Reseps {
    
    private String NamaResep;
    private String BahanResep;
    private String JudulResep;
    private String PembuatanResep;
    private int Thumbnail;

    public Reseps(String namaResep, String bahanResep, String judulResep, String pembuatanResep, int thumbnail) {

        NamaResep = namaResep;
        BahanResep = bahanResep;
        JudulResep = judulResep;
        PembuatanResep = pembuatanResep;
        Thumbnail = thumbnail;

    }


    public String getNamaResep() {

        return NamaResep;
    }

    public String getBahanResep() {

        return BahanResep;
    }

    public String getJudulResep() {

        return JudulResep;
    }

    public String getPembuatanResep() {

        return PembuatanResep;
    }

    public int getThumbnail() {

        return Thumbnail;
    }

}
