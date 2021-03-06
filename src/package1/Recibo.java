
package package1;

import java.util.ArrayList;

public class Recibo {
    
    private final String titulo;
    private final String cliente;
    private final String sala;
    private final String horario;
    private final String rutaImagen;
    private final String pie_pagina;
    private final ArrayList<String> asientos;
    private final String codigo;
    private final String pelicula;
    private final String fecha;

    public Recibo(String titulo, String cliente, String pelicula, String fecha, String sala, String horario, String rutaImagen, String pie_pagina, ArrayList<String> asientos, String codigo) {
        this.titulo = titulo;
        this.rutaImagen = rutaImagen;
        this.cliente = cliente;
        this.sala = sala;
        this.horario = horario;
        this.pie_pagina = pie_pagina;
        this.asientos = asientos;
        this.codigo = codigo;
        this.pelicula = pelicula;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public String getCliente() {
        return cliente;
    }

    public String getSala() {
        return sala;
    }

    public String getPie_pagina() {
        return pie_pagina;
    }

    public ArrayList<String> getAsientos() {
        return asientos;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getPelicula(){
        return pelicula;
    }
    
    public String getFecha(){
        return fecha;
    }
    
}
