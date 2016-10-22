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
public class GeoLocation {
    private final double lat;
    private final double lng;

    public GeoLocation(JSONObject json) {
	this.lat = Double.valueOf(json.getString("lat"));
	this.lng = Double.valueOf(json.getString("lng"));
    }
    
    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
