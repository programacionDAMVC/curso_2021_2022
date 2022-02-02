package teoria.excepcionesPropias;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        //testeamos triángulos rectángulos
        try {
            TrianguloRectangulo t1 = new TrianguloRectangulo(3, 4, 5);
            System.out.println(t1);
        } catch (NoTrianguloRectanguloException e) {
            //e.printStackTrace();
            System.out.println("No se puede crear triángulo rectángulo");
        }

        try {
            TrianguloRectangulo t2 = new TrianguloRectangulo(12, 6, 13.42f);
            System.out.println(t2);
        } catch (NoTrianguloRectanguloException e) {
           // e.printStackTrace();
            System.out.println("No se puede crear triángulo rectángulo");
        }

    }
}
