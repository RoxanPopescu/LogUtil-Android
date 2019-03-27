package test.rox.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "Super_Awesome_App";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
