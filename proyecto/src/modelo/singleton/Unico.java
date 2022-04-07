package modelo.singleton;

public class Unico {
    private static Unico unico;
    private Unico() {}
    public static Unico getUnico() {
        if (unico == null)
            unico = new Unico();
        return unico;
    }
}
