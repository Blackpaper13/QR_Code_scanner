package com.example.qr_code_scanner.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {
    @SerializedName("data")
    @Expose
    private List<GetDataDAO> info = null;

    @SerializedName("message")
    @Expose
    private String message;

    public List<GetDataDAO> getInfo() {return info;}

    public String getMessage() {return message;}

    public void setInfo(List<GetDataDAO> info) {
        this.info = info;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
