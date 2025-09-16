package com.training.quest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String, List<String>> countries = new HashMap<>();
        
        countries.put("Tamil Nadu", Arrays.asList("Chennai", "Coimbatore", "Madurai"));
        countries.put("Maharashtra", Arrays.asList("Mumbai", "Pune", "Mumbai South"));
        countries.put("Karnataka", Arrays.asList("Bengaluru", "Mysuru", "Mangaluru"));
        
        for (Map.Entry<String, List<String>> entry : countries.entrySet()) {
            String state = entry.getKey();
            List<String> cities = entry.getValue();
            System.out.println("State: " + state);
            cities.forEach(city -> System.out.println("  City: " + city));
        }

	}

}
