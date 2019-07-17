package camdev.sothoeun.asia.retrofitdemo.service;

import camdev.sothoeun.asia.retrofitdemo.model.respone.Respone;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CategoryService {
    @GET("/v1/api/categories")
    Call<Respone> getCategory();
}
