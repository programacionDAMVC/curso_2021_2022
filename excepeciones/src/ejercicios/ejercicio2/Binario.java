package ejercicios.ejercicio2;

import teoria.excepcionesPropias.NoTrianguloRectanguloException;

public class Binario {
    private String valorBinario;  // debe ser 0s y 1s  ejem: 1001   111 001 101010
    //constructor

    public Binario(String valorBinario) throws BinarioException {
        if (esNumeroBinario(valorBinario))
            this.valorBinario = valorBinario;
        else
            throw new BinarioException();
    }

    private boolean esNumeroBinario(String valorBinario) {
        return valorBinario.matches("[01]+");
    }

    //getters

    public String getValorBinario() {
        return valorBinario;
    }

    //obtener el valor en decimal
    public int devolverValorEnDecimal() {
        //1010 la operación es: 0 * 2⁰ + 1 * 2¹ + 0 * 2² + 1 * 2³
        //índices               0(3)     1(2)     0(1)     1(0)  i = 3,2,1,0
        //elevado               0        1        2        3     i = 0,1,2,3
        //al revés 0101         1 * 2⁰ + 0 * 2¹ + 1 * 2² + 0 * 2³
        //indices               1(0)     0(1)     1(2)     0(3)   i = 0,1,2,3
        //elevado               0        1        2        3      i = 0,1,2,3
        int suma = 0;
        StringBuilder stringBuilder = new StringBuilder(valorBinario);
        stringBuilder.reverse();
        String valorBinarioAlReves = stringBuilder.toString();
        for (int i = 0; i < valorBinarioAlReves.length(); i++) {
            suma += (int) (Math.pow(2, i) * (valorBinarioAlReves.charAt(i) -48));
           // suma = (int) (Math.pow(2, i) * Integer.parseInt(
           //         valorBinarioAlReves.charAt(i) + "") );
        }
        return suma;
    }

    //toString
    @Override
    public String toString() {
        return String.format("Valor binario: %s, valor decimal: %d",
                valorBinario, devolverValorEnDecimal());
    }

  /*  public static void main(String[] args) throws BinarioException {
        Binario binario = new Binario("10");
        System.out.println(binario);

      //  System.out.println(esNumeroBinario("123"));
    }*/
}
