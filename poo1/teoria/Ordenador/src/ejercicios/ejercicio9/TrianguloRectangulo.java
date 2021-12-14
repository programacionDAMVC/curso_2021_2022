package ejercicios.ejercicio9;

public class TrianguloRectangulo {
    //atributos
    private int cateto1;
    private int cateto2;
    //en este caso particular no usamo constructor (culpable Dani)
    //esto implica que necesito setters
    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }
    //puedo o no puedo poner getter (no hace falta mostrar el valor de los catetos)
    //calcular hipotenusa
    public int calcularHipotenusa (){
        return (int) Math.round(Math.hypot(cateto1, cateto2));
        //return (int) Math.round(Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2));
    }
    public float calcuarArea () {
        return cateto1 * cateto2 / 2.0f;
    }
    public int calcularPerimetro () {
        return cateto1 + cateto2 + calcularHipotenusa();
    }
}
