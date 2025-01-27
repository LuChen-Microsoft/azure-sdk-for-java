// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of IP configuration of an application gateway. */
@Fluent
public final class ApplicationGatewayIpConfigurationPropertiesFormat {
    /*
     * Reference to the subnet resource. A subnet from where application
     * gateway gets its private address.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * The provisioning state of the application gateway IP configuration
     * resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the subnet property: Reference to the subnet resource. A subnet from where application gateway gets its
     * private address.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to the subnet resource. A subnet from where application gateway gets its
     * private address.
     *
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayIpConfigurationPropertiesFormat object itself.
     */
    public ApplicationGatewayIpConfigurationPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway IP configuration resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
