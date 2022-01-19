package numeros;

public class Numeros {
    public static void main(String[] args) {
        String numero = "-000000";
        if (esNumeroEntero(numero))
            System.out.printf("%d%n",Integer.parseInt(numero));

    }
    //encajar 0,1,2 .... 22, 23 ...... también 000012
    public static boolean esNumeroNatural(String sNumero) {
        return sNumero.matches("[0-9]+");
    }
    //encajar 1,2,3, .....55,56....   también 000055
    public static boolean esNumeroNaturalSinCero(String sNumero) {
      //  return sNumero.matches("(0+[1-9][0-9]*)|([1-9][0-9]*)");
        return sNumero.matches("0*[1-9][0-9]*");
    }
    //encajar con números enteros: los naturales con cero y negativos
    public static boolean esNumeroEntero(String sNumero) {
        // -00000002522
        return sNumero.matches("-?[0-9]+");
    }
    //encajar números reales: los de antes mas los decimales
    //0.23 0.230000   000023.255550 .5666?
}
