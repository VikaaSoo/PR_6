/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.domashka6;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author vikaasoo
 */
public class MyThread implements Runnable{
    private Car car;
    private String path;

    public MyThread(String path, Car car) {
        this.path = path;
        this.car = car;
    }
    
    @Override
    public void run(){
        if(this.path != null && car != null){
            FileOutputStream fos;
            try{
                fos = new FileOutputStream(this.path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(car);
                oos.close();
                System.out.println("Сериализация прошла успешно " + this.path);
            }catch (IOException ex){
                System.out.println("Ошибка сохранения объекта в " + this.path + ex.getMessage());
            }
        }
    }
}
