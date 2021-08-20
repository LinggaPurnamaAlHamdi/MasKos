package com.lingga.maskos;

public class Reseps {

    // DEKLARASI PROPERTY YANG AKAN DISIMPAN
    private String NamaResep;
    private String BahanResep;
    private String JudulMetodeResep;
    private String PembuatanResep;
    private int Thumbnail;

    // MEMBUAT CONSTRUCTOR CLASS RESEPS DENGAN PARAMETER YANG SAMA DENGAN DEKLARASI PROPERTY
    public Reseps(String namaResep, String bahanResep, String judulMetodeResep, String pembuatanResep, int thumbnail) {

        // MENYIMPAN PARAMETER KEDALAM DEKLARASI PROPERTY
        NamaResep = namaResep;
        BahanResep = bahanResep;
        JudulMetodeResep = judulMetodeResep;
        PembuatanResep = pembuatanResep;
        Thumbnail = thumbnail;

    }

    //  METHOD UNTUK MENGAMBIL NILAI NILAI DI PROPERTY
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
