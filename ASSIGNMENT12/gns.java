/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab12;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class gns {
    public static<t,s> void search(t[] arr,s val){
        int flag=0,pos=0;
        for(int i=0;i<arr.length;i++){
            if(val.equals(arr[i])){
                flag++;
                pos=i;
            }
        }
        if(flag==0){
            System.out.println("ele not founnd");
        }
        else{
            System.out.println("ele found at"+pos);
        }
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        Integer[] ar1={23,34,45,10,29};
        Character[] ar2={'j','s','k'};
        String[] ar3={"janani","kharshi","priya","sri","sneha"};
        Double[] ar4={12.4,23.3,10.9,4.5};
        
        System.out.println("enter the integer to be searched");
        int s1=obj.nextInt();
        search(ar1,s1);
        System.out.println("enter the char to be searched");
        char s2=obj.next().charAt(0);
        search(ar2,s2);
        System.out.println("enter the string to be searched");
        String s3=obj.next();
        search(ar3,s3);
        System.out.println("enter the double to be searched");
        Double s4=obj.nextDouble();
        search(ar4,s4);
        
    }
    
}
