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
public class Stożek {
    float r,l,h;
    public Stożek(float r, float l,float h){
     this.r=r;
     this.l=l;
     this.h=h;
    }
    public double liczPole(){
    double pole;
    pole = (PI * r*r) + (PI * r * l);
    return pole;
    }
    public double liczObjetosc(){
    double objetosc;
    objetosc = (PI*r*r*h)/3;
    return objetosc; 
    }
    public void wyświetlDane(){
    System.out.println("Pole stożka wynosi : " +liczPole());
    System.out.println("Objetosc stożka wynosi : " +liczObjetosc());
   
}
    
}
