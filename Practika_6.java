/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.domashka6;


import java.util.Scanner;

/**
 *
 * @author vikaasoo
 */
public class Practika_6 {

    public static void main(String[] args){
        System.out.println("Согрина Виктория, РИБО-03-21, Вариант 1");
        
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Введите бренд машины: ");
        String brand = scan.next();
        System.out.println("Введите модель машины: ");
        String model = scan.next();
        System.out.println("Введите год машины: ");
        int year = scan.nextInt();
        System.out.println("Введите цвет машины: ");
        String color = scan.next();
        System.out.println("Введите номер машины: ");
        String number = scan.next();
        
        Car car = new Car(brand, model, year, color, number);
        
        MyThread myTh = new MyThread("C:\\car.ser", car);
        Thread th = new Thread(myTh);
        th.start();
    }
}
