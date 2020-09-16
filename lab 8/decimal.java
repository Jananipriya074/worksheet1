/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binary;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class decimal {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int sum=0;
        int bi,bif,flag=1;
        
        double summ=0;
        System.out.println("enter a binary string");
        String j=obj.nextLine();
        bi=Integer.parseInt(j);
        bif=bi;
        while(bif!=0){
            int n=bif%10;
            if(n>1){
                flag=0;
                break;
                
            }
            else{
                bif=bif/10;
            }
        }
        if(flag==0){
            System.out.println("error"+bi);
        }
        else{
            for(int i=0;i<4;i++){
                int p=bi%10;
                summ=summ+p*Math.pow(2,i);
                sum=(int)sum;
                bi=bi/10;
            }
            System.out.println("equvalent decimal number for binary"+j+"is:"+sum);
        }
    }
    
}
