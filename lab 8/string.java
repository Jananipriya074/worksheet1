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
public class string {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String fname;
        String lname;
        fname=obj.nextLine();
        lname=obj.nextLine();
        String firstname=fname.substring(0,4);
        String lastname=lname.substring(0,3);
        String g=firstname.concat(".");
        String p=g.concat("lastname");
        String str=g.concat("@gamil.com"); 
        System.out.println("email"+str);
        
    }
    
}
