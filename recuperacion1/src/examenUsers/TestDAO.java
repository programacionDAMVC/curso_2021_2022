package examenUsers;

import examenUsers.dao.User;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestDAO {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        try {
            UserDAO dao = new UserDAOImp();
/*            Map<Integer, User> map = dao.obtenerTodosLosDatos();
            Set<Integer> claves = map.keySet();
            for (int key: claves) {
               System.out.println(map.get(key));
            }
            System.out.println("Pulsa una tecla");
            sc.next();
            List<User> lista = dao.obtenerMayoresEdad();
            for (User user: lista) {
                System.out.println(user);
            }
            System.out.println("Pulsa una tecla");
            sc.nextLine();
            boolean borrado = dao.borrarUsuarioPorId(999);
            System.out.printf("borrado: %B%n", borrado);
            System.out.println("Pulsa una tecla");
            sc.next();
            System.out.println("guardon en fichero");
            dao.volvarDatosFichero(map, "datosUsers.txt");
            System.out.println("---------------------------");*/
            for (int i = 0; i < 100_000; i++) {
                System.out.println(dao.obtenerUsuarioAleatoriamente());

            }
        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }
}
