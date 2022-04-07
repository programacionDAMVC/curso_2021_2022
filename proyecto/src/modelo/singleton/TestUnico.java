package modelo.singleton;

public class TestUnico {
    public static void main(String[] args) {
        Unico unico1 = Unico.getUnico();
        Unico unico2 = Unico.getUnico();
        Unico unico3 = Unico.getUnico();
        System.out.println(unico1);
        System.out.println(unico2);
        System.out.println(unico3);
    }
}
