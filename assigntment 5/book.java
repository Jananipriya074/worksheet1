/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;
import java.util.Scanner;
/**
 *
 * @author GOKUL
 */
public class book {
    public static void main(String[] args){
        student mobj=new student();
        mobj.read();
        System.out.println("students detail:");
        System.out.println("");
        mobj.display();
        System.out.println("********************");
        staff nobj=new staff();
        nobj.read();
        System.out.println("********************");
        System.out.println("staff detail:");
         System.out.println("");
         nobj.display();
        
    }
    
}
class bk {
    String name;
    int accessnum;
    String author;
    Scanner obj=new Scanner(System.in);
    void read(){
      Scanner obj=new Scanner(System.in);
      System.out.println("enter a book name:");
      
     name=obj.next();
     System.out.println("enter a accessnum:");
      accessnum=obj.nextInt();
      System.out.println("enter a author:");
      author=obj.next();
             
    }
    void show(){
        System.out.println(" book name:"+name);
        System.out.println("accessnum:"+accessnum);
        System.out.println("author:"+author);
    }
}
class staff extends bk{
    String sname;
    int sid;
    String dept;
    void read(){
        super.read();
        System.out.println("enter a sname:");
        sname=obj.next();
        System.out.println("enter id:");
        sid=obj.nextInt();
        System.out.println("enter department:");
        dept=obj.next();
    }
    void display(){
        super.show();
        System.out.println("enter a sname:"+sname);
        System.out.println("enter a id:"+sid);
        System.out.println("enter a department:"+dept);
    }
}
class student extends bk{
    String stuname;
    int rollno;
    String dept;
    void read(){
        super.read();
        System.out.println("enter a stuname:");
        stuname=obj.next();
        System.out.println("enter a rollno:");
        rollno=obj.nextInt();
        System.out.println("enter a department:");
        dept=obj.next();
    }
    void display(){
        super.show();
        System.out.println("enter a stuname:"+stuname);
        System.out.println("enter a rollno:"+rollno);
        System.out.println("enter a department:"+dept);
    }
}

