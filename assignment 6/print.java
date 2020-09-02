/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class print {
    public static void main(String[] args){
        supermarket obj1=new supermarket();
        restaurent obj2=new restaurent();
        obj1.calcbill();
        obj1.display();
        obj2.calcbill();
        obj2.display();
        
    }
    
}
interface printable{
    public void calcbill();
    public void display();
   
}
class supermarket implements printable{
    double amt,tax,bill;
    Scanner obj=new Scanner(System.in);
    public void calcbill(){
        amt=obj.nextInt();
        tax=(float)18/100*amt;
        bill=amt+tax;
    }
    public void display(){
        System.out.println("tot bill="+bill);
    }
}
class restaurent implements printable{
    double amt,tax,bill;
    Scanner obj=new Scanner(System.in);
    public void calcbill(){
        amt=obj.nextInt();
        tax=(float)5/100*amt;
        bill=tax+amt;
        
    }
    public void display(){
        System.out.println("tot bill is="+bill);
    }
}