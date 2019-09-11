package com.example.demo.configuration;

import com.microsoft.applicationinsights.telemetry.Telemetry;
import com.microsoft.applicationinsights.web.extensibility.initializers.WebTelemetryInitializerBase;

public class CloudRoleNameInitializer extends WebTelemetryInitializerBase {

    @Override
    protected void onInitializeTelemetry(Telemetry telemetry) {
        telemetry.getContext().getCloud().setRoleInstance("My Role Instance");
        telemetry.getContext().getDevice().setId("My Device Instance");
        telemetry.getContext().getInternal().setNodeName("My Node Name");
    }
}