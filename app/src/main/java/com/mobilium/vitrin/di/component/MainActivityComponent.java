package com.mobilium.vitrin.di.component;

import android.content.Context;
import com.mobilium.vitrin.di.module.MainActivityContextModule;
import com.mobilium.vitrin.di.qualifier.ActivityContext;
import com.mobilium.vitrin.di.scopes.ActivityScope;
import com.mobilium.vitrin.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = {MainActivityContextModule.class}, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
