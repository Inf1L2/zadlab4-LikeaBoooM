/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Mati
 */
public class Prostopadłościan {
    float a, b,c;
    public Prostopadłościan(float a,float b, float c){
       this.a = a ;
       this.b = b ;
       this.c = c ;
    }
    public double liczPole(){
        double pole;
        pole = 2*((a*b)+(a*c)+(b*c));
        return pole;
    }
    public double liczObjetosc(){
        double objetosc;
        objetosc = a * b * c;
        return objetosc;
    }
   public void wyświetlDane(){
   System.out.println("Boki prostopadłościanu wynoszą : " +a +b +c );
   System.out.println("Pole prostopadłościanu wynosi : " +liczPole());
   System.out.println("Objetosc prostopadłoscianu wynosi : " +liczObjetosc());

}
}
