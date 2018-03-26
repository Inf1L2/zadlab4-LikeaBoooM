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
public class Prostokąt {
    float a,b;
    
    public Prostokąt(float a, float b){
        this.a=a;
        this.b=b;
        
    }
    public double liczPole(){
   double pole;
   pole = a*b;
   return pole;
}

public double liczObwód(){
    double obwód;
    obwód=2*a + 2*b;
    return obwód;
}

public void wyświetlDane(){
   System.out.println("Boki prostokąta wynoszą : " +a +b );
   System.out.println("Pole prostokąta wynosi : " +liczPole());
   System.out.println("Obwód prostokąta wynosi : " +liczObwód());

}
}
