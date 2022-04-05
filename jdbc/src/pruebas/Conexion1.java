package pruebas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conexion1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try (Connection connection = getConexion()) {
            crearTablas(connection);
            List<Persona> listaPersonas = crearListaPersonas();
            insertarPersonasBD(listaPersonas, connection);
            listaPersonas =obtenerTodasLasPersonas(connection);
            listaPersonas.forEach(System.out::println);
            String dni = solictarDni();
            Persona persona = buscarPersonaPorDni(connection, dni);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (sc != null)
            sc.close();
    }

    private static Persona buscarPersonaPorDni(Connection connection, String dni) {
        //ejecutar la sentencia  SELECT * FROM usuarios WHERE dni ='12345678o';
        //crear el Statement
        //crear el ResultSet
        //obtener el dato del ResulSet y crear un objeto Persona
        //devolver el objeto Person
        return null;
    }

    private static String solictarDni() {
        String dni = "";
        do {
            System.out.printf("Introduce el dni de la persona %d%n");
            dni = sc.nextLine();
        } while (! dni.matches("[0-9]{8}[a-zA-z]"));
        return dni;
    }

    private static List<Persona> obtenerTodasLasPersonas(Connection conexion) throws SQLException {
        String sql = "SELECT * FROM usuarios;";
        Statement sentenecia = conexion.createStatement();
        ResultSet resultado = sentenecia.executeQuery(sql);
        List<Persona> lista = new ArrayList<>();
        while (resultado.next()){
            String nombre = resultado.getString("nombre");
            int edad      = resultado.getInt("edad");
            String dni    = resultado.getString("dni");
            Persona persona = new Persona(nombre, edad, dni);
            lista.add(persona);
        }
        if (resultado != null)
            resultado.close();
        if (sentenecia != null)
            sentenecia.close();
        return lista;
    }


    private static void insertarPersonasBD(List<Persona> listaPersonas, Connection conexion)
            throws SQLException {
        Statement sentencia = conexion.createStatement();
        for (Persona persona: listaPersonas) {
            String sql = " INSERT INTO usuarios (nombre, edad, dni) VALUES ('" + persona.getNombrePersona()
                    + "'," + persona.getEdad() + ",'" + persona.getDni() + "');";
            sentencia.executeUpdate(sql);
        }
        if (sentencia != null)
            sentencia.close();

    }

    private static List<Persona> crearListaPersonas() {
        
        List<Persona> lista = new ArrayList<>();
        String sOpcion = "", nombre = "", sEdad = "", dni ="";
        do {
            System.out.println("Introduce número de personas a dar de alta, de 1 a 10 máximo");
            System.out.println("En caso de cero, significa que no quieres dar de alta usuarios");
            sOpcion = sc.nextLine();
        } while (!sOpcion.matches("[0-9]|10"));
        int iOpcion = Integer.parseInt(sOpcion);
        if (iOpcion == 0)
            return lista;
        for (int i = 0; i < iOpcion; i++) {
            do {
                System.out.printf("Introduce el nombre de la persona %d%n", i + 1);
                nombre = sc.nextLine();
            } while (! nombre.toLowerCase().matches("[a-záéíóúüñ]{2,}\s*([a-záéíóúüñ]{1,}\s*)*"));
            do {
                System.out.printf("Introduce el edad de la persona %d%n", i + 1);
                sEdad = sc.nextLine();
            } while (! sEdad.matches("[0-9]|[1-9][0-9]|1[01][0-9]|120"));
            int iEdad = Integer.parseInt(sEdad);
            dni = solictarDni();
            Persona persona = new Persona(nombre, iEdad, dni);
            lista.add(persona);
        }
        
        return lista;

    }

    private static Connection getConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(
                "jdbc:sqlite:DATABASES/test.db");
        return conexion;
    }
    private static void crearTablas(Connection conexion) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT, " +
                "edad INTEGER," +
                "dni TEXT UNIQUE" +
                ")";
        Statement sentencia = conexion.createStatement();
        sentencia.executeUpdate(sql);
        //System.out.println(resultado);
        if (sentencia != null)
            sentencia.close();
    }
}
