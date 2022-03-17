package ejercicios.ejercicio1;

public class Persona {
    private String nombrePersona;
    private String apellidos;
    private String email;
    private String genero;
    private String pais;

    public Persona(String nombrePersona, String apellidos,
                   String email, String genero, String pais) {
        this.nombrePersona = nombrePersona;
        this.apellidos = apellidos;
        this.email = email;
        this.genero = genero;
        this.pais = pais;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", nombrePersona, apellidos, email,
                genero, pais);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return email != null ? email.equals(persona.email) : persona.email == null;
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
