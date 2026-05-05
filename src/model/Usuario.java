package model;

public class Usuario {

    //Atributos del usuario
    private String email;
    private String username;
    private String password;
    private String rol;

    public Usuario(String email, String username, String password, String rol) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }
    
    // metodo que obtiene el email del Usuario
    public String getEmail() {
        return email;
    }

    // metodo que obtiene el nombre del Usuario
    public String getUsername() {
        return username;
    }

    // metodo que obtiene la contraseña del Usuario
    public String getPassword() {
        return password;
    }

    // metodo que obtiene el rol del Usuario
    public String getRol() {
        return rol;
    }
}