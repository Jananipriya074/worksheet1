/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab7;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author GOKUL
 */
public class str {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int f=0,pos=0;
        System.out.println("searching given word in the array");
        String[] s=new String[]{"ananya","silu","chithu","kathir","jeeva"};
        System.out.println("enter the string to be searched");
        String g=obj.nextLine();
        
        for(int i=0;i<5;i++){
         if(s[i].equals(g)){
             f++;
             pos=i;
             break;
            }
        }
         if(f==0){
         System.out.println("the searched string is not found ");
        }
        else{
         System.out.println("the searched string is found at position "+pos);
        }
         System.out.println("printing all elements in the array starting & ending with gn letter");
        System.out.println("enter starting letter");
        char first=obj.next().charAt(0);
        System.out.println("enter ending letter");
        char last=obj.next().charAt(0);
        for(int i=0;i<5;i++){
           String a=s[i];
           int n=s[i].length();
           char first1=a.charAt(0);
           char last1=a.charAt(n-1);
           if(first==first1 && last==last1){
               System.out.println(a); 
            }
           else{
              continue;
           }
}
}}
    
        
    

