package teoria.interfaces.introduccion;

public class AIngles implements A{
    @Override
    public String saludar(String nombre) {
        return String.format("Hello %s", nombre);
    }
}
