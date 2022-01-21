package numeros;

/**
 * Clase Numeros, contiene métodos para parsear el formato
 * de los dígitos en mátemáticas. Se parsea tanto números naturales (N)
 * números enteros (Z) y números reales (R)
 * @author Manuel Molino
 * @version 1.1.0
 */
public class Numeros {

    /*public static void main(String[] args) {
      //  System.out.println("\"hola\" mundo");
      //  System.out.println("........".matches("\\.+"));
        String numero = "+2222222e-000001";

        if (esNumeroReal(numero)){
          //  numero = numero.replace(",", ".");
            System.out.printf("%.5f%n",formatearNumeroReal(numero));
        }
      //  System.out.println(esNumeroNaturalSinCero("+0000032"));

    }*/


    /**
     * Método que comprueba el formato de un número natural
     * incluimos el 0, ejemplo de formatos válidos
     * 0, 1, 2 ..., 23 ....
     * admitimos los 0 a la izquierda 0001  00012
     * admitimos el signo + delante de los dígitos +25, +00025, ...
     * @param sNumero a formatear
     * @return si es o no es un número natural
     */
    public static boolean esNumeroNatural(String sNumero) {
        return sNumero.matches("\\+?[0-9]+");
    }
    /**
     * Método que comprueba el formato de un número natural
     * incluimos SIN EL 0, ejemplo de formatos válidos
     * 1, 2 ..., 23 ....
     * admitimos los 0 a la izquierda 0001  00012
     * admitimos el signo + delante de los dígitos +25, +00025, ...
     * @param sNumero a formatear
     * @return si es o no es un número natural EXCLUYENDO el 0
     */
    public static boolean esNumeroNaturalSinCero(String sNumero) {
      //  return sNumero.matches("(0+[1-9][0-9]*)|([1-9][0-9]*)");
        return sNumero.matches("\\+?0*[1-9][0-9]*");
    }
    /**
     * Método que comprueba el formato de un número entero
     * los  números enteros son los naturales, mas el cero y negativos
     * 0, 1, 2 ..., 23 ....
     * -23, -2666, ...
     * admitimos los 0 a la izquierda 0001  00012  -00025
     * admitimos el signo + delante de los dígitos +25, +00025, ...
     * @param sNumero a formatear
     * @return si es o no es un número entero
     */
    public static boolean esNumeroEntero(String sNumero) {
        // -00000002522
        return sNumero.matches("[-+]?[0-9]+");
    }
    /**
     * Método que comprueba el formato de un número real
     * los números reales son los enteros mas los números decimales
     * 0, 1, 2 ..., 23 ....  0.23  23.26  .23  26.
     * admitimos los 0 a la izquierda 0001  00012  00012.23
     * admitimos el signo + delante de los dígitos +25, +0002.5, ...
     * incluimos la notación científica
     * 2e4  -2e4 +2e4  -2,2e5 -000002.2e-9
     * @param sNumero a formatear
     * @return si es o no es un número real
     */
    public static boolean esNumeroReal (String sNumero) {
        return  esNotacionCientifica(sNumero) ||
                esNumeroDecimal(sNumero) || esNumeroEntero(sNumero);
    }

    private static boolean esNotacionCientifica(String sNumero) {
        //2e4  -2e4 +2e4  -2,2e5 -000002.2e-9
        return sNumero.matches("[-+]?[0-9]*[\\.,]?[0-9]*e[-+]?[0-9]+");
    }

    private static boolean esNumeroDecimal(String sNumero) {
        //2.23  -25.2222 -0.23333 .2-3  .698  23.
        return sNumero.matches("[-+]?[0-9]*[\\.,][0-9]*");
    }

    /**
     * Método  que formatea los números reales, para cambiar el formato
     * de número con coma decimal en punto decimal, ejemplo:
     * 2,23 lo convierte en 2.23
     * @param sNumero cadena que contiene un número real
     * @return un número double convertido con parseDouble
     */
    public static double formatearNumeroReal(String sNumero) {
        return Double.parseDouble(sNumero.replace(",","."));
    }

    //método aceptar numeros reales mas notación científica
    //  +0.23e15  -25.23e-25.23
}
