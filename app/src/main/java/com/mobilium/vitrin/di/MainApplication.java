package com.mobilium.vitrin.di;

import android.app.Activity;
import android.app.Application;

import com.mobilium.vitrin.di.component.ApplicationComponent;
import com.mobilium.vitrin.di.component.DaggerApplicationComponent;
import com.mobilium.vitrin.di.module.ContextModule;

public class MainApplication extends Application {
    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);

    }

    public static MainApplication get(Activity activity){
        return (MainApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
