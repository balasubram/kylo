package com.thinkbiganalytics.servicemonitor.rest.model.ambari;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "component_name",
        "host_name",
        "state"
})
public class HostRoles {

    @JsonProperty("component_name")
    private String componentName;
    @JsonProperty("host_name")
    private String hostName;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The componentName
     */
    @JsonProperty("component_name")
    public String getComponentName() {
        return componentName;
    }

    /**
     * @param componentName The component_name
     */
    @JsonProperty("component_name")
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * @return The hostName
     */
    @JsonProperty("host_name")
    public String getHostName() {
        return hostName;
    }

    /**
     * @param hostName The host_name
     */
    @JsonProperty("host_name")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * @return The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}