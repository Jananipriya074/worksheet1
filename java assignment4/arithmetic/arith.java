/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class arith {
     public void ar(){
    int a,b;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter 2 nmber for which you want to do arithmatic operation");
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("add="+(a+b));
    System.out.println("sub="+(a-b));
    System.out.println("mul="+(a*b));
    System.out.println("div="+(a/b));
    System.out.println("mod="+(a%b));
       
}
}
