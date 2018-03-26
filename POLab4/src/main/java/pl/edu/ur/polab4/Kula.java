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
public class Kula{
   float r;
   
   
    public Kula(float r){
    this.r=r ;
    }

public double liczPole(){
   double pole;
   pole = 4*PI*r*r;
   return pole;
}

public double liczObjetosc(){
    double objetosc;
    objetosc= 4/3*PI*r*r*r;
    return objetosc;
}

public void wyświetlDane(){
   System.out.println("Promien kuli wynosi : " +r);
   System.out.println("Pole kuli wynosi : " +liczPole());
   System.out.println("Objetosc kuli : " +liczObjetosc());


}   
}
