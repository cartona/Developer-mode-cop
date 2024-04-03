package com.cartona.plugins.dcop;

import android.util.Log;
import android.content.Context;
import android.provider.Settings;
public class DeveloperModeCop {
    private Context context;

    public DeveloperModeCop(Context context) {
        this.context = context;
    }

    public boolean isDeveloperModeEnabled() {
        int devOptions = 0;
        try {
            devOptions = Settings.Secure.getInt(context.getContentResolver(),Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        } catch (Exception e) {
            Log.e("DeveloperModeCop", "Setting not found", e);
        }
        return devOptions == 1;
    }
}
