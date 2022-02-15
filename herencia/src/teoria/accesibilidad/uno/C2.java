package teoria.accesibilidad.uno;

public class C2 {
    private C1 c1 = new C1();
    public void llamarMétodosdeC1() {
        c1.metodoProtected();
        c1.metodoPackage();
        c1.metodoPublico();
    }

    public static void main(String[] args) {
        C2 c2 = new C2();
        c2.llamarMétodosdeC1();
    }
}
