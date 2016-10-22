/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.backbase.test.models;
import org.json.JSONObject;

/**
 * 
 * @author Omer Younus
 */
public class Address {
   
    private final String street;
    private final String houseNumber;
    private final String postalCode;
    private final String city;
    private final GeoLocation geoLocation; 
    
    public Address(JSONObject obj) {
	this.street = obj.getString("street");
	this.houseNumber = obj.getString("housenumber");
	this.postalCode = obj.getString("postalcode");
	this.city = obj.getString("city");
	this.geoLocation = new GeoLocation(obj.getJSONObject("geoLocation"));
    }
      
    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }
}
