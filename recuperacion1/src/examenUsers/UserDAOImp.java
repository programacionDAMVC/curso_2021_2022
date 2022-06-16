package examenUsers;

import examenUsers.conexion.Conexion;
import examenUsers.dao.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

public class UserDAOImp implements UserDAO{
    private Connection connection ;

    public UserDAOImp() throws SQLException {
        connection = Conexion.getConexion().getConnection();
    }
    //1000|Valina Kerner|21|vkernerrr@nasa.gov|Female
    //K(Integer ó int) V(User)
    @Override
    public Map<Integer, User> obtenerTodosLosDatos() throws SQLException {
        Map<Integer, User> map = new HashMap<>();
        String sql = "SELECT * FROM users;";
        Statement sentencia = connection.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next()){
            int key         = resultado.getInt("id");
            String fullName = resultado.getString("fullNname");
            int age         = resultado.getInt("age");
            String email    = resultado.getString("email");
            String gender   = resultado.getString("gender");
            User user = new User(fullName, age, email, gender);
            map.put(key, user);
        }
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return map;
    }

    @Override
    public List<User> obtenerMayoresEdad() throws SQLException {
        List<User> lista = new ArrayList<>();
        String sql = "select * FROM users WHERE age >= 18;";
        Statement sentencia = connection.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next()){
            String fullName = resultado.getString("fullNname");
            int age         = resultado.getInt("age");
            String email    = resultado.getString("email");
            String gender   = resultado.getString("gender");
            User user = new User(fullName, age, email, gender);
            lista.add(user);
        }
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return lista;
    }

    @Override
    public boolean borrarUsuarioPorId(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?;";
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setInt(1, id);
        int rows = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return rows != 0;
    }

    @Override
    public void volvarDatosFichero(Map<Integer, User> map, String path) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FICHEROS/");
        stringBuilder.append(path);
        File outFile = new File(stringBuilder.toString());
        PrintWriter out = new PrintWriter(outFile);
        Set<Integer> claves = map.keySet();
        for (int clave: claves) {
            out.println(map.get(clave));
            out.flush();
        }
        System.out.printf("Escritos %d bytes en el fichero %s%n", outFile.length(), outFile);
    }

    @Override
    public User obtenerUsuarioAleatoriamente() throws SQLException {
        Random random = new Random();
        Map<Integer, User> map = obtenerTodosLosDatos();
        System.out.printf("Tamaño de las claves: %d%n", map.size());
        int posicionAleatoria = random.nextInt(map.size());
        System.out.printf("Posición elegida: %d%n", posicionAleatoria);
        Set<Integer> claves = map.keySet();
        List<Integer> lista = claves.stream().toList();
        return map.get(lista.get(posicionAleatoria));
    }
}
