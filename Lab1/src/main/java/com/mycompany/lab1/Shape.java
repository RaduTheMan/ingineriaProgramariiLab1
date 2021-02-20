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
abstract class Shape {
    
    private double area;
    public Shape()
    {
        area=0;
    }
    public double getArea()
    {
        return area;
    }
    abstract void calculateArea();
    
}
