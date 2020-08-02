/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.worksheet;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class program3 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        arithmetic d=new arithmetic();
        System.out.println("enter a value of a");
        int a=obj.nextInt();
        System.out.println("enter a value of b");
        int b=obj.nextInt();
        d.add(a, b);
        d.sub(a, b);
        d.mul(a, b);
        d.div(a, b);
        
        
        
        
    }
    
}
class arithmetic{
    int a;
    int b;
    int c;
    void add(int a,int b){
        c=a+b;
        System.out.println("sum="+c);
    }
    void sub(int a,int b){
        c=a-b;
        System.out.println("diff="+c);
    }
    void mul(int a,int b){
        c=a*b;
        System.out.println("mul="+c);
    }
    void div(int a,int b){
        c=a/b;
        System.out.println("div="+c);
    }
    }

