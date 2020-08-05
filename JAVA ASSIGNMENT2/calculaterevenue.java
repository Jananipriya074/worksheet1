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
public class calculaterevenue {
    public static void main(String[] args){
        float up,dispercent,rev,disamt,amount;
        int q;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter unip price");
        up=obj.nextInt();
        System.out.println("enter quality");
        q=obj.nextInt();
        amount=up*q;
        if(q>120){
            dispercent=(float)15/100;
            disamt=amount*dispercent;
            rev=amount-disamt;
        }
        else if(q>=100 && q<120){
            dispercent=(float)10/100;
            disamt=amount*dispercent;
            rev=amount-disamt;
        }
        else{
            dispercent=0;
            disamt=amount*dispercent;
            rev=amount-disamt;
            
        }
        System.out.println(disamt);
        System.out.println(amount);
        System.out.println("the rev amt is="+rev);
        
    }
    
}
