package teoria.accesibilidad.uno;

public class C3 extends C1{
    public void llamarMétodosdeC1() {
        metodoProtected();
        metodoPackage();
        metodoPublico();
    }

    public static void main(String[] args) {
        C3 c3 = new C3();
        c3.llamarMétodosdeC1();
    }
}
