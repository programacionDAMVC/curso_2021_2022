package miscelanea.diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CrearDiccionario {

    private Map<Integer, String> diccionario = new HashMap<>();

    public Map<Integer, String> getDiccionario() {
        return diccionario;
    }

    public String addDatos(int clave, String valor) {
        return  diccionario.put(clave, valor);
    }

    /*
    1.- cadena .... 1 es la clave y cadena el valor
    2.- cadena .... 2 es la clave y cadena el valor
     */
    @Override
    public String toString() {
        Set<Integer> claves = diccionario.keySet();
        StringBuilder stringBuilder = new StringBuilder();
        for (int clave : claves) {
            stringBuilder.append(clave);
            stringBuilder.append(".- ");
            stringBuilder.append(diccionario.get(clave));
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
