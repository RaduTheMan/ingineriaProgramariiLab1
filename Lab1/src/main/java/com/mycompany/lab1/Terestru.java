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
abstract class Terestru implements Animal {
    
    private String enviroment="Terestru";
    
    @Override
    public String getEnviroment()
    {
        return enviroment;
    }
    abstract String getHabitat();
}
