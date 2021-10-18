
package coleccioneseje4;

import java.util.Comparator;


public class Comparadores {
  
    public static Comparator<PeliEnti> ordenMaM = new  Comparator<PeliEnti>() {
        @Override
        public int compare(PeliEnti t, PeliEnti t1) {
            
            return t1.getHoras().compareTo(t.getHoras());
        
        }
    };
    
    public static Comparator<PeliEnti> ordenMeAm = new  Comparator<PeliEnti>() {
        @Override
        public int compare(PeliEnti t, PeliEnti t1) {
            
            return t.getHoras().compareTo(t1.getHoras());
        
        }
    };
    public static Comparator<PeliEnti> ordenTitulo = new Comparator<PeliEnti>() {
        @Override
        public int compare(PeliEnti t, PeliEnti t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<PeliEnti> ordenDire = new Comparator<PeliEnti>() {
        @Override
        public int compare(PeliEnti t, PeliEnti t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
