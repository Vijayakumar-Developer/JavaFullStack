package com.training.quest4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Mobile> mobiles = Arrays.asList(
    		   new Mobile(10,"galaxy s11","Samsung",10000),
    		   new Mobile(20,"i Phone","Apple",20000),
    		   new Mobile(30,"Note 10","Redmi",30000),
    		   new Mobile(40,"Plus","Vivo",40000),
    		   new Mobile(50,"Max","Vivo",50000)
    		   
    		   );
       //Print all mobiles
       mobiles.forEach(System.out::println);
       
       //Get mobiles by brand
       List<Mobile> vivoMobile = mobiles.stream()
    		                     .filter(m -> m.getBrand().equalsIgnoreCase("vivo"))
    		                     .collect(Collectors.toList());
       System.out.println("Vivo Mobile : " + vivoMobile);
       //get mobile by brand and sort by model
   	List<Mobile> sortModel = vivoMobile.stream()
   			                 .sorted((m1,m2) -> m1.getModel().compareTo(m2.getModel()))
   			                 .collect(Collectors.toList());
       System.out.println("Sorted Model : " + sortModel);
       //Get one mobile by id = 10
      	Mobile mobilebyID = mobiles.stream()
      			                  .filter(m -> m.getMobileId() == 10)
      			                  .findFirst()
      			                .orElseThrow(() -> new NoSuchElementException("Mobile with ID 10 not found"));
       System.out.println("Mobile with ID 10 : " + mobilebyID);
       
       // Mobiles by brand and price < 50000
       
       List<Mobile> lowestVivo = mobiles.stream()
    		                     .filter(m -> m.getBrand().equalsIgnoreCase("Vivo") && m.getPrice() < 50000)
    		                     .collect(Collectors.toList());
       System.out.println("Vivo Mobiles less than 50000 : " +lowestVivo);
       
       //mobiles by brand , sort by model and print only name
        mobiles.stream()
               .filter(m -> m.getBrand().equalsIgnoreCase("vivo"))
               .sorted((m1,m2) -> m1.getModel() .compareTo(m2.getModel()))
               .map(Mobile::getModel)
               .forEach(System.out::println);
	}
				
}
