/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backbase.test.service;

import com.backbase.test.models.ATM;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author Omer Younus
 */
public class ATMServiceTest {

    private List<ATM> atmList;
    
    public ATMServiceTest() {
    }

    @Before
    public  void setUp() {
    
        JSONObject obj = new JSONObject();
        JSONObject address = new JSONObject();
        JSONObject geoLocation = new JSONObject();
        
        address.put("street", "323");
        address.put("housenumber", "89");
        address.put("city", "VOORBURG");
        address.put("postalcode", "2273 DP");
        address.put("geoLocation", geoLocation);
        geoLocation.put("lat", "52.271095");
        geoLocation.put("lng", "4.619902");
        obj.put("address", address);
        obj.put("type", "12");
        
        atmList = new ArrayList<>();
       
        ATM atmLocation1 = new ATM(obj);
        JSONObject obj1 = new JSONObject();
        JSONObject address1 = new JSONObject();
        JSONObject geoLocation1 = new JSONObject();
        
        address1.put("street", "323");
        address1.put("housenumber", "231");
        address1.put("postalcode", "2273 DP");
        address1.put("city", "VOORBURG");
        address1.put("geoLocation", geoLocation);
        geoLocation1.put("lat", "52.271095");
        geoLocation1.put("lng", "4.619902");
        
        obj1.put("address", address1);
        obj1.put("type", "12");
        ATM atmLocation2 = new ATM(obj1);
        
        atmList.add(atmLocation1);
        atmList.add(atmLocation2);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @org.junit.Test
    public void testJSONObject(){
    System.out.println("testJSONObject");
    
    atmList.stream().map((atm) -> atm.getAddress().getCity()).forEach((city) -> {
        assertEquals(city, "VOORBURG");
    });
    
    }
    /**
     * Test of findAll method, of class ATMService.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        List<ATM> findAll = ATMService.findAll();
        assertEquals(findAll.size(), 1582);
    }

    /**
     * Test of findByCityName method, of class ATMService.
     *
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testFindByCityName() throws Exception {
        System.out.println("findByCityName");
        List<ATM> atmLocations = ATMService.findByCityName("VOORBURG");
        assertEquals(atmLocations.size(), 4);
    }
}
