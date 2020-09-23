/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fit;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class human {
    public static void main(String[] args){
        per obj1 = new per();
        obj1.getdata();
        try {
            obj1.check();//calling method check()
            System.out.println("----------------Details---------------");
            obj1.printdata();//caling method printdata()
        }
        catch(NameIncorrectFormatException e){
            System.out.println(e);
        }
     
    }
    
}
class per{
    String name,mid;
    int age;
    void getdata(){
        Scanner obj=new Scanner(System.in);
        System.out.println("name:");
        name=obj.nextLine();
        System.out.println("age:");
        age=obj.nextInt();
        mid=obj.next();
        
        
    }
    void printdata(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("mail:"+mid);
    }
    void check() throws NameIncorrectFormatException{
        char[] arr=name.toCharArray();
        for (char n : arr) {
            if (!(n >= 'a' && n <= 'z')) {
                throw new NameIncorrectFormatException("invalid name");
            }
        }
        
    }
}
