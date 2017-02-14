package com.shamsid.retrofitexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by shamsheR on 14/02/17.
 */

public interface WoocommerceService {
  @GET("{product}") Call<List<Test>> getProduct(@Path("product") String type);
}
