
package package1;

public class main {
    
    public static void main(String[] args) {
        elegir();
    }
    
    public static void elegir(){
        Eleccion eleccion = new Eleccion();
        eleccion.setLocationRelativeTo(null);
        eleccion.setTitle("Eleccion");
        eleccion.setVisible(true);
    }
    
}
