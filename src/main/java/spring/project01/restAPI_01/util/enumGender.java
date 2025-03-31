package spring.project01.restAPI_01.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum enumGender {
    @JsonProperty("MALE")
    MALE,
    @JsonProperty("FEMALE")
    FEMALE,
    @JsonProperty("OTHER")
    OTHER
}
