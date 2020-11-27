package sdk.chat.testapp;

import android.app.Application;

import sdk.chat.app.firebase.ChatSDKFirebase;
import sdk.chat.core.session.ChatSDK;

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            ChatSDKFirebase.quickStart(this, "pre_1", "aaa", true);
            //ChatSDK.config().setIdenticonBaseURL()
        } catch (Exception e) {
            e.printStackTrace();
        }

        //ChatSDK.ui().startSplashScreenActivity(this);
    }
}
