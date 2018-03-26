package pl.edu.ur.polab4;

import static java.lang.Math.PI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mati
 */
public class Kolo{
   float r;
   
   
    public Kolo(float r){
    this.r=r ;
    }

public double liczPole(){
   double pole;
   pole = PI*r*r;
   return pole;
}

public double liczObwód(){
    double obwód;
    obwód= 2*PI*r;
    return obwód;
}

public void wyświetlDane(){
   System.out.println("Promien koła wynosi : " +r);
   System.out.println("Pole koła wynosi : " +liczPole());
   System.out.println("Obówd koła wynosi : " +liczObwód());


}   
}
