package com.cartona.plugins.dcop;

import android.util.Log;

public class DeveloperModeCop {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
