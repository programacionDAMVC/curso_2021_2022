package examenUsers.auxiliar;

public class Helper {
    //formato 1 ó mas caracteres@1 o 1 ó mas caracteres(no números).seguido com o net o es
    public static boolean validarEmail(String email) {
        return email.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|net|es)");
    }

    public static void main(String[] args) {
        System.out.println(validarEmail("manolo1@manolo1"));
    }
}
