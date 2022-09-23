package com.example.pinkcity.d_repository.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
    @JsonProperty(value = "eq_nom_equipement")
    private String name;
    @JsonProperty(value = "lib_off")
    private String streetName;
    @JsonProperty(value = "id_secteur_postal")
    private Integer postalCode;
    @JsonProperty(value = "eq_ville")
    private String city;
    @JsonProperty(value = "eq_telephone")
    private String phoneNumber;
    @JsonProperty(value = "eq_site_web")
    private String WebSiteUrl;
}
