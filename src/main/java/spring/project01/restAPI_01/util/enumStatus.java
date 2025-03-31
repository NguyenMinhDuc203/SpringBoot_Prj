package spring.project01.restAPI_01.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum enumStatus {
    @JsonProperty("ACTIVE")

    ACTIVE,
    @JsonProperty("INACTIVE")

    INACTIVE,
    @JsonProperty("NONE")

    NONE
}
