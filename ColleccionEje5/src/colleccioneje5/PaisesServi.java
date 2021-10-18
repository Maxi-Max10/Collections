
package colleccioneje5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class PaisesServi {
    
    private Scanner leer;
    private Set<PaisesEnti> pais;
    ////tembien puede ser HashSet

    public PaisesServi() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.pais = new TreeSet();
    }
    
    private PaisesEnti ingresoP(){
        
        System.out.println("Ingrese País");
        String ps = leer.next();
        
        return new PaisesEnti(ps);
    }
    
    public void op(){
        char op;
        do {
            pais.add(ingresoP());
            System.out.println("Desea ingresar otro pais? S si o N no");
            op = leer.next().charAt(0);
            
            
        } while (op != 'N');
        
        muestroP();
        
    }
    
   private void muestroP(){
        System.out.println("►►►►► L I S T A  D E  P A I S E S (Ordenados alfab.) ◄◄◄◄");
        pais.forEach(System.out::println);
    }
    
   public void elimP(){
       System.out.println("Ingrese pais que desea eliminar");
       String elim = leer.next();
       Iterator<PaisesEnti> it = pais.iterator();
       boolean b = true;
       
       while (it.hasNext()) {
           if (it.next().getPaises().equals(elim)) {
               it.remove();
               b = true;
               break;
               
           }else{
               b = false;
           }
           
       }
       if (b) {
           System.out.println(elim+" fue eliminado.");
           muestroP();
       }else{
           System.out.println(elim+" no encontrado.");
       }
       
        
       
   }

}
