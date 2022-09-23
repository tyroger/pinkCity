package com.example.pinkcity.d_repository.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIResponseEntity {
    @JsonProperty(value = "records")
    private ApiRecordsEntity records;

    public ApiRecordsEntity getRecords() {
        return records;
    }

    public void setRecords(ApiRecordsEntity records) {
        this.records = records;
    }
}
