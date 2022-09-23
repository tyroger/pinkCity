package com.example.pinkcity.d_repository.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiRecordsEntity {
    @JsonProperty(value = "recordid")
    private String id;
    @JsonProperty(value = "fields")
    private FieldsEntity fields;
}
