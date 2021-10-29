import java.util.ArrayList;
import java.util.Random;
/**
 * Esta clase define objetos que contienen enteros aleatorios entre 0 y 1000 
 * @author Mario R. Rancel
 * @version 22/09/2016/A
 * @see <a href = "http://www.aprenderaprogramar.com" /> aprenderaprogramar.com 
 */

public class SerieDeAleatoriosD {
    //Campos de la clase, comentario de línea
    private ArrayList<Integer> serieAleatoria;

    /**
     * Constructor para la serie de números aleatorios
     *
     * @param numeroItems El parámetro numeroItems define el número de elementos que va a tener
     */
    public SerieDeAleatoriosD(int numeroItems) {
        serieAleatoria = new ArrayList<Integer>();
        for (int i = 0; i < numeroItems; i++) {
            serieAleatoria.add(0);
        }
        System.out.println("Serie inicializada. El número de elementos en la serie es: " + serieAleatoria.size());
    } //Cierre del constructor

    /**
     * Método que devuelve el número de ıtems (números aleatorios) existentes en la serie
     *
     * @return El número de items (números aleatorios) de que consta la serie
     */
    public int getNumeroItems() {
        return serieAleatoria.size();
    }

    /**
     * Método que genera la serie de números aleatorios
     */
    public void generarSerieDeAleatorios() {
        Random numAleatorio;
        numAleatorio = new Random();
        for (int i = 0; i < serieAleatoria.size(); i++) {
            serieAleatoria.set(i, numAleatorio.nextInt());
            System.out.print("Serie generada! ");
        } //Cierre del método

    } //Cierre de la clase y del ejemplo aprenderaprogramar.com
}
