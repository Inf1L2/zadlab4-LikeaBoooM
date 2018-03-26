package pl.edu.ur.polab4;
import pl.edu.ur.polab4.*;

import java.util.Scanner;
import pl.edu.ur.polab4.Studenci;
import pl.edu.ur.polab4.Student;

public class Main {
     
static Studenci base= new Studenci();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainmenu(0);
    }
    private static void mainmenu(int mainmenu){
        Scanner wczytaj = new Scanner(System.in);
        switch(mainmenu){
            case 0 :
            System.out.println("Wybierz zadanie : ");
            System.out.println("4 . Zadanie opierające sie na figurach  : ");
            System.out.println("5 . Zadanie opierające sie na studentach  : ");
            mainmenu(wczytaj.nextInt());
                    
            break;
            
            case 4 : 
            System.out.println("Wybrałeś zadanie 4 . ");
            System.out.println("Wybierz daną figure");
            System.out.println("1. Koło : ");
            System.out.println("2. Kula : ");
            System.out.println("3. Kwadrat : ");
            System.out.println("4. Prostokąt : ");
            System.out.println("5. Stożek : ");
            System.out.println("6. Sześcian : ");
            System.out.println("7. Prostopadłościan : ");
           
            int n;
            n= wczytaj.nextInt();
            switch(n){
            case 1:    
            System.out.println("1. Koło : ");
            System.out.println("Podaj promień : ");
            Kolo kolo = new Kolo(wczytaj.nextInt());
            kolo.wyświetlDane();
            break;
            
            case 2:    
            System.out.println("2. Kula : ");
            System.out.println("Podaj promień : ");
            Kula kula = new Kula(wczytaj.nextInt());
            kula.wyświetlDane();
            break;
            
            case 3:    
            System.out.println("3. Kwadrat : ");
            System.out.println("Podaj bok a : ");
            Kwardrat kwadrat= new Kwardrat(wczytaj.nextInt());
            kwadrat.wyświetlDane();
            break;
            
            case 4:    
            System.out.println("4. Prostokąt : ");
            System.out.println("Podaj a i b : ");
            Prostokąt prostokat= new Prostokąt(wczytaj.nextInt(), wczytaj.nextInt());
            prostokat.wyświetlDane();
            break;
            
            case 5:    
            System.out.println("5. Stożek : ");
            System.out.println("Podaj r i l i h : ");
            Stożek stozek = new Stożek(wczytaj.nextInt(),wczytaj.nextInt(),wczytaj.nextInt());
            stozek.wyświetlDane();
            
            break;
            
            case 6:    
            System.out.println("6. Sześcian : ");
            System.out.println("Podaj bok a : ");
            Sześcian szescian= new Sześcian(wczytaj.nextInt());
            szescian.wyświetlDane();
            break;
            
            case 7:    
            System.out.println("7. Prostopadłościan : ");
            System.out.println("Podaj bok a i b i c : ");
            Prostopadłościan prostopadloscian = new Prostopadłościan(wczytaj.nextInt(),wczytaj.nextInt(),wczytaj.nextInt());
            prostopadloscian.wyświetlDane();
            break;
            
            default : 
            }
            case 5 :
            System.out.println("Wybrałeś zadanie 5 . ");
            System.out.println("[1] - Wprowadzić studenta\n");
            System.out.println("[2] - Edytować dane studenta\n"                                );
            System.out.println("[3] - Usunąć studenta po numerze\n");
            System.out.println("[4] - Wyświetlić dane studenta\n");
            System.out.println("[5] - Wyświetlić wszystkich studentów\n");
            System.out.println("[6] - Wyświetlić studentów o podanym zakresie\n");
            int m;
            m=wczytaj.nextInt();
            switch(m){
                case 1 : System.out.println("Wprowadzić studenta\n");
                System.out.println("Podaj nr indexu tablicy pod który chcesz wprowadzić dane");
                base.wprowadzStudenta(chooseOption());
                mainmenu(5);
                break;
             
                case 2 : System.out.println("Edytować dane studenta\n");
                System.out.println("Podaj nr indeksu studenta którego chcesz edytować");
                base.edytujpoIndex(chooseOption());
                mainmenu(5);
                break;
                
                case 3 : System.out.println("Usunąć studenta po numerze\n");
                System.out.println("Podaj nr indeksu studenta do usuniecia.");
                base.usunStudent(chooseOption());
                mainmenu(5);
                break;
                
                case 4 : System.out.println("Wyświetlić dane studenta\n");
                System.out.println("Podaj numer indeksu studenta do wyświetlenia.");
                base.wyswietlpoIndeks(chooseOption());
                mainmenu(5);
                break;
                
                case 5 : System.out.println("Wyświetlić wszystkich studentów\n");
                base.wyswietlDane(0, 99);
                mainmenu(5);
                break;
               
                case 6 : System.out.println("Wyświetlić studentów o podanym zakresie\n");
                base.wyswietlDane(chooseOption(),chooseOption());
                mainmenu(5);
                break;
                default: 
             }
  
        }
                
    }
    
    private static int chooseOption(){
        Scanner wczytaj= new Scanner(System.in);
    return wczytaj.nextInt();
    
}
}





    


