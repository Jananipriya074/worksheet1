/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;
import java.util.Random;
/**
 *
 * @author GOKUL
 */
public class thread {
    public static void main(String[] args){
        thread1 t1=new thread1();
        t1.start();
    }
    
}
class thread1 extends Thread{
public void run(){
   Random r=new Random();
   int n=r.nextInt();
    System.out.println("generated random number is:"+n);
    if(n%2==0){
      thread2 t2=new thread2(n);
      t2.start();
    }
    else if(n%2!=0){
      thread3 t3=new thread3(n);
      t3.start();
    }
}
}
class thread2 extends Thread{
   int num;
    thread2(int x){
    num=x;
   }
    public void run(){
    int sq=num*num;
        System.out.println("square of "+num+ ": "+sq);
    }
}
class thread3 extends Thread{
int num;
    thread3(int x){
    num=x;
   }
    public void run(){
    int cu=num*num*num;
        System.out.println("square of "+num+ ": "+cu);
    }
}

