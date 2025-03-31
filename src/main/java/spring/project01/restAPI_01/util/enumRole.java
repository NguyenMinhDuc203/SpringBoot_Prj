package spring.project01.restAPI_01.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum enumRole {
    @JsonProperty("OWNER")
    OWNER,
    @JsonProperty("DEV")
    DEV,
    @JsonProperty("ADMIN")
    ADMIN,
    @JsonProperty("USER")
    USER
}
