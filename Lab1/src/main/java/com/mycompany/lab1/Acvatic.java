/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author Vlad
 */
abstract class Acvatic implements Animal {
    private String enviroment="Acvatic";
    
    @Override
    public String getEnviroment()
    {
        return enviroment;
    }
    abstract String getHabitat();
}
 /* To do: 
    - getHabitat()
    - 2 clase cu animale: 
        - implementam habitat
        - sa facem method overloading
        - 
*/