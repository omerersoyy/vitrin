package com.mobilium.vitrin.di.module;

import android.content.Context;

import com.mobilium.vitrin.ui.MainActivity;

import dagger.Module;
import dagger.Provides;
import com.mobilium.vitrin.di.qualifier.ActivityContext;
import com.mobilium.vitrin.di.scopes.ActivityScope;

import javax.inject.Inject;

@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;

    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }

}
