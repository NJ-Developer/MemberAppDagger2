package com.androidtutz.navjot.memberapp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MemberDataModule.class)
public interface MemberAppComponent {
    void inject(MainActivity mainActivity);
}
