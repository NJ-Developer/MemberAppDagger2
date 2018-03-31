package com.androidtutz.navjot.memberapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Navjot
 */
@Module
public class MemberDataModule {
    @Provides
    @Singleton
    MemberDataManager providesMember(){
        return new MemberDataManager();
    }

}
