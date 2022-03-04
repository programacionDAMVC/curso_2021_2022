package ejercicios.ejercicio1;

import java.util.Scanner;

public class TestTrabajadores {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //el ejercicio no pide que usemos Scanner
        final int NUMERO_TRABAJADORES = 4;
        Trabajador[] trabajadores = new Trabajador[NUMERO_TRABAJADORES];
        for (int i = 0; i < NUMERO_TRABAJADORES; i++) {
            Trabajador trabajador = crearTrabajador();
            trabajadores[i] = trabajador;
        }
        mostrarDatosTrabajador(trabajadores);
        sc.close();
    }

    private static void mostrarDatosTrabajador(Trabajador[] trabajadores) {
        String sDias = null;
        do {
            System.out.println("introduce los días trabajados");
            sDias = sc.nextLine();
        } while (! sDias.matches("([1-9]|[12][0-9]|3[01])"));
        int iDias = Integer.parseInt(sDias);
        String datoParticular = null;
        for (Trabajador trabajador: trabajadores) {
            if (trabajador instanceof Tecnico) {
                Tecnico tecnico = (Tecnico) trabajador; //downcasting
                datoParticular = tecnico.getTitulacion().toString();

            } else {
                Oficial oficial = (Oficial) trabajador;
                datoParticular = oficial.getClase().toString();
            }
            System.out.printf("%-30s%-20s%-10.2f%n", trabajador.obtenerNombreCompleto(),
                    datoParticular, trabajador.calcularSueldoMensual(iDias));
        }
    }

    private static Trabajador crearTrabajador() {
        System.out.println("Introduce nombre del trabajador");
        String nombreTrabajador = crerDatoTrabajador();
        System.out.println("Introduce apellidos del trabajador");
        String apellidosTrabajador = crerDatoTrabajador();
        System.out.println("Indica tipo de trabajador");
        String opcion = elegirTipoTrabajador();
        Grado grado = null;
        Titulacion titulacion = null;
        if (opcion.equals("1")) {
            grado = obtenerGrado();
            return new Oficial(nombreTrabajador, apellidosTrabajador, grado);
        } else {
            titulacion = obtenerTitulacion();
            return new Tecnico(nombreTrabajador, apellidosTrabajador, titulacion);
        }
    }

    private static Titulacion obtenerTitulacion() {
        Titulacion titulacion = null;
        String opcion = null;
        do {
            System.out.println("1. Técnico superior");
            System.out.println("2. Técnico medio");
            System.out.println("3. Ciclo formativo");
            opcion = sc.nextLine();
        } while (! opcion.matches("[1-3]"));
        switch (opcion) {
            case "1":
                titulacion = Titulacion.SUPERIOR;
                break;
            case "2":
                titulacion = Titulacion.MEDIO;
                break;
            default:
                titulacion = Titulacion.CICLO_FORMATIVO;
                break;
        }
        return titulacion;
    }

    private static Grado obtenerGrado() {
        String opcion = null;
        do {
            System.out.println("1. Oficial de primera");
            System.out.println("2. Oficial de segunda");
            System.out.println("3. Oficial de tercera");
            opcion = sc.nextLine();
        } while (!opcion.matches("[1-3]"));
        switch (opcion) {
            case "1":
                return Grado.PRIMERA;
            case "2":
                return Grado.SEGUNDA;
            default:
                return Grado.TERCERA;
        }
    }

    private static String elegirTipoTrabajador() {
        String opcion = null;
        do {
            System.out.println("1. OFICIAL");
            System.out.println("2. TÉCNICO");
            opcion = sc.nextLine();
        } while (! opcion.matches("[12]"));
        return  opcion;
    }

    private static String crerDatoTrabajador() {
        String datoTrabajador = null;
        do {
            System.out.println("Introduce datos del trabajador");
            datoTrabajador = sc.nextLine();
        } while (! datoTrabajador.toLowerCase().
                matches("[a-zñáéíóúü]{2,}(\s[a-zñáéíóúü]{2,})?"));
        return datoTrabajador;
    }
}
