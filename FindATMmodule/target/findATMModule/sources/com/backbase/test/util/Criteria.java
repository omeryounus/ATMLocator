/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backbase.test.util;

import com.backbase.test.models.ATM;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author Omer Younus
 */
public class Criteria {
    
    private SEARCH_TYPE type;
    private Map<FIELD, String> values = new HashMap<>();

    public SEARCH_TYPE getType(){
        return type;
    }
    
    public void setType(SEARCH_TYPE type){
         this.type = type;
    }
    
    
    public enum SEARCH_TYPE {
        find_all,
        match_all,
        match_any
    }

    public static enum FIELD {
	cityName;
    }

    public boolean match(ATM atm) {
	if (type == SEARCH_TYPE.find_all) {
	    return true;
	}

	Map<FIELD, Boolean> matchMatrix = initMatchMatrix();

	values.keySet().stream().forEach((field) -> {

            if (field == FIELD.cityName && values.get(field).equalsIgnoreCase(atm.getAddress().getCity())) {
		matchMatrix.put(field, Boolean.TRUE);
	    }
	});

	switch (type) {
            
	    case match_all:
		return !matchMatrix.containsValue(Boolean.FALSE);
	    case match_any:
		return matchMatrix.containsValue(Boolean.TRUE);
	    default:
		throw new IllegalArgumentException("Unsupeported search criteria type: " + type);

	}
    }

    private Map<FIELD, Boolean> initMatchMatrix() {
	Map<FIELD, Boolean> matchMatrix = new HashMap<>();
	values.keySet().stream().forEach((field) -> {
	    matchMatrix.put(field, Boolean.FALSE);
	});
	return matchMatrix;
    }

    public Map<FIELD, String> getValues() {
	return values;
    }

    public void setValues(Map<FIELD, String> values) {
	this.values = values;
    }
}
