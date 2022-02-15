package teoria.accesibilidad.dos;

import teoria.accesibilidad.uno.C1;

public class C5 {
    private C1 c1 = new C1();
    public void llamarMétodosdeC1() {
        c1.metodoPublico();
    }

    public static void main(String[] args) {
        C5 c5 = new C5();
        c5.llamarMétodosdeC1();
    }
}
