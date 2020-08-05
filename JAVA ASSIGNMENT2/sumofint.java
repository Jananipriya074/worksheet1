/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author GOKUL
 */
public class sumofint {
    public static void main(String[] args){
        int sum=0,i;
        for(i=101;i<200;i++){
            if(i%8==0){
                sum=sum+i;
            }
        }
        System.out.println("sum of all integers greater than 100 less than 200 that are divisible by 8"+sum);
    }
    
}
