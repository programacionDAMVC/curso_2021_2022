package modelo.dao.usuario;

public class Usuario {

    private String nombre;
    private String apellidos;
    private String telefono;
    private String dni;
    private String email;
    private int rol = 0;
    private String password;

    public Usuario(String nombre, String apellidos, String telefono,
                   String dni, String email, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dni = dni;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%d,%s",
                nombre, apellidos, telefono, dni, email, rol, password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return dni != null ? dni.equals(usuario.dni) : usuario.dni == null;
    }

    @Override
    public int hashCode() {
        return dni != null ? dni.hashCode() : 0;
    }
}
