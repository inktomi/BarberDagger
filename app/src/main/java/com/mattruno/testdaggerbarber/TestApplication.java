package com.mattruno.testdaggerbarber;

import dagger.ObjectGraph;

/**
 * Created by mattruno on 3/9/15.
 */
public class TestApplication extends android.app.Application {

    private static ObjectGraph sObjectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        sObjectGraph = ObjectGraph.create(new ServiceModule());
    }

    @SuppressWarnings("unchecked")
    public static <T> T get(T type){
        return (T) sObjectGraph.get(type.getClass());
    }

    public static void inject(Object target){
        sObjectGraph.inject(target);
    }

    public ObjectGraph getObjectGraph(){
        return sObjectGraph;
    }
}
