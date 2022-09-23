package com.example.pinkcity.a_models;

/**
 * cartography of a CoffeeBar
 */
public class CoffeeBar {
    private String id;
    private String name;
    private String streetName;
    private Integer postalCode;
    private String phoneNumber;
    private String WebSiteUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoffeeBar{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append(", postalCode=").append(postalCode);
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", WebSiteUrl='").append(WebSiteUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
