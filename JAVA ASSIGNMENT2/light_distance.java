/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class light_distance {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("distance travelled in one day is 2.590*10^10 km");
        double a=2.590*Math.pow(10,10);
        System.out.println("enter the number of days");
        int days=obj.nextInt();
        double d=days*a;
        System.out.println("distance travelled by light in"+(days)+"days="+(d)+"km");
    }
}
