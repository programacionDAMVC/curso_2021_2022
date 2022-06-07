package Ejercicio3;

public class DNIException extends Exception{
    @Override
    public String getMessage() {
        return "dni no válido";
    }
}
