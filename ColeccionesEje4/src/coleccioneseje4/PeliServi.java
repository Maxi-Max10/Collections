
package coleccioneseje4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PeliServi {
    
    private Scanner leer;
    private ArrayList<PeliEnti> mPelis;

    public PeliServi() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.mPelis = new ArrayList();
    }
    
    private PeliEnti creoP(){
        System.out.println("Nombre de pelicula: ");
        String nombre = leer.next();
        System.out.println("Nombre de Director: ");
        String direc = leer.next();
        System.out.println("Duración en hrs: ");
        Integer horas = leer.nextInt();
        
        PeliEnti a = new PeliEnti(nombre,direc,horas);
        mPelis.add(a); //AGERGO PELICULA A MI LISTA
        return a ;
    }
    
    public void op(){
        char op;
        do {
            System.out.println("---INGRESE PELICULA---");
            creoP();
            System.out.println("Añadir pelicula a la lista? (S , N)");
            op = leer.next().toUpperCase().charAt(0);            
            
        } while (op != 'N');
        
    }
    
    public void muetroP(){
        System.out.println("►►►►► L I S T A  D E  P E L I C U L A S◄◄◄◄");
        mPelis.forEach(aux ->{
            System.out.println("\n"+aux);
            System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
        });
    }
    
    public void mayoraH(){
        System.out.println("... PELICULAS CON DURACION MAYOR A UNA 1 HR ...");
        mPelis.stream().filter(peli->(peli.getHoras()>1)).forEach(peli ->{
            System.out.println(peli);
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        });
    }
    
    public void mayorAmenor(){
        System.out.println(".. . PELICULAS DE MAYOR A MENOR HS...");
        Collections.sort(mPelis, Comparadores.ordenMaM);
        
        mPelis.forEach(peli->{
            System.out.println(peli);
            System.out.println("════════════════════════");
        });
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●");
    }
    
    public void menorAmayor(){
        System.out.println(".. . PELICULAS DE MENOR A MAYOR HS . ..");
        Collections.sort(mPelis, Comparadores.ordenMeAm);
        
        mPelis.forEach(peli->{
            System.out.println(peli);
            System.out.println("════════════════════════");
        });
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●");
    }
    
    public void ordenT(){
        System.out.println(".. . ORDENAR PELICULAS TITULO ALFABETICAMENTE . ..");
        Collections.sort(mPelis, Comparadores.ordenTitulo);
        
        mPelis.forEach(peli->{
            System.out.println(peli);
            System.out.println("════════════════════════");
        });
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●");
    }
    
    public void ordenD(){
        System.out.println(".. . ORDENAR PELICULAS DIRECTOR ALFABETICAMENTE . ..");
        Collections.sort(mPelis, Comparadores.ordenDire);
        
        mPelis.forEach(peli->{
            System.out.println(peli);
            System.out.println("════════════════════════");
        });
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●");
    }
    
}
