package com.mobilium.vitrin.di.component;

import android.content.Context;

import com.mobilium.vitrin.di.MainApplication;
import com.mobilium.vitrin.service.Requests;
import dagger.Component;

import com.mobilium.vitrin.di.module.ContextModule;
import com.mobilium.vitrin.di.module.RetrofitModule;
import com.mobilium.vitrin.di.qualifier.ApplicationContext;
import com.mobilium.vitrin.di.scopes.ApplicationScope;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    public Requests getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MainApplication mainApplication);
}
