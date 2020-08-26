/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class bankprgm {
    public static void main(String[] args){
     
       bank1 obj1=new bank1();
       bank2 obj2=new bank2();
       bank3 obj3=new bank3();
       Scanner obj=new Scanner(System.in);
       System.out.println("enter 1 to know money deposited in the bank1");
       System.out.println("enter 2 to know money deposited in the bank2");
       System.out.println("enter 3 to know money deposited in the bank3");
       int ch=obj.nextInt();
       switch(ch){
           case 1:
               System.out.println(" money deposited in the bank1"+obj1.getbalance());
               break;
           case 2:
               System.out.println("money deposited in the bank2"+obj2.getbalance());
               break;
           case 3:
               System.out.println("money deposited in the bank"+obj3.getbalance());
               break;
       }
       
    }
    
}
class bank{
    int getbalance(){
        return 0;
    }
}
 class bank1 extends bank{
     int getbalance(){
         return 1000;
     }
 }
  class bank2 extends bank{
      int getbalance(){
          return 1500;
      }
  } 
 class bank3 extends bank{
     int getbalance(){
         return 2000;
     }
 }  
 
}