package baseDatos.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Dos dos1 = new Dos("hola");
        Dos dos2 = new Dos("hola");
        Dos dos3 = new Dos("hola");
        System.out.println(dos1);
        System.out.println(dos2);
        System.out.println(dos3);
        System.out.println("'''''''''''''''");
        Uno uno1 = Uno.getUno();
        Uno uno2 = Uno.getUno();
        Uno uno3 = Uno.getUno();
        System.out.println(uno1);
        System.out.println(uno2);
        System.out.println(uno3);


    }
}
