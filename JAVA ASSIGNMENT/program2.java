/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.worksheet;

/**
 *
 * @author GOKUL
 */
public class program2 {
    public static void main(String[] args) {
        box1 obj=new box1();
        obj.height=10;
        obj.width=10;
        obj.depth=10;
        obj.volume();
        box1 obj1=new box1();
        obj1.height=2;
        obj1.width=2;
        obj1.depth=2;
        obj1.volume();
        
        
        
    }
    
}
class box1 {
    double height;
    double width;
    double depth;
    void volume(){
        double vol=height*width*depth;
        System.out.println("the volume="+(vol));
    }
    
}