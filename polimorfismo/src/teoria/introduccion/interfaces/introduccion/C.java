package teoria.introduccion.interfaces.introduccion;

public class C implements B{
    @Override
    public String saludar(String nombre) {
        return "Hi " + nombre;
    }

    @Override
    public double cambiar(double euros) {
        return euros * CAMBIO_LIBRA;
    }
}
