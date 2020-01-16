/*
 * Course:  	CMIS 141
 * File: 	Microwave.java
 * Author: 	Andrew Rohn
 * Date: 	1 July 2018
 * Purpose: 	This program demonstrates the use of fields, methods, and constructors in Java.
 */

public class Microwave {

	// Private Fields for Microwave Constructor
    	private boolean isOn;
	private String manufacturer;
    	private String model;
    	private String wattage;
    	private String price;
   
	// Default Microwave Constructor    
    	public Microwave() {
        	isOn = false;
		manufacturer = "Panasonic";
        	model = "NN-SN936W"; 
        	wattage = "1,250W";
        	price = "$189.00";
    	}

	// Fields of Microwave Constructor   
   	public boolean getIsOn(){
        	return isOn;
    	}
    	public void setIsOn(boolean isOn){
        	this.isOn = false;
	}
    	public String getManufacturer(){
        	return manufacturer;  
   	}
    	public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    	}
	public String getModel(){
        	return model;  
   	}
    	public void setModel(String model){
        this.model = model;
    	}
   	public String getWattage(){
        	return wattage;  
   	}
    	public void setWattage(String wattage){
        this.wattage = wattage;
    	}
    	public String getPrice(){
        	return price;  
   	}
    	public void setPrice(String price){
        this.price = price;
    	}
    	@Override
    	public String toString(){
        	System.out.println("Power: " + this.isOn);
        	System.out.println("Manufacturer: " + this.manufacturer);
        	System.out.println("Model: " + this.model);
        	System.out.println("Wattage: " + this.wattage);
		System.out.print("Price: " + this.price + "\n\n");
       	return "";
    	}
}
 
