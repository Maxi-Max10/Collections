
package coleccioneseje4;


public class PeliEnti {
    
    private String titulo;
    private String director;
    private Integer horas;

    public PeliEnti() {
    }

    public PeliEnti(String titulo, String director, Integer horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\n"+"Director: "+director+"\n"+"Duración: "+horas;
    }

}
