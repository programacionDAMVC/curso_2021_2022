package teoria.generalidades;

public class ClaseHija extends ClaseFinal1{
    private int numeroClase;
    @Override
    void metodoASobreescribir1() {
        System.out.println("método 1 de la clase hija");
    }


   /* @Override
    void metodoASobreescribir3() {
        System.out.println("método 2 de la clase hija");
    }  no se puede sobreescribir porque está declarado como final*/

    public static void main(String[] args) {
        //private int numeroMetodo = 5; la accesibilidad de atributo y métodos en las clase NO en métodos
        ClaseHija c = new ClaseHija();
        c.metodoASobreescribir1();
        c.metodoASobreescribir2();
    }
}
