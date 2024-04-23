package com.aliya.refresh;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("loadMinibarItems.php?user_id=1")
    Call<List<Product>> loadProducts();

}