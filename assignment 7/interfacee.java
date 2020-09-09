/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author GOKUL
 */
public class interfacee {
    public static void main(String[] args) {
        
        employee f1[]=new employee[5];
        ArrayList<employee> list=new ArrayList<>();
        
        for(int i=0;i<5;i++){
          f1[i]=new employee();
          f1[i].getdata();
            System.out.println(f1[i]);
        }
        for(int j=0;j<5;j++){
           list.add(f1[j]);
        }
        System.out.println("info of 20 emloyees");
        System.out.println(list);
        System.out.println("list after sorting salary in ascending order");
        Collections.sort(list,new salarysort());
        System.out.println(list);
    }
    
    
}
class employee{
 String name;
 double salary;
 void getdata(){
   Scanner obj=new Scanner(System.in);
     System.out.println("enter name");
     name=obj.nextLine();
     System.out.println("enter salary");
     salary=obj.nextDouble();
 }
  public String toString(){
    return "Name="+name+" salary="+salary;
 }
}
class salarysort implements Comparator<employee>{
   @Override
   public int compare(employee e1,employee e2){
         return (int)(e1.salary-e2.salary);
   }
}
