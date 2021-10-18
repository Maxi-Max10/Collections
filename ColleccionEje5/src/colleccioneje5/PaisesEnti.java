
package colleccioneje5;

import java.util.Objects;


public class PaisesEnti implements Comparable<PaisesEnti> { //7 ACA 1
    
    private String paises;

    public PaisesEnti() {
    }

    public PaisesEnti(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }
    
    @Override
    public String toString(){
        return "Pais: "+paises;
    }
//// ALT+INS Y AGREGO EQUALS() AND HASHCODE()
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisesEnti other = (PaisesEnti) obj;
        if (!Objects.equals(this.paises, other.paises)) {
            return false;
        }
        return true;
    }
    
///// COMPARO OBJETOS MODIFICO ARRIBA 1
    @Override
    public int compareTo(PaisesEnti t) {
        return this.paises.compareTo(t.getPaises());
    }
    
    

}
