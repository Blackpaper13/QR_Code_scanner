package com.example.qr_code_scanner.retrofit;

import com.google.gson.annotations.SerializedName;

public class GetDataDAO {

    @SerializedName("kodeat")
    private String kodeat;
    @SerializedName("namaat")
    private String namaat;
    @SerializedName("kategoriat")
    private String kategoriat;
    @SerializedName("lokasitoko")
    private String lokasiat;
    @SerializedName("lokasicabang")
    private String lokasicabang;
    @SerializedName("pemilikat")
    private String pemilikat;
    @SerializedName("nomorseri")
    private String nomorseri;
    @SerializedName("warranty_date")
    private String warranty_date;
    @SerializedName("statusgaransi")
    private String statusgaransi;
    @SerializedName("lastupdate")
    private String lastupdate;
    @SerializedName("selisih")
    private String selisih;

   public GetDataDAO(String kodeat, String namaat, String kategoriat, String lokasiat, String lokasicabang,
                  String pemilikat, String nomorseri, String warranty_date, String statusgaransi, String lastupdate
                    , String selisih){

       this.kodeat = kodeat;
       this.namaat = namaat;
       this.kategoriat=kategoriat;
       this.lokasiat=lokasiat;
       this.lokasicabang=lokasicabang;
       this.pemilikat=pemilikat;
       this.nomorseri=nomorseri;
       this.warranty_date=warranty_date;
       this.statusgaransi=statusgaransi;
       this.lastupdate=lastupdate;
       this.selisih=selisih;
   }

   public String getKodeat(){
       return kodeat;
   }

    public void setKodeat(String kodeat) {
        this.kodeat = kodeat;
    }

    public String getNamaat() {
        return namaat;
    }

    public void setNamaat(String namaat) {
        this.namaat = namaat;
    }

    public String getKategoriat() {
        return kategoriat;
    }

    public void setKategoriat(String kategoriat) {
        this.kategoriat = kategoriat;
    }

    public String getLokasiat() {
        return lokasiat;
    }

    public void setLokasiat(String lokasiat) {
        this.lokasiat = lokasiat;
    }

    public String getLokasicabang() {
        return lokasicabang;
    }

    public void setLokasicabang(String lokasicabang) {
        this.lokasicabang = lokasicabang;
    }

    public String getPemilikat() {
        return pemilikat;
    }

    public void setPemilikat(String pemilikat) {
        this.pemilikat = pemilikat;
    }

    public String getNomorseri() {
        return nomorseri;
    }

    public void setNomorseri(String nomorseri) {
        this.nomorseri = nomorseri;
    }

    public String getStatusgaransi() {
        return statusgaransi;
    }

    public void setStatusgaransi(String statusgaransi) {
        this.statusgaransi = statusgaransi;
    }

    public String getWarranty_date() {
        return warranty_date;
    }

    public void setWarranty_date(String warranty_date) {
        this.warranty_date = warranty_date;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getSelisih() {
        return selisih;
    }

    public void setSelisih(String selisih) {
        this.selisih = selisih;
    }
}
