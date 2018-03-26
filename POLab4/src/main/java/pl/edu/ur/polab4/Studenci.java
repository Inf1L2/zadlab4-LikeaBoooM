/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Studenci {
    Student tab[]=new Student[100];
    
    public Studenci(){
        for(int i=0 ; i<100; i++){
            Student student= new Student("","","",0,0);
            tab[i]=student;        
        }
    }
    public void wprowadzStudenta(int indeks){
        Scanner wczytaj = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        tab[indeks].imie=wczytaj.next();
        System.out.print("Podaj nazwisko: ");
        tab[indeks].nazwisko=wczytaj.next();
        System.out.print("Podaj kierunek: ");
        tab[indeks].nazwa_specjalnosci=wczytaj.next();
        System.out.print("Podaj nr indeksu: ");
        tab[indeks].nr_indeksu=wczytaj.nextInt();
        System.out.print("Podaj rok studiów: ");
        tab[indeks].rok=wczytaj.nextInt();
     
    }
    public int znajdzpoIndex(int nr){
        for (int i=0;i<=99;i++){
            if(tab[i].nr_indeksu==nr){
            return i;   
    }
    }
        return 100;
    }
    public void wyswietlDane(int poczatek, int koniec){
        for (int i=poczatek;i<=koniec;i++){
            System.out.println("=>Imie: "+tab[i].imie+" Nazwisko: "+tab[i].nazwisko+" Kierunek: "+tab[i].nazwa_specjalnosci+" Nr.albumu: "+tab[i].nr_indeksu+" Rok: "+tab[i].rok);
    }}
    public void wyswietlpoIndeks(int nr){
        int nrindex=znajdzpoIndex(nr);
        wyswietlDane(nrindex,nrindex);
    }
    public void edytujpoIndex(int nr){
        int nrindex=znajdzpoIndex(nr);
        wyswietlDane(nrindex,nrindex);
        wprowadzStudenta(nrindex);
    }
    public void usunStudent(int nr){
        int nrindex=znajdzpoIndex(nr);
        wyswietlDane(nrindex,nrindex);
        usunStudentaM(nrindex);
        
    }
    public void usunStudentaM(int indeks){
            tab[indeks].imie="";
            tab[indeks].nazwisko="";
            tab[indeks].nazwa_specjalnosci="";
            tab[indeks].nr_indeksu=0;
            tab[indeks].rok=0;  
    }
    
}

