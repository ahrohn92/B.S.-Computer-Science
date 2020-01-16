/*
 * Course:  	CMIS 141
 * File: 	HeadPhone.java
 * Author: 	Andrew Rohn
 * Date: 	1 July 2018
 * Purpose: 	This program demonstrates the use of fields, methods, and constructors in Java.
 */

import java.awt.Color;
 
class HeadPhone {
    
    // HeaadPhone Volume Constants
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;

    // Private Fields for HeadPhone Constructor
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;
    
    // Default HeadPhone Constructor
    public HeadPhone() {
        volume = MEDIUM;
        pluggedIn = false;
        manufacturer = "Bose";
        headPhoneColor = Color.BLACK;
        headPhoneModel = "QC 35";
    }
    

    // Fields of HeadPhone Contructor
    public int getVolume() {
        return volume;
    }
    public void changeVolume(int volume) {
        this.volume = volume;
    }
    public boolean isPluggedIn() {
        return pluggedIn;
    }
    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getHeadPhoneModel() {
        return headPhoneModel;
    }
    public void setHeadPhoneModel(String headPhoneModel) {
        this.headPhoneModel = headPhoneModel;
    }
    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }
    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }
    @Override
    public String toString() {
        return "HeadPhone{" + "manufacturer=" + manufacturer + ", volume=" + volume + ", pluggedIn=" + pluggedIn + ", headPhoneModel=" + headPhoneModel + ", headPhoneColor=" + headPhoneColor + '}';
    }
}