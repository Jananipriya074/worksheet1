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
public class search {
    public static void main(String[] args){
        int a[]=new int[10];
        int n,num,i,flag=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        System.out.println("enter the ele to be search");
        num=obj.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==num){
                flag++;
                System.out.println("the num"+num+"is found at the pos"+i);
                break;
               
            }
        }
        if(flag==0){
            System.out.println("the searched number is not found");
          
        }
    }
    
}
