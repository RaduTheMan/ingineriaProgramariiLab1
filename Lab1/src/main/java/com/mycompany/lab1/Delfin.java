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
class Delfin extends Acvatic {
    String habitat="Ocean";
    @Override
    public String getHabitat(){
        return habitat;
    }
    public void action(){
        System.out.println("Delfinul innoata!");
    }
    public void action(int viteza){
        System.out.println("Delfinul innoata cu o viteza de " + viteza + "km/h");
    }
}
