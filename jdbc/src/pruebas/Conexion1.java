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
            System.out.println("Buscar persona por DNI");
            String dni1 = solictarDni();
            Persona persona = buscarPersonaPorDni(connection, dni1);
            System.out.printf("Persona %S con dni %s%n", persona, dni1);
            System.out.println("Borrar persona por DNI");
            String dni2 = solictarDni();
            boolean exitoBorrado = borrarPersonaPorDni(connection, dni2);
            System.out.printf("Borrado persona con dni %s, %B%n", dni2, exitoBorrado);
            System.out.println("Introduce dni de persona a  modificar");
            String dni = solictarDni();
            System.out.println("Introduce nombre de persona a  modificar");
            String nombre = solicitarNombre();
            System.out.println("Introduce edad de persona a  modificar");
            int edad = solicitarEdad();
            Persona persona1 = new Persona(nombre, edad, dni);
            boolean exitoModificado = actualizarPersonaPorDni(connection, persona1);
            System.out.printf("Actualizado persona con dni %s, %B%n", dni2, exitoModificado);

            /*String dni3 = "12' or 'a' = 'a";
            buscarPersonaPorDni(connection, dni3);  inyeccion sql*/
            sc.close();
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (sc != null)
            sc.close();
    }
    private static boolean actualizarPersonaPorDni(Connection connection, Persona persona) throws SQLException {
        //sentencia UPDATE usuarios SET nombre = 'luisito', edad = 15 WHERE dni = '01234567a';
        String sql = "UPDATE usuarios SET nombre = ?, edad = ? WHERE dni = ?;";
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, persona.getNombrePersona());
        sentencia.setInt(2, persona.getEdad());
        sentencia.setString(3, persona.getDni());
        int resultado = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return resultado != 0;
    }


    private static boolean borrarPersonaPorDni(Connection connection, String dni) throws SQLException {
        //sentencia DELETE FROM usuarios WHERE dni = '12345678o';
        String sql = "DELETE FROM usuarios WHERE dni ='" + dni + "';";
        Statement sentencia = connection.createStatement();
        int resultado = sentencia.executeUpdate(sql);
        //falta cerrar ResultSet y el Statement
        return resultado != 0;
    }

    private static Persona buscarPersonaPorDni(Connection connection, String dni) throws SQLException {
        //ejecutar la sentencia  SELECT * FROM usuarios WHERE dni ='12345678o';
        String sql = "SELECT * FROM usuarios WHERE dni ='" + dni + "';";
        Statement sentencia = connection.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        Persona persona = null;
        while (resultado.next()) {
            persona = new Persona(resultado.getString(2), resultado.getInt(3), resultado.getString(4));
        }
        return persona;
    }

    private static String solictarDni() {
        String dni = "";
        do {
            System.out.println("Introduce el dni de la persona");
            dni = sc.nextLine();
        } while (! dni.matches("[0-9]{8}[a-zA-z]"));
        return dni;
    }

    public static String solicitarNombre() {
        String nombre = "";
        do {
            System.out.println("Introduce el nombre de la persona");
            nombre = sc.nextLine();
        } while (! nombre.toLowerCase().matches("[a-záéíóúüñ]{2,}\s*([a-záéíóúüñ]{1,}\s*)*"));
        return nombre;
    }
    public static int solicitarEdad() {
        String sEdad = "";
        do {
            System.out.println("Introduce el edad de la persona");
            sEdad = sc.nextLine();
        } while (! sEdad.matches("[0-9]|[1-9][0-9]|1[01][0-9]|120"));
        int iEdad = Integer.parseInt(sEdad);
        return iEdad;
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
            //antes comprobamos que no existe ese dni en la BD
            Persona personaBD = buscarPersonaPorDni(conexion, persona.getDni());
            if (persona.equals(personaBD))
                continue; //las sentencias de abajo no se ejecuta, se va arriba y sigue el bucle
            String sql = " INSERT INTO usuarios (nombre, edad, dni) VALUES ('" + persona.getNombrePersona()
                    + "'," + persona.getEdad() + ",'" + persona.getDni() + "');";
            sentencia.executeUpdate(sql);
        }
        if (sentencia != null)
            sentencia.close();

    }

    private static List<Persona> crearListaPersonas() {
        
        List<Persona> lista = new ArrayList<>();
        String sOpcion = "";
        do {
            System.out.println("Introduce número de personas a dar de alta, de 1 a 10 máximo");
            System.out.println("En caso de cero, significa que no quieres dar de alta usuarios");
            sOpcion = sc.nextLine();
        } while (!sOpcion.matches("[0-9]|10"));
        int iOpcion = Integer.parseInt(sOpcion);
        if (iOpcion == 0)
            return lista;
        for (int i = 0; i < iOpcion; i++) {
            System.out.println("Introduce los datos de la  persona " + (i + 1));
            String nombre = solicitarNombre();
            int edad = solicitarEdad();
            String dni = solictarDni();
            Persona persona = new Persona(nombre, edad, dni);
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
