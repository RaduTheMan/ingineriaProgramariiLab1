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
public class Cal extends Terestru {
    
    private String habitat;
    private String name;
    private int lifespan; //years
    private double mass; //kg
    private double height; //m
    public Cal() //cal default
    {
        habitat="ferma";
        name="calutu";
        lifespan=25;
        mass=500;
        height=1.4;
    }
    
    @Override
    public String getHabitat()
    {
        return habitat;
    }
    
    @Override
    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getLifespan()
    {
        return lifespan;
    }
    
    public void setLifeSpan(int lifespan)
    {
        this.lifespan = lifespan;
    }
    
    public double getMass()
    {
        return mass;
    }
    
    public void setMass(double mass)
    {
        this.mass = mass;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Numele calului: " + name);
        System.out.println("Durata estimata de viata: " + lifespan);
        System.out.println("Habitat: " + habitat);
        System.out.println("Masa: " + mass + " kg");
        System.out.println("Inaltime: " + height + " m");
    }
}
