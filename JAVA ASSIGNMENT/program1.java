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
public class program1 {
    public static void main(String[] args) {
        double v;
        box obj=new box();
        v=obj.vol;
        System.out.println("the volume is:"+v);
        
    }
    
}
class box{
    double height;
    double width;
    double depth;
    double vol;
    
    box() {
        height=10;
        width=10;
        depth=10;
        vol=height*width*depth;
    }
    
    
} 
