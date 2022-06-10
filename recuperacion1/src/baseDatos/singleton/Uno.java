package baseDatos.singleton;

public class Uno {

    private static Uno uno; //uno de los atributos es un objeto de la misma clase

    private Uno() {}

    public static Uno getUno() {
        if (uno == null)
            uno = new Uno();
        return uno;
    }

}
