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
    
    protected String habitat;
    protected String name;
    protected int lifespan; //years
    protected double mass; //kg
    protected double height; //m
    protected double speed; // km/h
    public Cal() //cal default
    {
        habitat="ferma";
        name="calutu";
        lifespan=25;
        mass=500;
        height=1.4;
        speed=80;
    }
    public Cal(String habitat, String name, int lifespan, double mass, double height, double speed)
    {
        this.habitat = habitat;
        this.name = name;
        this.lifespan = lifespan;
        this.mass = mass;
        this.height = height;
        this.speed = speed;
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
    
    public double getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
    
    public void printAction()
    {
        System.out.println("Calul " + name + " alearga cu o viteza de: " + speed + " km/h");
        System.out.println("");
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Numele calului: " + name);
        System.out.println("Durata estimata de viata: " + lifespan + " ani");
        System.out.println("Habitat: " + habitat);
        System.out.println("Masa: " + mass + " kg");
        System.out.println("Inaltime: " + height + " m");
        System.out.println("");
    }
}
