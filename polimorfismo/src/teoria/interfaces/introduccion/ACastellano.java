package teoria.interfaces.introduccion;

public class ACastellano implements A{
    @Override
    public String saludar(String nombre) {
        return String.format("Hola %s", nombre);
    }
}
