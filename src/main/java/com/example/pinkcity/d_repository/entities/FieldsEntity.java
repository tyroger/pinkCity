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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebSiteUrl() {
        return WebSiteUrl;
    }

    public void setWebSiteUrl(String webSiteUrl) {
        WebSiteUrl = webSiteUrl;
    }
}
