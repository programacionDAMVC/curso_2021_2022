package modelo.dao.usuario;

import java.sql.SQLException;

public class TestUsuarioDAO {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAOImpl();
        /*Usuario usuario = new Usuario("luis", "pérez", "953222222",
                "11111212h", "email2@correo.com", "contraseña");

        try {
            //comprobar si el usuario ya existe
            //buscamos usuario por dni
           *//* Usuario usuarioBD = dao.buscarUsuarioPorDni(usuario.getDni());
            if (usuarioBD == null) {
                Usuario newUsuario = dao.crearUsuario(usuario);
                System.out.printf("Creado usuario %s%n", newUsuario);
            }*//*
            //listar todos los usuarios
            List<Usuario> listaUsuarios = dao.obtenerTodosUsuarios();
            listaUsuarios.forEach(System.out::println);
            String dni = "22222222h";
            Usuario newUsuario = new Usuario("luis", "pérez", "953222222",
                    "22222222h", "email2@correo.com", "00000000");
            newUsuario.setRol(1);
            boolean exitoActualizacion = dao.actualizarUsuarioPorDNI(dni, newUsuario);
            System.out.printf("Actualizado usuario %s: %B%n", newUsuario, exitoActualizacion);

            boolean exitoBorrado = dao.eliminarUsuarioPorDNI(dni);
            System.out.printf("Borrado usuario  con dni %s: %B%n", dni, exitoBorrado);

        try {
            String email = "email@correo.es";
            String password = "djfdjfljdkf";
            Usuario usuarioLogueado = dao.loguearUsuarios(email, password);
            String  mensaje = usuarioLogueado != null ? "bienvenido" : "no existe usuario";
            System.out.println(mensaje);

            //semana santa: llamar a los tres métodos nuevos de la interfaz y al del borrado
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Error de servidor");
        }*/
        String path = "copia1.csv";
     //   boolean exitoGuardadoFichero = dao.mandarDatosAFichero(path);
     //   System.out.printf("Creado fichero FICHEROS/%s %B%n", path, exitoGuardadoFichero);
        boolean exitoGuardadoBD = dao.guardarDatosBD(path);
        System.out.printf("Guardado en la BD datos de fichero FICHEROS/%s %B%n", path, exitoGuardadoBD);
        /*boolean existeEmailODni = ((UsuarioDAOImpl) dao).existeEmailOdni("01234567", "email@correo.es");
        System.out.printf("Existen datos: %B%n", existeEmailODni);*/
    }
}
