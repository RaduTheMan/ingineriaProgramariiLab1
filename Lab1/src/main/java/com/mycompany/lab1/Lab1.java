/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author Radu
 */
public class Lab1 {
    
    public static void main(String args[])
    {
        String habitat;
        
        Delfin myDelfin = new Delfin() ;
        habitat = myDelfin.getHabitat();
        System.out.println(habitat);
        myDelfin.action();
        myDelfin.action(80);
    }
    
}


