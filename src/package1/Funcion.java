
package package1;

public class Funcion {
    
    private final String pelicula;
    private final String horario;
    private final String sala;

    public Funcion(String pelicula, String horario, String sala) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public String getSala() {
        return sala;
    }
    
}
