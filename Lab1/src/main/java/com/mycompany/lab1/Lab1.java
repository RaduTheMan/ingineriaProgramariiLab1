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
        Cal myCal = new Iapa("munte", "Rocinante", 13, 480, 1.3, 54);
        Cal myCal2 = new Cal();
        myCal.printAction();
        myCal2.printAction();
        myCal.printInfo();
        myCal2.printInfo();
        
    }
    
}
