package com.sh.antidebugger;

import android.app.Application;
import android.content.Context;
import android.os.Debug;
import android.os.Process;

import java.io.File;

public class App extends Application {
    static {
        System.loadLibrary("check");
    }

    protected void attachBaseContext(Context arg1) {
        super.attachBaseContext(arg1);
    }

    public void onCreate() {
        super.onCreate();

        // 多进程保护
//        checkDebugger();

    }

    private native int checkDebugger();
}
