/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex_3;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class program_2 {
    public static void main(String[] args){
        min obj=new min();
        obj.minimum();
    }
    
}
class min{
    static int min;
    int a[]=new int[4];
    Scanner obj=new Scanner(System.in);
    min(){
        for(int i=0;i<4;i++){
            System.out.println("enter"+(i+1)+"th number");
            a[i]=obj.nextInt();
            
        }
        min=a[0];
    }
    void minimum(){
        for(int i=0;i<4;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("min="+min);
    }
}
