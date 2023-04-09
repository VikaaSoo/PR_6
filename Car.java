/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.domashka6;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author vikaasoo
 */
public class Car implements Externalizable{
    private String brand;
    private String model;
    private int year;
    private String color;
    private String number;

    public Car() {
    }

    public Car(String brand, String model, int year, String color, String number) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(this.getBrand());
        out.writeObject(this.getModel());
        out.writeObject(this.getYear());
        out.writeObject(this.getColor());
        out.writeObject(this.getNumber());
    }
    
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        this.brand = (String)in.readObject();
        this.model = (String)in.readObject();
        this.year = (Integer)in.readObject();
        this.color = (String)in.readObject();
        this.number = (String)in.readObject();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }
    
    

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if(year > 2023){
            this.year = 2023;
        }else if(year < 1806){
            this.year = 1806;
        }
    }
        
    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Car{brand " + this.brand +
                " ,model " + this.model +
                " ,year " + this.year +
                " ,color " + this.color +
                " ,number " + this.number +"}";
    }
    
}
