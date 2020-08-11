/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex_2;

/**
 *
 * @author GOKUL
 */
public class program_1 {
    public static void main(String[] args){
        invoice obj=new invoice("janani","aaa",10,250);
        System.out.println("Id="+obj.getId());
        System.out.println("desc="+obj.desc());
        System.out.println("qty="+obj.qty());
        System.out.println("up="+obj.getunitprice());
        System.out.println("t="+obj.gettotal());
        obj.setunitprice(5);
        obj.setunitprice(300);
        System.out.println("modified qty="+obj.qty());
        System.out.println("modified up="+obj.getunitprice());
        System.out.println("modified t="+obj.gettotal());
        
        
    }
    
}
class invoice{
    String Id;
    String desc;
    int qty;
    double unitprice;
    invoice(String i,String d,int q,double up){
        Id=i;
        desc=d;
        qty=q;
        unitprice=up;
    }
    String getId(){
        return Id;
    }
    String desc(){
        return desc;
    }
    int qty(){
        return qty;
    }
    void setqty(int q1){
        qty=q1;
    }
    double getunitprice(){
        return unitprice;
    }
    void setunitprice(double up1){
        unitprice=up1;
        
    }
    double gettotal(){
        double t=qty*unitprice;
        return t;
    }
    public String tostring(){
        return Id+""+desc+""+qty+""+unitprice;
    }
    
}