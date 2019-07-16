package camdev.sothoeun.asia.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import camdev.sothoeun.asia.retrofitdemo.model.Category;
import camdev.sothoeun.asia.retrofitdemo.model.respone.Respone;
import camdev.sothoeun.asia.retrofitdemo.service.CategoryService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    BasicAuthenticationService basicAuthenticationService;
    CategoryService categoryService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       categoryService = basicAuthenticationService.createService(CategoryService.class);

       //request to server
        Call<Respone> call = categoryService.getCategory();
        call.enqueue(new Callback<Respone>() {
            @Override
            public void onResponse(Call<Respone> call, Response<Respone> response) {
                List<Category> categories = response.body().getCategories();
                Log.e("1111",""+categories.toString());
            }

            @Override
            public void onFailure(Call<Respone> call, Throwable t) {
                Log.e("1111",""+t.toString());
            }
        });


    }
}
