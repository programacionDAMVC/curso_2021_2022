package teoria.excepcionesPropias;

public class TrianguloRectangulo {
    //atributos
    private float cateto1;
    private float cateto2;
    private float hipotenusa;
    //resto de código
    //constructor
    public TrianguloRectangulo(float cateto1, float cateto2, float hipotenusa) throws NoTrianguloRectanguloException {
        if ( esTrianguloRectangulo(cateto1, cateto2, hipotenusa) ) {
            this.cateto1 = cateto1;
            this.cateto2 = cateto2;
            this.hipotenusa = hipotenusa;
        } else {
            //lanzamos la excepción
            throw new NoTrianguloRectanguloException(
                    String.format("se incumple el teorema de pitágoras con los valores %.2f, %.2f y %.2f",
                            cateto1, cateto2, hipotenusa));
        }
    }

    private boolean esTrianguloRectangulo(float cateto1, float cateto2, float hipotenusa) {
        return Math.round((hipotenusa * hipotenusa) * 10) ==
                Math.round((cateto1 * cateto1 + cateto2 * cateto2) * 10);
    }

    //getters
    public float getCateto1() {
        return cateto1;
    }
    public float getCateto2() {
        return cateto2;
    }
    public float getHipotenusa() {
        return hipotenusa;
    }
    //para escribirlo en un csv  1;1.2;6  cateto1;cateto2;hipotenusa
    @Override
    public String toString() {
        return String.format("%.2f;%.2f;%.2f", cateto1, cateto2, hipotenusa);
    }
}
