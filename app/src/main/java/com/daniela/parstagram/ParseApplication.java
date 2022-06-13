package com.daniela.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nCfnM6OHVwdc1bcjpxkUq6Q8gX26jDzU6KlqSsTj")
                .clientKey("4wi1941qVtRi5xDCNKLcLD5iI0IrfSCoDhJETv86")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
