package com.example.pinkcity.d_repository.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIResponseEntity {
    @JsonProperty(value = "records")
    private List<ApiRecordsEntity> records;

    public List<ApiRecordsEntity> getRecords() {
        return records;
    }

    public void setRecords(List<ApiRecordsEntity> records) {
        this.records = records;
    }
}
