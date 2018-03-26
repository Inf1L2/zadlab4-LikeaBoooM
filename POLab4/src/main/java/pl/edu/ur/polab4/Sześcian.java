/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import static java.lang.Math.PI;

/**
 *
 * @author Mati
 */
public class Sześcian {
    float a;
    
    
    public Sześcian(float a){
    this.a = a;    
    }
    
    public double liczPole(){
    double pole;
    pole = 6*a*a;
    return pole;
}

public double liczObjetosc(){
    double objetosc;
    objetosc= a*a*a;
    return objetosc;
}

public void wyświetlDane(){
   System.out.println("Bok szescianu  : " +a);
   System.out.println("Pole szescianu wynosi : " +liczPole());
   System.out.println("Objetosc szescianu : " +liczObjetosc());

    
    
}
}
