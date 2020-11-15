package com.mobilium.vitrin.di.module;


import com.mobilium.vitrin.service.Requests;
import dagger.Module;
import dagger.Provides;
import com.mobilium.vitrin.di.scopes.ApplicationScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {

    @Provides
    @ApplicationScope
    Requests getApiInterface(Retrofit retroFit) {
        return retroFit.create(Requests.class);
    }

    @Provides
    @ApplicationScope
    Retrofit getRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("https://www.vitrinova.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }


    @Provides
    @ApplicationScope
    OkHttpClient getOkHttpCleint() {
        return new OkHttpClient.Builder()
                .build();
    }
}