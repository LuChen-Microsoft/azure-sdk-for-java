// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.opentelemetry.exporter.implementation.builders;

import com.azure.monitor.opentelemetry.exporter.implementation.models.RequestData;

import java.util.HashMap;
import java.util.Map;

public final class RequestTelemetryBuilder extends AbstractTelemetryBuilder {

    private static final int MAX_SOURCE_LENGTH = 1024;
    private static final int MAX_RESPONSE_CODE_LENGTH = 1024;
    private static final int MAX_URL_LENGTH = 2048;

    private final RequestData data;

    public static RequestTelemetryBuilder create() {
        return new RequestTelemetryBuilder(new RequestData());
    }

    private RequestTelemetryBuilder(RequestData data) {
        super(data, "Request", "RequestData");
        this.data = data;
    }

    public void setId(String id) {
        data.setId(TelemetryTruncation.truncateTelemetry(id, MAX_ID_LENGTH, "Request.id"));
    }

    public void setName(String name) {
        data.setName(TelemetryTruncation.truncateTelemetry(name, MAX_NAME_LENGTH, "Request.name"));
    }

    public void setDuration(String duration) {
        data.setDuration(duration);
    }

    public void setSuccess(boolean success) {
        data.setSuccess(success);
    }

    public void setResponseCode(String responseCode) {
        data.setResponseCode(
            TelemetryTruncation.truncateTelemetry(responseCode, MAX_RESPONSE_CODE_LENGTH, "Request.responseCode"));
    }

    public void setSource(String source) {
        data.setSource(TelemetryTruncation.truncateTelemetry(source, MAX_SOURCE_LENGTH, "Request.source"));
    }

    public void setUrl(String url) {
        data.setUrl(TelemetryTruncation.truncateTelemetry(url, MAX_URL_LENGTH, "Request.url"));
    }

    public void addMeasurement(String key, Double value) {
        if (key == null || key.isEmpty() || key.length() > MAX_MEASUREMENT_KEY_LENGTH) {
            // TODO (trask) log
            return;
        }
        Map<String, Double> measurements = data.getMeasurements();
        if (measurements == null) {
            measurements = new HashMap<>();
            data.setMeasurements(measurements);
        }
        measurements.put(key, value);
    }

    @Override
    protected Map<String, String> getProperties() {
        Map<String, String> properties = data.getProperties();
        if (properties == null) {
            properties = new HashMap<>();
            data.setProperties(properties);
        }
        return properties;
    }
}
