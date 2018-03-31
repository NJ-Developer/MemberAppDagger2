package com.androidtutz.navjot.memberapp;

import android.app.Application;

/**
 * @author Navjot
 */
public class App extends Application {
    private MemberAppComponent memberAppComponent;
    private static  App app;
    public MemberAppComponent getMemberAppComponent() {
        return memberAppComponent;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        memberAppComponent = DaggerMemberAppComponent.builder().
                             memberDataModule(new MemberDataModule())
                             .build();

    }

    public static App getApp() {
        return app;
    }
}
