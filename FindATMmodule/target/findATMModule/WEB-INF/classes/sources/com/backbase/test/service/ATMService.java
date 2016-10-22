/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backbase.test.service;

import com.backbase.test.exeption.ATMNotFoundException;
import com.backbase.test.models.ATM;
import com.backbase.test.util.Constant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author Omer Younus
 */
public class ATMService {
    
    public static List<ATM> findAll() throws IOException {
            return search("ALL");
    }

    public static List<ATM> findByCityName(String city) throws IOException, ATMNotFoundException {
            return search(city);
    }

    public static List<ATM> search(String criteria) throws IOException {
	       List<ATM> result;
        if (criteria.equals("ALL")) {
            JSONArray json = readJsonFromUrl(Constant.ATM_SERVICE_URL);
            result = searchAll(json);
        } else {
            JSONArray json = readJsonFromUrl(Constant.ATM_SERVICE_URL);
            result = searchCity(json, criteria);
        }
        return result;
    }
    
    private static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            jsonText = jsonText.substring(jsonText.indexOf("["));
            JSONArray json = new JSONArray(jsonText);
         
            return json;
        } finally {
            is.close();
        }
    }
    
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
   
    private static List<ATM> searchCity(JSONArray json, String city) {
	List<ATM> result = new ArrayList<>();

        for (int i = 0; i < json.length(); i++) {
	    JSONObject jsonATM = json.getJSONObject(i);
            ATM atm = new ATM(jsonATM);
		
            if (atm.getAddress().getCity().equalsIgnoreCase(city))
            {
                result.add(atm);
	    }
	}
	return result;
    }
    
    private static List<ATM> searchAll(JSONArray json) {
        List<ATM> result = new ArrayList<>();
        for (int i = 0; i < json.length(); i++) {
            JSONObject jsonATM = json.getJSONObject(i);
            ATM atm = new ATM(jsonATM);
            result.add(atm);
        }
        return result;
    }
}
