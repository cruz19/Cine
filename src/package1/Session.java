
package package1;

public class Session {
    
    private final String nombre;
    private final String nickname;
    private final String contraseña;

    public Session(String nombre, String nickname, String contraseña) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContraseña() {
        return contraseña;
    }
    
}
