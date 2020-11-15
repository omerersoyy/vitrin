package com.mobilium.vitrin.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import com.mobilium.vitrin.R;
import com.mobilium.vitrin.service.Client;
import com.mobilium.vitrin.service.Requests;
import com.mobilium.vitrin.di.MainApplication;
import com.mobilium.vitrin.di.component.ApplicationComponent;
import com.mobilium.vitrin.di.component.DaggerMainActivityComponent;
import com.mobilium.vitrin.di.component.MainActivityComponent;
import com.mobilium.vitrin.di.module.MainActivityContextModule;
import com.mobilium.vitrin.pojos.Result;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    MainActivityComponent mainActivityComponent;

    @Inject
    public Requests apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationComponent applicationComponent = MainApplication.get(this).getApplicationComponent();
        mainActivityComponent = DaggerMainActivityComponent.builder()
                .mainActivityContextModule(new MainActivityContextModule(this))
                .applicationComponent(applicationComponent)
                .build();

        mainActivityComponent.injectMainActivity(this);

        apiInterface.getDiscover().enqueue(new Callback<List<Result>>() {

            @Override
            public void onResponse(Call<List<Result>> call, retrofit2.Response<List<Result>> result) {

            }

            @Override
            public void onFailure(Call<List<Result>> call, Throwable t) {
            }
        });

    }
}
