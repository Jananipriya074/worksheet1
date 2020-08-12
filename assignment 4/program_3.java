/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex_3;

/**
 *
 * @author GOKUL
 */
public class program_3 {
    public static void main(String[] args){
         System.out.println("i is static variable\n j is not static variable");
         counter obj=new counter();
          System.out.println("i & j values when calling method for 1st obj");
          obj.increment();
          counter obj1=new counter();
          System.out.println("i & j values when calling method for 2nd obj");
          obj1.increment();
    }
    
}
class counter{
    static int i=10;
    int j=10;
    void increment(){
        i=++i;
        j=++j;
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
