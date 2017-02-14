package com.shamsid.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.SignatureType;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);

    String baseUrl = "http://bigdayshout.party/wp-json/wc/v1/";
    String clientKey = "ck_378b27344404e80a472e68fc7a8213f1cb4c67b3123";
    String clientSecret = "cs_8f54b2e3ffb3481873a54c1145736b925ce900598123";
    OAuthInterceptor oauth1Woocommerce = new OAuthInterceptor.Builder()
        .consumerKey(clientKey)
        .consumerSecret(clientSecret)
        .build();

    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client = new OkHttpClient.Builder()
        .connectTimeout(20, TimeUnit.SECONDS)
        .writeTimeout(20, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .addInterceptor(oauth1Woocommerce)// Interceptor oauth1Woocommerce added
        .build();

    Retrofit mRetrofit = new Retrofit.Builder()
        .baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build();

    WoocommerceService woocommerceService = mRetrofit.create (WoocommerceService.class);
    Call<List<Test>> call =
        woocommerceService.getProduct ("products");
    call.enqueue (new Callback<List<Test>> () {
      @Override public void onResponse (Call<List<Test>> call, retrofit2.Response<List<Test>> response) {
        Log.v ("status",response.body ().get (1).getUsername ());
      }

      @Override public void onFailure (Call<List<Test>> call, Throwable t) {
        t.printStackTrace ();
      }
    });

  }
}
