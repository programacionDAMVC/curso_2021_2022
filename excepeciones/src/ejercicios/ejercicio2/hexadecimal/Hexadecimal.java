package ejercicios.ejercicio2.hexadecimal;

public class Hexadecimal {
    private String valor;

    public Hexadecimal(String valor) throws HexadecimalException {
        if (siEsHexadecimal(valor))
            this.valor = valor;
        else
            throw new HexadecimalException();
    }

    private boolean siEsHexadecimal(String valor) {
        return valor.toLowerCase().matches("[0-9abcdef]+");
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("Hexadecimal: %s, Decimal %d",
                valor.toLowerCase(), convertirADecimal());
    }
    public int convertirADecimal() {
        int suma = 0;
        StringBuilder stringBuilder = new StringBuilder(valor.toLowerCase());
        stringBuilder.reverse();
        String rValor = stringBuilder.toString();
        for (int i = 0; i < rValor.length(); i++) {
            char cDigito = rValor.charAt(i);
            switch (cDigito){
                case 'a', 'b', 'c', 'd', 'e', 'f':
                    suma += (cDigito - 87) * Math.pow(16, i);
                    break;
                default:
                    suma += (cDigito - 48) * Math.pow(16, i);
                    break;
            }
        }
        return suma;
    }
    public int convertirADecimal1() {
        return Integer.parseInt(valor, 16);
    }
}
