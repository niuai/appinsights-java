package com.example.demo.configuration;

import com.microsoft.applicationinsights.telemetry.Telemetry;
import com.microsoft.applicationinsights.web.extensibility.initializers.WebTelemetryInitializerBase;

public class CloudRoleNameInitializer extends WebTelemetryInitializerBase {

    @Override
    protected void onInitializeTelemetry(Telemetry telemetry) {
        String computerName = System.getenv().get("COMPUTERNAME");

        telemetry.getContext().getCloud().setRoleInstance(computerName);
        telemetry.getContext().getDevice().setId("My Device Instance");
        telemetry.getContext().getInternal().setNodeName("My Node Name");
    }
}