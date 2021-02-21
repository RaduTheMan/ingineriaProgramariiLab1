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
public class Iapa extends Cal {
    
    @Override
    public void printAction()
    {
       System.out.println("Iapa " + name + " alearga cu o viteza de: " + speed + " km/h"); 
        System.out.println("");
    }
    
    public Iapa() //iapa default
    {
        super();
    }
    
    public Iapa(String habitat, String name, int lifespan, double mass, double height, double speed)
    {
        super(habitat, name, lifespan, mass, height, speed);
    }
    
}
