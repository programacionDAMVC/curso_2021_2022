

import es.matematicas.Matematicas;

public class TestMatematicas{
   public static void main(String[] args){
	double numero1 = 5;
	double raiz1 = es.matematicas.Matematicas.calcularRaiz2(numero1);
	System.out.printf("La raíz de %.2f vale %.2f%n", numero1, raiz1);
	double numero2 = 9;
	double raiz2 = Matematicas.calcularRaiz2(numero2);
	System.out.printf("La raíz de %.2f vale %.2f%n", numero2, raiz2);
   }
}   
