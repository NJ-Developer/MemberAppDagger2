package com.androidtutz.anushka.memberapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MemberDataModule {
    @Provides
    @Singleton
    MemberDataManager providesMember(){
        return new MemberDataManager();
    }

}
