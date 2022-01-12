package matematicas.estadistica;

public class Basica {

    public static double calcularValorMedioArray(int[] array){
        double suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return suma / array.length;
    }
    public static int devolverNumeroMasGrandeDeArray(int[] array) {
        int numeroMasGrande = Integer.MIN_VALUE;
        for (int numero : array) {
            if (numero > numeroMasGrande)
                numeroMasGrande = numero;
        }
        return numeroMasGrande;
    }


}
