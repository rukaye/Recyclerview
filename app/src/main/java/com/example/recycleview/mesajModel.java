package com.example.recycleview;

import android.media.Image;

public class mesajModel {
    private String isim;
    private String mesaj;
    private int resimId;

    public mesajModel(String isim, String mesaj, int resimId) {
        this.isim = isim;
        this.mesaj = mesaj;
        this.resimId = resimId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }


}

