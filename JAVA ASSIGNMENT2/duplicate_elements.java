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
public class duplicate_elements {
    public static void main(String[] args){
        int i,n,j,flag=0;
        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        n=obj.nextInt();
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    flag++;
                }
            }
        }
        if(flag==0){
            System.out.println("the array does not contain any duplicate ele");
        }
        else{
            System.out.println("contains any duplicate ele");
            System.out.println(flag+"ele are duplicated in the array");
                }
            }
        }
        
    
    

