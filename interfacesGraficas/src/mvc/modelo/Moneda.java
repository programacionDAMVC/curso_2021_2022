package mvc.modelo;

public class Moneda {

    private static float UN_EURO_A_DOLARES = 1.05f;
    private float cantidad;

    public Moneda () {}
    public Moneda(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "cantidad=" + cantidad +
                '}';
    }
    public float convertirADolares() {
        return cantidad * UN_EURO_A_DOLARES;
    }
    public float convertirAEuros() {
        return cantidad / UN_EURO_A_DOLARES;
    }

}
