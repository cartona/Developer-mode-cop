package com.cartona.plugins.dcop;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;


@CapacitorPlugin(name = "DeveloperModeCop")
public class DeveloperModeCopPlugin extends Plugin {

    private DeveloperModeCop developerModeCop;

    @Override
    public void load() {
        developerModeCop = new DeveloperModeCop(getContext());
    }

    @PluginMethod()
    public void isDeveloperModeEnabled(PluginCall call) {
        boolean isEnabled = developerModeCop.isDeveloperModeEnabled();
        JSObject ret = new JSObject();
        ret.put("isEnabled", isEnabled);
        call.success(ret);
    }
}
