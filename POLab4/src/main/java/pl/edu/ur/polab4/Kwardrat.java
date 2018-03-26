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
public class Kwardrat {
    
    float a ;
    
    public Kwardrat(float a){
        this.a= a;
        
    }
    
    public double liczPole(){
        float pole;
        pole=a*a;
        return pole;
    }
    
    public double liczObwód(){
        float obwód;
        obwód=2*a;
        return obwód;
    
    }
    public void wyświetlDane(){
    System.out.println("Bok kwadratu wynosi : " +a);
    System.out.println("Pole kwadratu wynosi : " +liczPole());
    System.out.println("Obwód kwadratu wynosi : " +liczObwód());


}   
    
    
    
}
