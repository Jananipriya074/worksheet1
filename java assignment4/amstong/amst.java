/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amstong;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class amst {
     public void arm(){
     Scanner num=new Scanner(System.in);
     System.out.println("enter the num which you want to check whether armstrong or not");
     int r,s = 0;
     int n=num.nextInt();
     int a=n;
     while(n!=0){
      r=n%10;
      s=s+(r*r*r);
      n=n/10;
     }
     if(s==a){
     System.out.println("the given num is armstrong");
     }
     else{
     System.out.println("the given num is not armstrong");
     }
    }
}


