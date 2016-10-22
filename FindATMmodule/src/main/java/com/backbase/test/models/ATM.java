/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backbase.test.models;

/**
 * 
 * @author Omer Younus
 */
import org.json.JSONObject;

public class ATM {
    private final String type;
    private final Address address;

    public ATM(JSONObject json) {
	this.address = new Address(json.getJSONObject("address"));
	this.type = json.getString("type");
    }
    
    public String getType() {
        return type;
    }

    public Address getAddress() {
        return address;
    }
}
