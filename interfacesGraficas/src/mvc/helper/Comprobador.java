package mvc.helper;

public class Comprobador {
    public static boolean esUnFloat(String sFloat) {
        return sFloat.matches("[0-9]+|[0-9]+\\.[0-9]*");
    }

}
