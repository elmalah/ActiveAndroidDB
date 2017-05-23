package sample.com.activeandroiddb;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by elmalah on 5/21/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Initializing Active Android
        ActiveAndroid.initialize(this);
    }
}
