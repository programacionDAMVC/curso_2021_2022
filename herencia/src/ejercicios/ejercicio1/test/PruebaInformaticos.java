package ejercicios.ejercicio1.test;

import ejercicios.ejercicio1.clases.Analista;
import ejercicios.ejercicio1.clases.Informatico;
import ejercicios.ejercicio1.clases.Lenguaje;
import ejercicios.ejercicio1.clases.Programador;

import java.util.ArrayList;
import java.util.List;

public class PruebaInformaticos {
    public static void main(String[] args) {

        List<Informatico> listaInformaticos = new ArrayList<>();
        Informatico analista1 = new Analista("empresa1", "base de datos");
        analista1.setSueldoPorHoras(75);
        listaInformaticos.add(analista1);
        Informatico analista2 = new Analista("empresa1", "web");
        analista2.setSueldoPorHoras(55);
        listaInformaticos.add(analista2);
        Informatico programador1 = new Programador("empresa2", Lenguaje.JAVA);
        listaInformaticos.add(programador1);
        Informatico programador2 = new Programador("empresa2", Lenguaje.KOTLIN);
        listaInformaticos.add(programador2);

        mostrarDatos(listaInformaticos);

    }
    private static void mostrarDatos(List<Informatico> listaInformaticos){
        for (Informatico informatico: listaInformaticos) {
            System.out.printf("Empresa %S, sueldo por horas %.2f, sueldo total %.2f, ",
                    informatico.getNombreEmpresa(), informatico.getSueldoPorHoras(),
                    informatico.recibirSueldo(10));
            //si es analista mostramos su especialidad
            if (informatico instanceof Analista)
                System.out.printf("ANALISTA de especialidad %S%n",
                        ((Analista) informatico).getEspecialidad());
            //si es programador mostramos el lenguaje de programación
            else
                System.out.printf("PROGRAMADOR de lenguaje %S%n",
                        ((Programador) informatico).getLenguaje());
        }
    }
}
