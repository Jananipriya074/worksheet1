/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex_2;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class gradecalc {
    public static void main(String[] args){
        int tot=0,avg;
        int marks[]=new int[5];
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter marks of sub"+(i+1));
            marks[i]=obj.nextInt();
            tot=tot+marks[i];
        }
        avg=tot/5;
        if(avg>=91 && avg<=100){
        System.out.println("Student grade & gradept is:");
        System.out.println("O & 10");
        }
        else if(avg>=81 && avg<=91){
            System.out.println("Student grade & gradept is:"); 
            System.out.println("A+,9");
        }
        else if(avg>=71 && avg<=81){
            System.out.println("Student grade & gradept is:");
            System.out.println("A,8");
        }
        else if(avg>=61 && avg<=71){
            System.out.println("Student grade & gradept is:");    
            System.out.println("B+,7");
        }
        else if(avg>=51 && avg<=61){
            System.out.println("Student grade & gradept is:");    
            System.out.println("B,6");
        }
        else{
            System.out.println("Student fail");
        }
            
            
            
        }
    }
    

