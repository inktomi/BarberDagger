package com.mattruno.testdaggerbarber;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = { MainActivity.class }
)
@SuppressWarnings("unused")
public class ServiceModule {

    @Provides
    @Singleton
    Widget provideTestWidget() {
        return new Widget();
    }
}