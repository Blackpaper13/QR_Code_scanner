package com.example.qr_code_scanner.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetDataServices {
    @GET("data/{kodeat}")
    Call<DataResponse> getInfoByKodeAT(@Path("kodeat") String kodeat,
                                        @Query("data") String data);
}
