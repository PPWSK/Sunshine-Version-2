package com.example.android.sunshine.app;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by vadim on 03/03/2015.
 */
public class DebugApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build()
        );
    }
}
